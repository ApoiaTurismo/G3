package br.com.apoiaturismo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apoiaT")
public class ApoiaController {

	@GetMapping
	public String apoia() 
	{
		return "Apoia Turismo";
	}
}
