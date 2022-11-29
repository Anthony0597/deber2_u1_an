package com.example.demo.cnegocio.repo;

import com.example.demo.cnegocio.modelo.Vehiculo;

public interface IVehiculoRepository {
	//CRUD
	
		public Vehiculo buscar(String placa);
		public void actualizar(Vehiculo vehiculo);
		public void insertar(Vehiculo vehiculo);
		public void borrar(Integer id);
}
