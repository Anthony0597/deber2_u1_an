package com.example.demo.herencia;

public class VehiculoExoneradoH extends VehiculoH{
	
	@Override
	public boolean estadoRevision() {
		System.out.println("Vehículo exonerado");
		return true;
	}
}
