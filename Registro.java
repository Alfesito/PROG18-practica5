package es.upm.dit.prog.practica5;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Registro {

	List <Localizacion> locs;
	
	@Override
	public String toString() {
		return "Registro [locs=" + locs + "]";
	}

	public Registro () {
		this.locs=new ArrayList<>();
	}

	public boolean add(Localizacion l) {
		if(l==null) {
		return false;
		}
		
		return locs.add(l);
	}
	
	public Localizacion getLocalizacion(int n) {
		if((n>=0) && (n<locs.size())) {
			return locs.get(n);
		}
		return null;
	}
	
	/*Localizacion []getLocalizacionesCercanas(Coordenada c, double d){
		if(c==null) {
			return new Localizacion [0];
		}
		int cont=0;
		for(Localizacion lc:locs) {
			if((lc!=null) && (d>=(lc.getC().distancia(c)))) {
			cont++;
			}
		}
		Localizacion [] cercano= new Localizacion [cont];
		int i=0;
		for(Localizacion lc:locs) {
			if((lc!=null) && (d>=(lc.getC().distancia(c)))) {
				cercano[i]=lc;
				i++;
			}
		}
		return cercano;
	}*/
	
	public List <Localizacion> getLocalizaciones(SelectorLocalizacion s) {
		List <Localizacion> array= new ArrayList <>();
		if(s==null) {
			return array;
		}
		for(Localizacion lc:locs) {
			if(s.esValida(lc)) {
				array.add(lc);
			}
		}
		return array;
	}
	
	
	
}
	

