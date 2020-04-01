package com.kodilla.spring.basic.spring_dependency_injectio;

import org.springframework.stereotype.Component;

@Component
public class FacebookMessageService implements MessageService {
    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Facebook.";
    }
}
