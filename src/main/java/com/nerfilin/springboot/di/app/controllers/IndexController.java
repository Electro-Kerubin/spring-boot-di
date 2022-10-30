package com.nerfilin.springboot.di.app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nerfilin.springboot.di.app.models.service.IPrimerServicio;

@Controller
public class IndexController {
	
	@Autowired
	private IPrimerServicio servicio;
	
	@Autowired
	@Qualifier("servicioComplejoTest")
	private IPrimerServicio servicioComplejo;
	
	@Autowired
	@Qualifier("PrimerServicioBeanTest")
	private IPrimerServicio servicioBean;

	@RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		model.addAttribute("objetoComplejo", servicioComplejo.operacion());
		model.addAttribute("objetoBean", servicioBean.operacion());
		
		return "index";
	}

	/* Otras formas de implementar los beans.
	 * 
	 * Forma 1
	 * @Autowired 
	 * public void setServicio(IPrimerServicio servicio) { 
	 * 		this.servicio = servicio;
	 *  }
	 * 
	 * Forma 2
	 * @Autowired 
	 * public IndexController(IPrimerServicio servicio) { 
	 * 		this.servicio = servicio;
	 *  }
	 */
}
