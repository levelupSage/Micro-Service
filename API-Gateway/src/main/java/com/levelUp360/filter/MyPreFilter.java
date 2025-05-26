package com.levelUp360.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Set;

@Component
public class MyPreFilter implements GlobalFilter {

    Logger logger = LoggerFactory.getLogger(MyPreFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        logger.info("filter() executed....");

        ServerHttpRequest serverHttpRequest = exchange.getRequest();

        HttpHeaders headers = serverHttpRequest.getHeaders();

        Set<String> keySet = headers.keySet();

        keySet.forEach(key -> {
            List<String> list = headers.get(key);
            System.out.println(key + "::" + list);
        });
        return chain.filter(exchange);
    }
}
