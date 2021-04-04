package io.fullstacklabs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("branches/second")
    public String getTestString() {
        return "You are currently on branch second: ";
    }
}
