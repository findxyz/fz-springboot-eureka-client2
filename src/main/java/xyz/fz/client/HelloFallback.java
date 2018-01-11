package xyz.fz.client;

import org.springframework.stereotype.Component;

@Component
public class HelloFallback implements HelloClient {
    @Override
    public String time() {
        return "make more time";
    }
}
