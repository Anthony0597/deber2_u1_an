package com.example.demo.cnegocio.repo;

import com.example.demo.cnegocio.modelo.FichaRevision;

public interface IFichaRevisioRepository {
	//CRUD
	
		public FichaRevision buscar(Integer id);
		public void actualizar(FichaRevision fichaRevision);
		public void insertar(FichaRevision fichaRevision);
		public void borrar(Integer id);
}
