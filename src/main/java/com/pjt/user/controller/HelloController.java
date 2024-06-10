package com.pjt.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User Controller", description = "사용자 관련 API")
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("")
public class HelloController {

    @Operation(summary = "Hello World", description = "Hello World")
    @GetMapping(value = "/hello")
    public String callHelloWorld() {
        return "Hello World";
    }
}
