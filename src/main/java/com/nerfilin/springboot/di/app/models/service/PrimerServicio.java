package com.nerfilin.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("servicioTest")
@Primary
public class PrimerServicio implements IPrimerServicio {

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "Service implementado";
	}
	
	
}
