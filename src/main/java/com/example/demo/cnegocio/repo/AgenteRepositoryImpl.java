package com.example.demo.cnegocio.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cnegocio.modelo.Agente;

@Repository
public class AgenteRepositoryImpl implements IAgenteRepository{

	private static List<Agente> baseAgentes = new ArrayList<>();
	
	@Override
	public Agente buscarPorCodigo(String cAgente) {
		Agente agente = new Agente();
		agente.setCedula("1346791546");
		agente.setNombre("Manuel Garcia");
		agente.setCodigo("35784-MG");
		return agente;
	}

	@Override
	public Agente buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Agente agente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Agente agente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
