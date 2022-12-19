package com.example.demo.cita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import com.example.demo.cita.repo.ICitaMedicaRepository;
import com.example.demo.cita.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepository citaRepository;
	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IDoctorService doctorService;

	@Override
	public void agendar(String cedulaPaciente, String cedulaDoctor, LocalDateTime fechaCita, String numero){
		CitaMedica cita = new CitaMedica();
		cita.setNumero(numero);
		cita.setDoctor(this.doctorService.buscar(cedulaDoctor));
		cita.setPaciente(this.pacienteService.buscar(cedulaPaciente));
		cita.setFechaAgenda(LocalDateTime.now());
		cita.setFechaCita(fechaCita);
		this.citaRepository.insertar(cita);
		System.out.println("Se registró la cita: "+ cita);
	}
}