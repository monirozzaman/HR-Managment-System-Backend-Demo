package com.ibcs.hmb.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public/")
public class TestController {

    @GetMapping("/status")
    public String getStatus()
    {
        return "APP 1: HR";
    }
}
