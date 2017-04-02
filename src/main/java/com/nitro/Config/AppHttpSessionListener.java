package com.nitro.Config;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Component
public class AppHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        event.getSession().setMaxInactiveInterval(1);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        // session destroyed
    }
}