package com.example.demo.cita.service;

import java.time.LocalDateTime;

public interface ICitaMedicaService{
	public void agendar(String cedulaPaciente, String cedulaDoctor, LocalDateTime fechaCita, String numero);
}