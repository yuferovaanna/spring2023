package com.spring2023.project.service;

import com.spring2023.project.repository.MyFirstRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyFirstService {
    private final MyFirstRepository repository;
}
