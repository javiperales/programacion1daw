/*Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de 
tipo int para hora, minutos y segundos. Deberá tener un constructor para inicializar la hora 
a 0 o a una hora determinada (hora, minutos, segundos).Se deberá poder sumar y restar 
horas, así como imprimir y leer una hora. El formato de impresión y lectura será hh:mm:ss, 
todo en modo 24 horas.*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendario {

	private int hora;
	private int minutos;
	private int segundos;

	Calendar calendario =new GregorianCalendar();

	Calendario(){
		hora=calendario.get(Calendar.HOUR_OF_DAY);
		minutos=calendario.get(Calendar.MINUTE);
		segundos=calendario.get(Calendar.SECOND);
	}//constructor



	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public Calendar getCalendario() {
		return calendario;
	}
	public void setCalendario(Calendar calendario) {
		this.calendario = calendario;
	}
	/**
	 * utilizé los setters para poder poder sumarlo a los datos 
	 * reales 
	 */
	public void Darhora () {
		System.out.println("Hora modificada");
		int horaAux=calendario.get(Calendar.HOUR_OF_DAY)+hora;//me guardo la hora real y le sumo la que recibe por el set de la clase principal
		while(horaAux>=24){//mientras hora sea mayor o igual que 24 le resto 24
			horaAux=horaAux-24;
		}
		int minuto=calendario.get(Calendar.MINUTE)+minutos;
		while (minuto>=60) {
			minuto=minuto-60;
			horaAux++;
		}
		int segundo=calendario.get(Calendar.SECOND)+segundos;
		while(segundo>=60) {
			segundo=segundo-60;
			minuto++;
		}
		if(horaAux<10){
			System.out.print( "0"+horaAux+":");
		}else{
			System.out.print(  horaAux+":");
		}
		
		if(minuto<10){
			System.out.print( "0"+minuto+":");		
		}else{
			System.out.print( minuto+":");
		}
		if(segundo<10){
			System.out.print( "0"+segundo);
		}else{
			System.out.print(segundo);
		}
		//System.out.println(hora+":"+minutos+":"+segundos);

	}//metodo ver hora
	public void verHoraReal(){//este metodo mostrará la fecha real
		System.out.println("Hora real");
	
		if(hora<10){//solo entrara si la hora es menor que 10
			System.out.print(0+""+hora+":");
		}else{//sino pasará a esta linea
			System.out.print(hora+":");
		}//
		if(minutos<10){//solo entrará si los mins son menores que 10
			System.out.print(0+""+minutos+":");
		}else{//si son mayores que 10
			System.out.print(minutos+":");
		}
		if(segundos<10){//solo entrara si los segundos son menores
			System.out.print(0+""+segundos);
		}else{//si son mayores que 10
			System.out.print(segundos);
		}
		System.out.println();
	}

}//class