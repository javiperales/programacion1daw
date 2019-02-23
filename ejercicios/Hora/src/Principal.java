import java.util.*;

/*Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de 
tipo int para hora, minutos y segundos. Deberá tener un constructor para inicializar la hora 
a 0 o a una hora determinada (hora, minutos, segundos).Se deberá poder sumar y restar 
horas, así como imprimir y leer una hora. El formato de impresión y lectura será hh:mm:ss, 
todo en modo 24 horas.*/
public class Principal {
	

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		Calendario tiempo;
		int num,minuto,segundos;
		
		
		tiempo=new Calendario();
		
		//System.out.print( "hora: " + tiempo.getHora()+":"+tiempo.getMinutos()+":"+tiempo.getSegundos() );
		tiempo.verHoraReal();
		 
		System.out.println("dame un numero para las horas");
		num=teclado.nextInt();
		tiempo.setHora(num);//se los paso ala clase calendario
		System.out.println("Introduce un numero para los minutos");
		minuto=teclado.nextInt();
		tiempo.setMinutos(minuto);//se los paso ala clase calendario
		System.out.println("Introduce un numero para los minutos");
		segundos=teclado.nextInt();
		tiempo.setSegundos(segundos);//se los paso ala clase calendario
		tiempo.Darhora();
		teclado.close();
	}//main

}//class