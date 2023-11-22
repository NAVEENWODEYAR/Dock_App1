package com.bhas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController 
{
	@GetMapping
	@ResponseStatus(code = HttpStatus.FOUND)
	public String greetMsg()
	{
		log.info("Logging");
		return "Welcome to "+"Dock Application 1,"+"";
	}
}
