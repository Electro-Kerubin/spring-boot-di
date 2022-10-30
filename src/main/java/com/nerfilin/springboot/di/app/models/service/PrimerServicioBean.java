package com.nerfilin.springboot.di.app.models.service;

public class PrimerServicioBean implements IPrimerServicio{

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "Servicio ejecutado con @Bean";
	}

}
