package com.levi.microservicedemo.controller;

import com.levi.microservicedemo.service.DateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {
    Logger LOGGER = LoggerFactory.getLogger(DateController.class.getSimpleName());

    @Autowired
    DateService dateService;

    @GetMapping("/date")
    public String helloWorld() {
        LOGGER.info("Received date Request");
        return dateService.dateService();
    }
}
