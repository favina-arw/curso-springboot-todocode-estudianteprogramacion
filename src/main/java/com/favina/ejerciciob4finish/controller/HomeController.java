package com.favina.ejerciciob4finish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("")
public class HomeController {

    @GetMapping("")
    public String saludo() {
        return "<h1>Saludos desde el HomeController!</h1>";
    }

}