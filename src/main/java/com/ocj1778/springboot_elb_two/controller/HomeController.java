package com.ocj1778.springboot_elb_two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String main() {
        return "첫번째 서버의 메인페이지";
    }
}
