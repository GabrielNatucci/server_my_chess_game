package com.natuccischessserver.chess_server.websockets;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
@CrossOrigin
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
    private String url = "http://localhost:3000";

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/move_resp");
        config.setApplicationDestinationPrefixes("/app");
        WebSocketMessageBrokerConfigurer.super.configureMessageBroker(config);
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chess")
                .setAllowedOrigins(url)
                .withSockJS();
    }
}
