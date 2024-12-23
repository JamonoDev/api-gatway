package com.jamonodev.api_gatway.routes;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {
    @Bean
    RouterFunction<ServerResponse> userServiceRoute(){
        return GatewayRouterFunctions.route("service-user")
                .route(RequestPredicates.path("/api/users"), HandlerFunctions.http("http://localhost:8083"))
                .route(RequestPredicates.path("/api/users/archive/*"), HandlerFunctions.http("http://localhost:8083"))
                .route(RequestPredicates.GET("/api/users/email/*"), HandlerFunctions.http("http://localhost:8083"))
                .route(RequestPredicates.GET("/api/users/role/*"), HandlerFunctions.http("http://localhost:8083"))
                .route(RequestPredicates.path("/api/users/*"), HandlerFunctions.http("http://localhost:8083"))
                .build();
    }
    @Bean
    RouterFunction<ServerResponse> roleServiceRoute(){
        return GatewayRouterFunctions.route("service-user")
                .route(RequestPredicates.path("/api/roles"), HandlerFunctions.http("http://localhost:8083"))
                .route(RequestPredicates.GET("/api/roles/name/*"), HandlerFunctions.http("http://localhost:8083"))
                .route(RequestPredicates.path("/api/roles/*"), HandlerFunctions.http("http://localhost:8083"))
                .build();
    }
}
