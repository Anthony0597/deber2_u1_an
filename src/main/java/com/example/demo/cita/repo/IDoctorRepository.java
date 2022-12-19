package com.example.demo.cita.repo;

import com.example.demo.cita.modelo.Doctor;

public interface IDoctorRepository{
	//CRUD
	public void insertar(Doctor doctor);
	public Doctor buscar(String cedula);
	public void actulizar(Doctor doctor);
	public void eliminar(String cedula);
}