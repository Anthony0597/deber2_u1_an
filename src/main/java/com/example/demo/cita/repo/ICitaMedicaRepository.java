package com.example.demo.cita.repo;

import com.example.demo.cita.modelo.CitaMedica;

public interface ICitaMedicaRepository{
	//CRUD
	public void insertar(CitaMedica cita);
	public CitaMedica buscar(String numero);
	public void actulizar(CitaMedica cita);
	public void eliminar(String numero);
}