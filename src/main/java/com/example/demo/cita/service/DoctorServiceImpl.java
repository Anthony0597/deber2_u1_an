package com.example.demo.cita.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.Doctor;
import com.example.demo.cita.repo.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Override
	public void crear(Doctor doctor){
		this.doctorRepository.insertar(doctor);
	}
	@Override
	public Doctor buscar(String cedula){
		return this.doctorRepository.buscar(cedula);
	}
	@Override
	public void actulizar(Doctor doctor){
		this.doctorRepository.actulizar(doctor);
	}
	@Override
	public void borrar(String cedula){
		this.doctorRepository.eliminar(cedula);
	}
}