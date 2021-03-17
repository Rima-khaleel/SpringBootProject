package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/add/{firstNumber}/{secondNumber}")
	public double addvariables(@PathVariable double firstNumber, @PathVariable double secondNumber) {
	
		return Calculator.add(firstNumber, secondNumber);

	}

}
