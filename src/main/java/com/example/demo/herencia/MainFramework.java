package com.example.demo.herencia;

import java.time.LocalDateTime;


public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*VehiculoExoneradoH autoObj = new VehiculoExoneradoH();
		autoObj.setNumChasis("16s4-1e95-64f21");
		autoObj.setNumMotor("16s4-1e95-64f21");
		autoObj.setPlaca("PMA-4897");*/
		
		VehiculoNormalH autoObj = new VehiculoNormalH();
		autoObj.setNumChasis("16s4-1e95-64f21");
		autoObj.setNumMotor("16s4-1e95-64f21");
		autoObj.setPlaca("PMA-4897");
		autoObj.setAlineacion(true);
		autoObj.setFrenos(false);
		autoObj.setGases(true);
		autoObj.setLuces(true);
		
		DuenioH duenioObj = new DuenioH();
		duenioObj.setCedula("1245785689");
		duenioObj.setNombre("Pepito Perez");
		
		AgenteRevisionH agenteObj = new AgenteRevisionH();
		agenteObj.setCedula("1346791546");
		agenteObj.setNombre("Manuel Garcia");
		agenteObj.setCodigo("35784-MG");
		
		FichaRevisionH ficha = new FichaRevisionH();
		ficha.revision("16458", LocalDateTime.now(), duenioObj, agenteObj, autoObj);
	}

}
