package com.example.demo.cita.modelo;

import java.time.LocalDateTime;

public class Paciente{

	private String nombre;
	private String cedula;
	private LocalDateTime fechaNacimiento;

	@Override
	public String toString(){
		return "Paciente [cedula= "+ cedula +", nombre= "+ nombre +", Fecha de nacimiento="+ fechaNacimiento +"]";
	}

	//SET Y GET

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getCedula(){
		return cedula;
	}
	public void setCedula(String cedula){
		this.cedula=cedula;
	}

	public LocalDateTime getFechaNacimiento(){
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento){
		this.fechaNacimiento=fechaNacimiento;
	}
}