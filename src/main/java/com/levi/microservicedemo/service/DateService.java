package com.levi.microservicedemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class DateService {

    public String helloService(String name) {
        log.info("Received Hello Request {}", name);
        return "hello " + name;
    }

    public String dateService() {
        log.info("Received date Request ");
        return "Current Date - " + new Date();
    }
}
