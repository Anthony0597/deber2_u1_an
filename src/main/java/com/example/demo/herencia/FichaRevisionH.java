package com.example.demo.herencia;

import java.time.LocalDateTime;

public class FichaRevisionH {
	private String numero;
	private LocalDateTime fecha;
	private DuenioH duenio;
	private AgenteRevisionH agente;
	private VehiculoH auto;


	public void revision(String numero, LocalDateTime fecha, DuenioH DH, AgenteRevisionH AH, VehiculoH auto) {
		this.numero = numero;
		this.fecha = fecha;
		
		this.duenio = DH;
		
		this.agente = AH;
		
		this.auto = auto;

		guardar(this, auto.estadoRevision());

	}

	private void guardar(FichaRevisionH ficha, boolean estado) {
		System.out.println("Ficha de revisíon guardada con éxito");
		System.out.println(this);
		if (estado) {
			System.out.println("Revisión aprobada");
		} else {
			System.out.println("Revisión no aprobada");
		}

	}

	@Override
	public String toString() {
		return "FichaRevision [numero=" + numero + ", fecha=" + fecha + ", Dueño=" + duenio.getNombre() + ", Agente="
				+ agente.getNombre() + ", auto=" + auto.getPlaca() + "]";
	}

	// GET Y SET
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

	public DuenioH getDuenio() {
		return duenio;
	}

	public void setDuenio(DuenioH duenio) {
		this.duenio = duenio;
	}

	public AgenteRevisionH getAgente() {
		return agente;
	}

	public void setAgente(AgenteRevisionH agente) {
		this.agente = agente;
	}

	public VehiculoH getAuto() {
		return auto;
	}

	public void setAuto(VehiculoH auto) {
		this.auto = auto;
	}

	
}
