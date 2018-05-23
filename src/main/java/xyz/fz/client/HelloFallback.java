package xyz.fz.client;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HelloFallback implements HelloClient {
    @Override
    public String time(Map params) {
        return "make more time";
    }
}
