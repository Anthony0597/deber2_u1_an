package com.example.demo.cita.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	
	private List<CitaMedica> base = new ArrayList<>();
	
	@Override
	public void insertar(CitaMedica citaMedica){
		base.add(citaMedica);
	}
	@Override
	public CitaMedica buscar(String numero){
		CitaMedica citaMedica = null;
		for(CitaMedica c : base){
			if(c.getNumero().equals(numero)){
				citaMedica = c;
			}
		}
		return citaMedica;
	}
	@Override
	public void actulizar(CitaMedica citaMedica){
		CitaMedica temp = null;
		for(CitaMedica c : base){
			if(c.getNumero().equals(citaMedica.getNumero())){
				temp = c;
			}
		}
		base.remove(temp);
		base.add(citaMedica);
	}
	@Override
	public void eliminar(String numero){
		CitaMedica temp = null;
		for(CitaMedica c : base){
			if(c.getNumero().equals(numero)){
				temp = c;
			}
		}
		base.remove(temp);
	}
}