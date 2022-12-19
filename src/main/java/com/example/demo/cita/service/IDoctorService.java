package com.example.demo.cita.service;

import com.example.demo.cita.modelo.Doctor;

public interface IDoctorService{
	//CRUD
	public void crear(Doctor doctor);
	public Doctor buscar(String cedula);
	public void actulizar(Doctor doctor);
	public void borrar(String cedula);
}