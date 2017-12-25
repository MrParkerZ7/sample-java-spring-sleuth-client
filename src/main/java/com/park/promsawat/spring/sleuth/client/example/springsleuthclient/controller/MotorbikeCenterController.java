package com.park.promsawat.spring.sleuth.client.example.springsleuthclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/buy")
public class MotorbikeCenterController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MotorbikeCenterController.class);

    private RestTemplate restTemplate;

    @GetMapping("/{bike}")
    public String getbike(@PathVariable("bike") final String bike) {
        restTemplate.getForObject("http://localhost:8085/factory/oder/" + bike, String.class);
        return null;
    }
}
