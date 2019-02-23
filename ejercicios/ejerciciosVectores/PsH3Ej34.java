/*34.-Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, 
las almacene en un vector y calcule e imprima su media.*/

public class PsH3Ej34 {

	public static void main(String[] args) {
		int vecNotas[] = new int[10];
		String vecNomAsig[] = new String[10];
		int k;
		double suma;
		suma=0;
		for( k=0; k<10; k++){
			vecNomAsig[k] = "Asig" + (k+1);
			vecNotas[k] = (int)(Math.random()*10 + 1);
			suma = suma + vecNotas[k];
		}
		
		for( k=0; k<10; k++){
			System.out.printf("\nEn la asignatura %6s *** %d", vecNomAsig[k],vecNotas[k]);
		}
		System.out.println("\nLa media es: " + suma/10);
	}//main

}//class
	
	
	
	
	
	
	
	
	
	
