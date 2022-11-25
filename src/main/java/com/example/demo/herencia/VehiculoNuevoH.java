package com.example.demo.herencia;

public class VehiculoNuevoH extends VehiculoH{
	@Override
	public boolean estadoRevision() {
		System.out.println("Vehículo nuevo");
		return true;
	}
}
