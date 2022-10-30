package com.nerfilin.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nerfilin.springboot.di.app.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private Factura factura;
	
	@RequestMapping(value = "/ver")
	public String ver(Model model) {
		
		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Ejemplo factura con inyeccion de dependencia");
		
		return "factura/ver";
	}
}
