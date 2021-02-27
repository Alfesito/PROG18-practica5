package es.upm.dit.prog.practica5;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Localizacion {
		
		private Coordenada c;
		private List <Lectura> lecturas;
		
	public Localizacion (Coordenada c){
		this.c=c;
		this.lecturas=new ArrayList<>() ;
	}

	@Override
	public String toString() {
		return "Localizacion [c=" + c + ", lecturas=" + lecturas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + ((lecturas == null) ? 0 : lecturas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localizacion other = (Localizacion) obj;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (lecturas == null) {
			if (other.lecturas != null)
				return false;
		} else if (!lecturas.equals(other.lecturas))
			return false;
		return true;
	}

	public Coordenada getC() {
		return c;
	}

	public void setC(Coordenada c) {
		this.c = c;
	}
	/*
	public void setLectura (Lectura l, int n){
		if ((n>=0) && (n<= lecturas.length-1)){
			lecturas[n]= l;
		}}*/
	
	public Lectura getLectura(int n) {
		if (n>=0 && n<= lecturas.size()-1){
			return lecturas.get(n);
		}else{ return null;}
	}
	/*	
	public void intercambia(int n1, int n2){
		
		if ((n1>=0 && n1<= lecturas.length-1) && (n2>=0 && n2<= lecturas.length-1)){
			Lectura ap= lecturas[n2];
			lecturas[n2]=lecturas[n1];
			lecturas[n1]=ap;
		}}*/
	
	
	public boolean addLectura(Lectura l) {
		if(l==null) {
			return false;
		}
		if(l!=null) {
			return lecturas.add(l);
		}
		return false;
	}
	
	/*
	private int getPosicionLectura (WiFi w) {
		if(w==null) {
			return -1;
		}
		for (int n=0; n<lecturas.length; n++) {
			if((lecturas[n]!=null) && (lecturas[n].getRed().equals(w))) {
			return n;
			}
		}
		return -1;
	}*/

	/*
	Lectura getLectura(WiFi w) {
		if(w==null) {
			return null;
	}else {
		
		for (int n=0; n<lecturas.length; n++) {	
			if((lecturas[n]!=null) && (lecturas[n].getRed().equals(w))) {
				return lecturas[n];
			}
		}
		return null;
	}}*/
	/*
	Lectura masPotente() {
		Lectura mx=null;
		for(Lectura l: lecturas){
			if( (l!=null) && (mx==null || mx.getPotencia()<l.getPotencia()) ){
				mx=l;
			}
		}
		return mx;
	}*/
	
	List <Lectura> copiaDeLecturas() {
		return this.lecturas;
	}
	/*
	void borraLectura(WiFi w) {
		int i = getPosicionLectura(w);
		if(i==-1) {
			return;
		}
		for(int n=i;n<lecturas.length-1;n++) {
			lecturas[n]=lecturas[n+1];
			}
		lecturas [lecturas.length-1]=null;
		
	}*/
	
	}
		
	
	

