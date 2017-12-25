package com.park.promsawat.spring.sleuth.client.example.springsleuthclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/showroom/buy")
public class MotorbikeCenterController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MotorbikeCenterController.class);

    // Instant RestTemplate to
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{bike}")
    public String getBike(@PathVariable("bike") final String bike) {

        LOGGER.info("Before calling server");

        // Get Object from url another server to return or process before return
        String response = restTemplate.getForObject("http://localhost:8085/factory/order/" + bike, String.class);

        LOGGER.info("After calling server");

        return response; //return back
    }
}
