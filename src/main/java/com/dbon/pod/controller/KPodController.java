package com.dbon.pod.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kpod")
public class KPodController {

    @GetMapping("/action")
    public String doIt(@RequestBody String input) {

        return input;
    }
}