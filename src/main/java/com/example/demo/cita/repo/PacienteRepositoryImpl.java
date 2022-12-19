package com.example.demo.cita.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.Paciente;

@Repository
public class PacienteRepositoryImpl implements IPacienteRepository{
	
	private List<Paciente> base = new ArrayList<>();
	
	@Override
	public void insertar(Paciente paciente){
		base.add(paciente);
	}
	@Override
	public Paciente buscar(String cedula){
		Paciente paciente = null;
		for(Paciente p : base){
			if(p.getCedula().equals(cedula)){
				paciente = p;
			}
		}
		return paciente;
	}
	@Override
	public void actualizar(Paciente paciente){
		Paciente temp = null;
		for(Paciente p : base){
			if(p.getCedula().equals(paciente.getCedula())){
				temp = p;
			}
		}
		base.remove(temp);
		base.add(paciente);
	}
	@Override
	public void eliminar(String cedula){
		Paciente temp = null;
		for(Paciente p : base){
			if(p.getCedula().equals(cedula)){
				temp = p;
			}
		}
		base.remove(temp);
	}
}