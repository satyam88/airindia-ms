package com.example.airindia;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.GetMapping;

public class vistra {
    @GetMapping("/vistra_airlines")
    public String getData(){
        return "Please book your airlines ticket on Vistra Airlines";
    }
}