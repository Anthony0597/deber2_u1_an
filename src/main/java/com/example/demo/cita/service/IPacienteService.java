package com.example.demo.cita.service;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteService{
	//CRUD
	public void crear(Paciente paciente);
	public Paciente buscar(String cedula);
	public void actulizar(Paciente paciente);
	public void borrar(String cedula);
}