package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class DuenioSB {
	private String cedula;
	private String nombre;
		
	//GET Y SET
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
