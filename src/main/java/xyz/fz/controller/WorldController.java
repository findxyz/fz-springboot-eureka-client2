package xyz.fz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fz.client.HelloClient;

@RestController
@RequestMapping("/world")
public class WorldController {

    private final HelloClient helloClient;

    @Autowired
    public WorldController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @RequestMapping("/timeFromHello")
    public String timeFromHello() {
        return helloClient.time();
    }
}
