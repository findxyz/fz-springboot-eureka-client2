package xyz.fz.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("EUREKA-HELLO-CLIENT")
public interface HelloClient {

    @RequestMapping("/hello/time")
    String time();
}
