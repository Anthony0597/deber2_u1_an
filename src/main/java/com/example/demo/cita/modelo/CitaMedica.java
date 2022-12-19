package com.example.demo.cita.modelo;

import java.time.LocalDateTime;

public class CitaMedica{

	private String numero;
	private Doctor doctor;
	private Paciente paciente;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;

	@Override
	public String toString(){
		return "CitaMedica [numero= "+ numero +", Cedula Paciente = "+ paciente.getCedula() +", Nombre Paciente= "+ paciente.getNombre() 
		+", Doctor= "+ doctor.getNombre() +", Fecha de la cita= "+ fechaCita +"]";
	}

	//SET Y GET

	public String getNumero(){
		return numero;
	}
	public void setNumero(String numero){
		this.numero=numero;
	}

	public Doctor getDoctor(){
		return doctor;
	}
	public void setDoctor(Doctor doctor){
		this.doctor=doctor;
	}

	public Paciente getPaciente(){
		return paciente;
	}
	public void setPaciente(Paciente paciente){
		this.paciente=paciente;
	}

	public LocalDateTime getFechaCita(){
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita){
		this.fechaCita=fechaCita;
	}

	
	public LocalDateTime getFechaAgenda(){
		return fechaAgenda;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda){
		this.fechaAgenda=fechaAgenda;
	}
}