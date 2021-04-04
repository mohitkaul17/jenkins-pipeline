package io.fullstacklabs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/branches/first")
    public String testBranch() {
        return "you are on fist branch";
    }

}
