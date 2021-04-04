package io.fullstacklabs.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("branches/{id}")
    public String getTestString(@PathVariable int id) {
        return "You are currently on branch #: " + id;
    }
}
