package com.nerfilin.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

@Service("servicioComplejoTest")
public class PrimerServicioComplejo implements IPrimerServicio {

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "Service implementado complejo";
	}
	

}
