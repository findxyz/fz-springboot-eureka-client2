package xyz.fz.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

@Primary
@FeignClient(value = "EUREKA-HELLO-PROVIDER-CLIENT", fallback = HelloFallback.class)
public interface HelloClient {

    @RequestMapping("/hello/time")
    String time();
}
