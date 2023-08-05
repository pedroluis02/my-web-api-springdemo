package com.github.pedroluis02.webapidemo.api.controller;

import com.github.pedroluis02.webapidemo.api.model.HelloGreeting;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingController {
    @GetMapping("/hello")
    public ResponseEntity<HelloGreeting> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return createResponseMessage(name);
    }

    @GetMapping(value = "/hello-xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<HelloGreeting> greetingXml(@RequestParam(value = "name", defaultValue = "World in XML") String name) {
        return createResponseMessage(name);
    }

    private ResponseEntity<HelloGreeting> createResponseMessage(String name) {
        var entity = new HelloGreeting(String.format("Hello %s!", name));
        return ResponseEntity.ok(entity);
    }
}
