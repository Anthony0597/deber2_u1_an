package com.example.demo.cnegocio.repo;

import com.example.demo.cnegocio.modelo.Agente;

public interface IAgenteRepository {
	public Agente buscarPorCodigo(String cAgente);
	
	//CRUD
	
	public Agente buscar(Integer id);
	public void actualizar(Agente agente);
	public void insertar(Agente agente);
	public void borrar(Integer id);
}
