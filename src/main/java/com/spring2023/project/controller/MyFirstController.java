package com.spring2023.project.controller;

import com.spring2023.project.service.MyFirstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MyFirstController {
    private final MyFirstService service;

}
