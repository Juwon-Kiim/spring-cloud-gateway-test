package com.example.scg.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRoute {

    @Bean
    public RouteLocator cRoute(RouteLocatorBuilder builder){
        return builder.routes()
                .route("client1", r->r.path("/client1/**")
                        .uri("http://localhost:8081"))
                .route("client2", r->r.path("/client2/**")
                        .uri("http://localhost:8082"))
                .build();
    }
}
