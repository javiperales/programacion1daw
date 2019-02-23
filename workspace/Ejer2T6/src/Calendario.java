import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendario {
private int hora;
private int minutos;
private int segundos;

Calendar calendario = new GregorianCalendar();
 Calendario(){
	 hora=calendario.get(Calendar.HOUR_OF_DAY);
	 minutos=calendario.get(Calendar.MINUTE);
	 segundos=calendario.get(Calendar.SECOND);
 }//constructor
 
public void verHora(){
	
	

	while(minutos>=60){
		minutos=minutos-60;
		hora++;
		
	}
while(segundos>=60){
	segundos=segundos-60;
	minutos++;
	
}
System.out.println();
}//verHora

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
 
 
}//class
