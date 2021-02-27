package es.upm.dit.prog.practica5;

import java.util.List;
import java.util.ArrayList;

public class SelectorWiFi implements SelectorLocalizacion {
	
	WiFi red;
	double umbral;
	
	public SelectorWiFi(WiFi red, double umbral) {
		this.red = red;
		this.umbral = umbral;
	}
	
	public boolean esValida(Localizacion loc) {
		if(loc==null || red==null ) {
			return false;
		}
		List <Lectura> lc= loc.copiaDeLecturas();
		
		for(int n=0; n<lc.size(); n++) {
			if(lc.get(n).getPotencia()>=umbral && red.equals(lc.get(n).getRed())) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
}
