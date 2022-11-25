package com.example.demo.herencia;

public class VehiculoNormalH extends VehiculoH{

	private boolean alineacion,frenos, luces, gases;
	
		
	public boolean getAlineacion() {
		return alineacion;
	}

	public void setAlineacion(boolean alineacion) {
		this.alineacion = alineacion;
	}

	public boolean getFrenos() {
		return frenos;
	}

	public void setFrenos(boolean frenos) {
		this.frenos = frenos;
	}

	public boolean getLuces() {
		return luces;
	}

	public void setLuces(boolean luces) {
		this.luces = luces;
	}

	public boolean getGases() {
		return gases;
	}

	public void setGases(boolean gases) {
		this.gases = gases;
	}
	

	@Override
	public boolean estadoRevision() {
		// TODO Auto-generated method stub
		if(alineacion & frenos & luces & gases) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
