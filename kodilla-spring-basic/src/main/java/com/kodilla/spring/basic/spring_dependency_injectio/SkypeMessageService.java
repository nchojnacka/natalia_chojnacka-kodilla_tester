package com.kodilla.spring.basic.spring_dependency_injectio;

import org.springframework.stereotype.Component;

@Component
public class SkypeMessageService implements MessageService{

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype.";
    }
}
