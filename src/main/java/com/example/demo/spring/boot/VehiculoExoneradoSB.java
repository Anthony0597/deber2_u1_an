package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class VehiculoExoneradoSB extends VehiculoSB{
	
	@Override
	public boolean estadoRevision() {
		System.out.println("Vehículo exonerado");
		return true;
	}
}
