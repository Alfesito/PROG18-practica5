package es.upm.dit.prog.practica5;

import java.util.List;
import java.util.Scanner;

public class PruebaLocalizacion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------------");
		System.out.println("Pruebas de puntos");
		Coordenada c1 = new Coordenada (0,0);
		Coordenada c2 = new Coordenada (10,0);
		Coordenada c3 = new Coordenada (0,10);
		Coordenada c4 = new Coordenada (10, 10);
		System.out.println ("c1="+c1);
		System.out.println ("c2="+c2);
		System.out.println ("c3="+c3);
		System.out.println ("c4="+c4);
		System.out.println ("c1.distancia(c1)="+c1.distancia(c1));
		System.out.println ("c1.distancia(c2)="+c1.distancia(c2));
		System.out.println ("c1.distancia(c3)="+c1.distancia(c3));
		System.out.println ("c1.distancia(c4)="+c1.distancia(c4));
		System.out.println ("c2.distancia(c1)="+c2.distancia(c1));
		System.out.println ("c2.distancia(c3)="+c2.distancia(c3));

		System.out.println("-----------------------");
		System.out.println("Pruebas de wifis");
		WiFi w0 = new WiFi ("WiFi0", Seguridad.ABIERTA);
		WiFi w1 = new WiFi ("WiFi1", Seguridad.ABIERTA);
		WiFi w2 = new WiFi ("WiFi2", Seguridad.WEP);
		WiFi w3 = new WiFi ("WiFi3", Seguridad.WPA2_EMPRESA);
		WiFi w4 = new WiFi ("WiFi4", Seguridad.ABIERTA);
		WiFi w5 = new WiFi ("WiFi5", Seguridad.WEP);
		WiFi w6 = new WiFi ("WiFi6", Seguridad.WPA2_EMPRESA);

		
		System.out.println("w0="+w0);
		System.out.println("w1="+w1);
		System.out.println("w2="+w2);
		System.out.println("w3="+w3);
		System.out.println("w4="+w4);
		System.out.println("w5="+w5);
		System.out.println("w6="+w6);

		
		
		System.out.println("-----------------------");
		System.out.println("Pruebas de equals");

		Coordenada ceq= new Coordenada (10,5);
		System.out.println("equals de Coordenadas="+ceq.equals(new Coordenada (10,5)));		

		WiFi weq= new WiFi ("WEq", Seguridad.ABIERTA );
		System.out.println("equals de WiFi="+weq.equals(new WiFi ("WEq", Seguridad.ABIERTA )));		

		Lectura lec= new Lectura (weq, -70.0 );
		System.out.println("equals de Lectura="+lec.equals(new Lectura (weq, -70.0 )));		

		System.out.println("-----------------------");
		System.out.println("Pruebas de localizacion");

		
		Lectura[] lecturas = { new Lectura (w1, -71.0),
				new Lectura (w2, -72.0),
				new Lectura (w3, -73.0),
				new Lectura (w4, -64.0),
				new Lectura (w5, -65.0),
				new Lectura (w6, -66.0)};

		Localizacion loc = new Localizacion (new Coordenada (0,0));
		System.out.println("loc="+loc);
			
		for (int i = 0; i < lecturas.length; i++){
			boolean anade= loc.addLectura(lecturas[i]);
			System.out.println("addLectura " + i  + "=" + anade);				
		}
		System.out.println("Added 6 lecturas=" +loc);
		
		System.out.println("getLectura(0)=" + loc.getLectura(0));
		System.out.println("getLectura(5)=" + loc.getLectura(5));

		System.out.println("copiaDeLecturas");
		List<Lectura> lecturas2 = loc.copiaDeLecturas();
		for (Lectura l: lecturas2) {
			System.out.println(l);
		}

		Localizacion loceq1= new Localizacion (ceq);
		loceq1.addLectura(lec);
		Localizacion loceq2= new Localizacion (ceq);
		loceq2.addLectura(lec);

		System.out.println("equals de Localizacion="+loceq1.equals(loceq2));		



	}

}
