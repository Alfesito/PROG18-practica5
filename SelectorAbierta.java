package es.upm.dit.prog.practica5;

import java.util.List;
import java.util.ArrayList;

public class SelectorAbierta implements SelectorLocalizacion {

	double umbral;

	public SelectorAbierta(double umbral) {
		this.umbral = umbral;
	}
	
	public boolean esValida (Localizacion loc) {
		List <Lectura> lc= loc.copiaDeLecturas(); 		//
		
		for(int i=0; i<lc.size(); i++) {
			if(lc.get(i)!=null && lc.get(i).getRed().getSeguridad()==Seguridad.ABIERTA && lc.get(i).getPotencia()>=umbral) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
