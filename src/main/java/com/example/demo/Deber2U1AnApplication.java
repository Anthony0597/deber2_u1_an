package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.herencia.AgenteRevisionH;
import com.example.demo.herencia.DuenioH;
import com.example.demo.herencia.FichaRevisionH;
import com.example.demo.spring.boot.*;

@SpringBootApplication
public class Deber2U1AnApplication implements CommandLineRunner{
	
	@Autowired
	private VehiculoNormalSB auto;
	@Autowired
	private AgenteRevisionSB agente;
	@Autowired
	private DuenioSB duenio;
	@Autowired
	private FichaRevisionSB ficha;

	public static void main(String[] args) {
		SpringApplication.run(Deber2U1AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring boot");
		
		auto.setNumChasis("16s4-1e95-64f21");
		auto.setNumMotor("16s4-1e95-64f21");
		auto.setPlaca("PMA-4897");
		auto.setAlineacion(true);
		auto.setFrenos(false);
		auto.setGases(true);
		auto.setLuces(true);
		
		//DuenioSB duenio = new DuenioSB();
		duenio.setCedula("1245785689");
		duenio.setNombre("Pepito Perez");
		
		agente.setCedula("1346791546");
		agente.setNombre("Manuel Garcia");
		agente.setCodigo("35784-MG");
		
		ficha.revision("16458", LocalDateTime.now(), duenio, agente, auto);
	}

}
