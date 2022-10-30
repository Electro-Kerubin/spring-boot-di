package com.nerfilin.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.nerfilin.springboot.di.app.models.domain.ItemFactura;
import com.nerfilin.springboot.di.app.models.domain.Producto;
import com.nerfilin.springboot.di.app.models.service.IPrimerServicio;
import com.nerfilin.springboot.di.app.models.service.PrimerServicioBean;

@Configuration
public class AppConfig {
	
	// Se puede aplicar @Primary en el metodo
	@Bean("PrimerServicioBeanTest")
	public IPrimerServicio registrarServicio() {
		return new PrimerServicioBean();
	}
	
	@Bean("itemFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Cama", 100);
		Producto producto2 = new Producto("Almohada", 20);
		Producto producto3 = new Producto("Cubrecama", 70);
		
		ItemFactura linea1 = new ItemFactura(producto1, 3);
		ItemFactura linea2 = new ItemFactura(producto2, 5);
		ItemFactura linea3 = new ItemFactura(producto3, 3);
		
		return Arrays.asList(linea1, linea2, linea3);
	}
	
}
