package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.cita.modelo.CitaMedica;
import com.example.demo.cita.modelo.Doctor;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.service.ICitaMedicaService;
import com.example.demo.cita.service.IDoctorService;
import com.example.demo.cita.service.IPacienteService;



@SpringBootApplication
public class Deber2U1AnApplication implements CommandLineRunner{
	
	@Autowired
	private ICitaMedicaService citaService;
	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IDoctorService doctorService;

	public static void main(String[] args) {
		SpringApplication.run(Deber2U1AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Paciente paciente = new Paciente();
		paciente.setCedula("1346852978");
		paciente.setNombre("Anthony Naranjo");
		paciente.setFechaNacimiento(LocalDateTime.of(1995, 8, 6, 10, 0));
		this.pacienteService.crear(paciente);
		
		Doctor doctor = new Doctor();
		doctor.setCedula("1478632597");
		doctor.setNombre("Otto Octavius");
		doctor.setEspecialidad("Cirujano");
		this.doctorService.crear(doctor);
		
		this.citaService.agendar(paciente.getCedula(), doctor.getCedula(), LocalDateTime.of(2022, 12, 10, 17, 30), "163948");
	}

}
