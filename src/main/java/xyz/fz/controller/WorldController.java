package xyz.fz.controller;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fz.client.HelloClient;

import java.util.Map;

@RestController
@RequestMapping("/world")
public class WorldController {

    private final HelloClient helloClient;

    @Autowired
    public WorldController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @RequestMapping("/timeFromHello")
    @SuppressWarnings("unchecked")
    public String timeFromHello() {
        Map params = Maps.newHashMap();
        params.put("hello", "world");
        return helloClient.time(params);
    }
}
