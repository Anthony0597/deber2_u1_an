package com.example.demo.cnegocio.modelo;

import java.time.LocalDateTime;

public class FichaRevision {
	private String numero;
	private LocalDateTime fecha;
	private String cAgente;
	private String placaAuto;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getcAgente() {
		return cAgente;
	}
	public void setcAgente(String cAgente) {
		this.cAgente = cAgente;
	}
	public String getPlacaAuto() {
		return placaAuto;
	}
	public void setPlacaAuto(String placaAuto) {
		this.placaAuto = placaAuto;
	}
	
	
}
