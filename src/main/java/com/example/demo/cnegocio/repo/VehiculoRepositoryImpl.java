package com.example.demo.cnegocio.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cnegocio.modelo.Agente;
import com.example.demo.cnegocio.modelo.Vehiculo;


@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	private static List<Vehiculo> baseVehiculos = new ArrayList<>();
	
	@Override
	public Vehiculo buscar(String placa) {
		Vehiculo auto = new Vehiculo();
		auto.setNumChasis("16s4-1e95-64f21");
		auto.setNumMotor("16s4-1e95-64f21");
		auto.setPlaca("PMA-4897");
		return null;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
