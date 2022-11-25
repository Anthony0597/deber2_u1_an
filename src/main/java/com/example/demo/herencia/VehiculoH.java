package com.example.demo.herencia;

public class VehiculoH {
	private String placa;
	private String numChasis;
	private String numMotor;
	
	// GET Y SET
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNumChasis() {
		return numChasis;
	}
	public void setNumChasis(String numChasis) {
		this.numChasis = numChasis;
	}
	public String getNumMotor() {
		return numMotor;
	}
	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}
	
	public boolean estadoRevision() {
		return false;
	}
}
