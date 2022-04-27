package br.com.fiap.appcarro.carro.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("usuario", "Atividade 27/04");
		
		return "home";
	}

}