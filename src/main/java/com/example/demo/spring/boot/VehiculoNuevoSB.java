package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class VehiculoNuevoSB extends VehiculoSB{
	@Override
	public boolean estadoRevision() {
		System.out.println("Vehículo nuevo");
		return true;
	}
}
