package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class FichaRevisionSB {
	private String numero;
	private LocalDateTime fecha;
	private DuenioSB duenio;
	private AgenteRevisionSB agente;
	private VehiculoSB auto;


	public void revision(String numero, LocalDateTime fecha, DuenioSB DH, AgenteRevisionSB AH, VehiculoSB auto) {
		this.numero = numero;
		this.fecha = fecha;
		
		this.duenio = DH;
		
		this.agente = AH;
		
		this.auto = auto;

		guardar(this, auto.estadoRevision());

	}

	private void guardar(FichaRevisionSB ficha, boolean estado) {
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

	public DuenioSB getDuenio() {
		return duenio;
	}

	public void setDuenio(DuenioSB duenio) {
		this.duenio = duenio;
	}

	public AgenteRevisionSB getAgente() {
		return agente;
	}

	public void setAgente(AgenteRevisionSB agente) {
		this.agente = agente;
	}

	public VehiculoSB getAuto() {
		return auto;
	}

	public void setAuto(VehiculoSB auto) {
		this.auto = auto;
	}

	
}
