package com.studiesproject.controller;

import com.studiesproject.model.User;
import com.studiesproject.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @GetMapping("/simpleForm")
    public String simpleForm(Map<String, Object> model) {
        model.put("users", welcomeService.getUsers());
        return "pageWithSimpleForm";
    }

    @PostMapping(value = "/simpleForm")
    public String simpleFormProcessing(Map<String, Object> model, @RequestParam Map<String, String> user) {
        welcomeService.processNameForm(new User(user.get("name")));
        model.put("users", welcomeService.getUsers());
        return "pageWithSimpleForm";
    }

}