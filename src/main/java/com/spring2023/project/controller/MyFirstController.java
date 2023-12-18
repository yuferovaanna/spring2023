package com.spring2023.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MyFirstController {
    private final MyFirstService service;

}
