package kz.bekzataitymov.projects.dockertest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @Value("${APP_NAME:Docker Demo}")
    private String appName;

    @GetMapping()
    public String hello() {
        return "Hello world";
    }
}
