/* Ejercicio 1: Calcular las calificaciones de 5 alumnos. 
 * Hay 10 preguntas. Y 4 respuestas posibles. Solo 1 es verdadera.
 * Un contador que te sume los aciertos y otro, los fallos. 
 * y haga el cálculo multiplicando por 0,3.
 * 
 * Respuestas: -- 1=B / 2=D/ 3=A / 4=C / 5=B / 6=C / 7=A /8=C / 9=B / 10=D --
 */


import java.util.*;
public class ArascoMillanEx1 {

	public static void main(String[] args) {

		double nota=0;
		int fil,col, k, a, numAlumno=1,contaAciertos=0, contaFallos=0;
		//int matriz[][] = new int [5][10];

		String vecRespuestas[]= {"A", "B", "C", "D"};
		String respuesta = null;
		String vecRespondidas[] = new String [10];
		char vecLetra[]= new char [10];


		for (k=0; k<vecLetra.length;k++){

			vecLetra[k]=0; // Todos los índices serán 0.
		}


		System.out.print("Solución: "+ " B "+ " D "+ " A "+ " C "+ " B "+ " C "+ " A "+" C "+" B "+ " D");
		System.out.println();
		System.out.printf("%65s", "");
		System.out.print("   Aciertos ");
		System.out.print("       Fallos ");
		System.out.print(" Calificación ");
		System.out.println();
		System.out.println();

		for (fil=0; fil<5;fil++){
			System.out.print("Alumno  "+numAlumno+ ":");
			numAlumno++;
			contaAciertos=0;
			contaFallos=0;
			nota=0;

			for (col=0; col<10;col++){
				//A cada uno le asignamos una respuesta aleatoria.
				respuesta=vecRespuestas[(int)(Math.random()*4)];// esto es lo que me faltaba
				//escogemos aleatoriamente del vector vecRespuestas A B C o D.
				System.out.printf("%5s",respuesta);
				//Imprimimos el resultado aleatorio.
			}//columnas

			for (a = 0; a<vecRespondidas.length;a++){

				vecRespondidas[a]=respuesta;
				// Le metemos en un vector cada una de las respuesta dadas
				// para posteriormente comparar.
			}//for

			// a partir de aquí establecemos una condición de acierto o error.
			if(vecRespondidas[0]!="B") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if

			if(vecRespondidas[1]!="D") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if
			if(vecRespondidas[2]!="A") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if
			if(vecRespondidas[3]!="C") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if

			if(vecRespondidas[4]!="B") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if
			if(vecRespondidas[5]!="C") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if
			if(vecRespondidas[6]!="A") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if
			if(vecRespondidas[7]!="C") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if
			if(vecRespondidas[8]!="B") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if

			if(vecRespondidas[9]!="D") {
				contaFallos++;
			}else{
				contaAciertos++;
			}//if


			// imprimimos el resultado.
			System.out.printf("%12d", contaAciertos);
			System.out.printf("%15d", contaFallos);
			nota=(contaAciertos-contaFallos*0.3);
			System.out.printf("%15f", nota);
			System.out.println();
		}//filas


	}//main

}//class
