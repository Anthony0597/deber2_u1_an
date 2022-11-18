package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class FichaRevision {
	private String numero;
	private LocalDateTime fecha;
	private Duenio duenio;
	private AgenteRevision agente;
	private Vehiculo auto;

	private boolean alineacion, luces, frenos, gases;

	public void revision(String numero, LocalDateTime fecha, String nombreDuenio, String cedulaDuenio,
			String nombreAgente, String codigo, String cedulaAgente, String placa, String numChas, String numMotor,
			boolean alineacion, boolean luces, boolean frenos, boolean gases) {
		this.numero = numero;
		this.fecha = fecha;
		this.alineacion = alineacion;
		this.frenos = frenos;
		this.luces = luces;
		this.gases = gases;

		Duenio duenioObj = new Duenio();
		duenioObj.setCedula(cedulaDuenio);
		duenioObj.setNombre(nombreDuenio);
		this.duenio = duenioObj;

		AgenteRevision agenteObj = new AgenteRevision();
		agenteObj.setCedula(cedulaAgente);
		agenteObj.setNombre(nombreAgente);
		agenteObj.setCodigo(codigo);
		this.agente = agenteObj;

		Vehiculo autoObj = new Vehiculo();
		autoObj.setNumChasis(numChas);
		autoObj.setNumMotor(numMotor);
		autoObj.setPlaca(placa);
		this.auto = autoObj;
		guardar(this);

	}

	private void guardar(FichaRevision ficha) {
		System.out.println("Ficha de revisíon guardada con éxito");
		System.out.println(this);
		if (alineacion & frenos & luces & gases) {
			System.out.println("Revisión aprobada");
		}else {
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

	public Duenio getDuenio() {
		return duenio;
	}

	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}

	public AgenteRevision getAgente() {
		return agente;
	}

	public void setAgente(AgenteRevision agente) {
		this.agente = agente;
	}

	public Vehiculo getAuto() {
		return auto;
	}

	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}

	public boolean isAlineacion() {
		return alineacion;
	}

	public void setAlineacion(boolean alineacion) {
		this.alineacion = alineacion;
	}

	public boolean isLuces() {
		return luces;
	}

	public void setLuces(boolean luces) {
		this.luces = luces;
	}

	public boolean isFrenos() {
		return frenos;
	}

	public void setFrenos(boolean frenos) {
		this.frenos = frenos;
	}

	public boolean isGases() {
		return gases;
	}

	public void setGases(boolean gases) {
		this.gases = gases;
	}

}
