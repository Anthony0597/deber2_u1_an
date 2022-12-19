package com.example.demo.cita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repo.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Override
	public void crear(Paciente paciente){
		this.pacienteRepository.insertar(paciente);
	}
	@Override
	public Paciente buscar(String cedula){
		return this.pacienteRepository.buscar(cedula);
	}
	@Override
	public void actulizar(Paciente paciente){
		this.pacienteRepository.actualizar(paciente);
	}
	@Override
	public void borrar(String cedula){
		this.pacienteRepository.eliminar(cedula);
	}
}