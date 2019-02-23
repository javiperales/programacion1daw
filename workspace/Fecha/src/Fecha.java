import java.util.Scanner;
import java.util.*;
import java.text.*;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	private int sumaDias;
	
	public Fecha(int dia, int mes, int año){
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}//constructor
	
	
	public int getSumaDias() {
		if(sumaDias==0){
			sumaDias++;
		}
		return sumaDias;
	}


	public boolean esBisiesto(){
		if(año%4==0 && año%100!=0 || año%400==0){
			System.out.println("el año es  bisiesto");
			return true;
		}else{
			System.out.println("el año no es bisiesto");
			return false;
		}//else				
	}//esBisiesto
	
	public boolean esCorrecto(){
		boolean correcto=true;
		esBisiesto();
		if((año<0 && año<=2018)&& esBisiesto()==true){
			if(mes>=1 && mes<=12){
				if(dia>=1 && dia<=31){
					correcto=true;
				}//ifnieto
			}//ifpadre
		}/*ifabuelo*/else{
			correcto=false;
		}
		return correcto;
	}//esCorrecto
	public String getCadenaMes(){
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		String mesCorrecto="";
		
		for(int k=0; k<12;k++){
			if(mes==k){
				mesCorrecto=meses[k];
				
			}//if
			
		}//for
		return mesCorrecto;
		
	}//getCadena
	
	public int getDiaMes(){
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		int mesCorrecto=0;
		esBisiesto();
		
		meses[0]="31"; //enero
		meses[1]="28"; //febrero
		meses[2]="31"; //marzo
		meses[3]="30"; //abril
		meses[4]="31"; //mayo
		meses[5]="30"; //junio
		meses[6]="31"; //julio
		meses[7]="31"; //agosto
		meses[8]="30"; //septiembre
		meses[9]="31"; //octubre
		meses[10]="30"; //noviembre
		meses[11]="31"; //diciembre
		
		if(esBisiesto()==true){
			meses[1]="29";
		}//if
		
		for(int i=0; i<12;i++){
			if(mes==1){
				mesCorrecto=Integer.parseInt(meses[i]);
			}//if
		}//for
		
		return mesCorrecto;
	}//getDiaMes
	
	public String getCadena1(){
		String cadena;
		String cadenaDia, cadenaMes,cadenaAño;
		
		if(dia<=0 && dia<=9){
			cadenaDia="0"+dia;
		}else{
			cadenaDia=""+dia;
		}//else
		
		if(mes<=0 && mes<=9){
			cadenaMes="0"+mes;
		}else{
			cadenaMes=""+mes;
		}
		if(año<=0 && año<=9){
			cadenaAño="000"+año;
			
		}else if (año>=10 && año>=99){
			cadenaAño="00"+año;
		}else if(año>100 && año>=999){
			cadenaAño="0"+año;
		}else{
			cadenaAño=""+año;
		}
			
		cadena=cadenaDia+cadenaMes+cadenaAño;
		return cadena;		
				
	}//getcadena1
	public String getCadena2(){
		String cadena;
		getCadenaMes();
		getDiaMes();
		cadena=""+getDiaMes()+" de "+getCadenaMes()+" de "+año;
		return cadena;
	}//getcadena2
	//public Integer diferenciaFecha(){
		
			
	//}//diferencia
	
	public Fecha sumaDias(Integer num ){
		
		int diasMeses [] ={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(esBisiesto()==true){
			diasMeses[2]=29;
		}//if
		
		dia = num + dia;
		while(dia> diasMeses[mes]){
			mes++;
			dia=dia+diasMeses[mes];
			if(mes>12){
				mes=1;
				año++;
			}//if
		}//while
		
		sumaDias=dia;
		return new Fecha (año, mes,dia);
	}//sumaDias
	
}//class
