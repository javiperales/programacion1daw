package ejercicio_2;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		String nombre[] = { "Juan", "Jose", "David", "Ana", "Pilar", "Lucia", "Luis", "Alberto", "María", "Pablo",
				"Eva", "Rafa", "Pedro", "Nuria", "Carlos", "Daniel" };
		char estadoCivil[] = { 'S', 'V', 'C', 'D' };
		char turno[] = { 'D', 'N' };
		int titulacion;
		int antiguedad;
		double totalNomina = 0;

		Trabajadores trabajador[];
		trabajador = new Trabajadores[50];
		Nomina nomina[];
		nomina=new Nomina[trabajador.length];
		
		
		Random azar;

		for (int i = 0; i < trabajador.length; i++) {
			azar = new Random();
			
			trabajador[i] = new Trabajadores();
			trabajador[i].setNombre(nombre[azar.nextInt(nombre.length)]);
			trabajador[i].setEstadoCivil(estadoCivil[azar.nextInt(estadoCivil.length)]);
			trabajador[i].setTurno(turno[azar.nextInt(turno.length)]);
			trabajador[i].setTitulacion(azar.nextInt(5));
			trabajador[i].setAntiguedad(azar.nextInt(55));
			
			
			nomina[i]=new Nomina(trabajador[i]);

		}

		
		
		for (int i = 0; i < trabajador.length; i++) {
			System.out.println("_________________________________________________________________________");
			trabajador[i].visualizaDatos();
			nomina[i].verTrabajador(i+1);
			System.out.println("_________________________________________________________________________");

		}
		
		
		for (int i = 0; i < nomina.length; i++) {
			totalNomina+=nomina[i].getTotalADI();
			
		}
		
		System.out.println("Nomina total de la empresa: " + totalNomina);

	}//

}//
