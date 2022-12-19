package com.example.demo.cita.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.Doctor;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository{
	
	private List<Doctor> base = new ArrayList<>();
	
	@Override
	public void insertar(Doctor doctor){
		base.add(doctor);
	}
	@Override
	public Doctor buscar(String cedula){
		Doctor doctor = null;
		for(Doctor p : base){
			if(p.getCedula().equals(cedula)){
				doctor = p;
			}
		}
		return doctor;
	}
	@Override
	public void actulizar(Doctor doctor){
		Doctor temp = null;
		for(Doctor p : base){
			if(p.getCedula().equals(doctor.getCedula())){
				temp = p;
			}
		}
		base.remove(temp);
		base.add(doctor);
	}
	@Override
	public void eliminar(String cedula){
		Doctor temp = null;
		for(Doctor p : base){
			if(p.getCedula().equals(cedula)){
				temp = p;
			}
		}
		base.remove(temp);
	}
}