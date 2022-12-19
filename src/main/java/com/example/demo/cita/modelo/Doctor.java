package com.example.demo.cita.modelo;

public class Doctor{

	private String nombre;
	private String cedula;
	private String especialidad;

	@Override
	public String toString(){
		return "Doctor [cedula= "+ cedula +", nombre= "+ nombre +", Especialidad="+ especialidad +"]";
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

	public String getEspecialidad(){
		return especialidad;
	}
	public void setEspecialidad(String especialidad){
		this.especialidad=especialidad;
	}
}