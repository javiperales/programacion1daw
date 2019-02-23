import java.util.*;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;
	private int sumaDias;

	Scanner teclado = new Scanner(System.in);

	Fecha(int a�o, int mes, int dia) {

		this.a�o = a�o;
		this.mes = mes;
		this.dia = dia;

	}// class

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getSumaDias() {
		return sumaDias;
	}

	public boolean esBisiesto() {

		if ((a�o%4==0)&& ((a�o%100!=0) && (a�o%400==0))){
			//System.out.println("el a�o es bisiesto.");
			return true;
		}else{
			//System.out.println("el a�o no es bisiesto.");
			return false;
		}

	}// esBisiesto

	public boolean esCorrecta() {
		boolean correcto = true;

		esBisiesto();

		if ((a�o >= 0 && a�o <= 2018)) {
			if (mes >= 1 && mes <= 12) {
				if (dia >= 1 && dia <= 31) {
					correcto = true;
				}
			}
		} else {
			correcto = false;

		}
		return correcto;

	}// esCorrecta

	public String getCadenaMes() {
		String mesesA�o[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		String mesCorrecto = "";
		// int [] diasMesesA�o = new int [12];

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				// si mes == 1
				mesCorrecto = mesesA�o[i];
				// mesCorrecto=Enero
			}
		}

		return mesCorrecto;
	}

	public int getDiasMes() {
		String mesesA�o[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		int mesCorrecto = 0;

		esBisiesto(); // lo llamamos para comprobar si el a�o es bisiesto. (Dado
						// que lo habremos escrito anteriormente, sabr� de que
						// a�o hablamos).

		mesesA�o[1] = "31";
		mesesA�o[2] = "28";
		mesesA�o[3] = "31";
		mesesA�o[4] = "30";
		mesesA�o[5] = "31";
		mesesA�o[6] = "30";
		mesesA�o[7] = "31";
		mesesA�o[8] = "31";
		mesesA�o[9] = "30";
		mesesA�o[10] = "31";
		mesesA�o[11] = "30";
		mesesA�o[12] = "31";

		if (esBisiesto() == true) {
			mesesA�o[1] = "29"; // febrero = 29 si es bisiesto.
		}

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				mesCorrecto = Integer.parseInt(mesesA�o[i]);
			}
		}

		return mesCorrecto;

	}

	public String getCadenaFecha1() {
		String cadena;
		String diaString, mesString, a�oString;

		// dd-mm-yyyy

		if (dia >= 0 && dia <= 9) {
			diaString = "0" + dia;
		} else {
			diaString = "" + dia;
		}
		if (mes >= 0 && mes <= 9) {
			mesString = "0" + mes;
		} else {
			mesString = "" + mes;
		}
		if (a�o >= 0 && a�o <= 9) {
			a�oString = "000" + a�o;
		} else if (a�o >= 10 && a�o <= 99) {
			a�oString = "00" + a�o;
		} else if (a�o >= 100 && a�o <= 999) {
			a�oString = "0" + a�o;
		} else {
			a�oString = "" + a�o;
		}

		cadena = diaString + "/" + mesString + "/" + a�oString;

		return cadena;
	}

	public String getCadenaFecha2() {
		String cadena;

		getCadenaMes();

		cadena = "" + dia + " de " + getCadenaMes() + " de " + a�o;

		return cadena;
	}

	public Integer diferenciaFecha(Fecha fecha2) {
		public int diferencia (Fecha fecha2){
	        //CAMBIAR A�OS BISIESTOS (MAL CALCULADO)
	        int a�o2, mes2, dia2, i, total=0;
	            a�o2=fecha2.getA�o();
	            mes2=fecha2.getMes();
	            dia2=fecha2.getDia();
	            if (a�o2>a�o){ //si el segundo a�o es mayor que el primero entra al for

					for (i=a�o ; i<a�o2-1; i++){//suma de a�os
						total = total + 365;
						if (esBisiesto();) total = total + 1;
					}
					for(i=mes ; i<12; i++){
						if(diasMeses[mes]==31){
							total=total+31;
						}
						if(diasMeses[mes]==30){
							total=total+30;
						}
						if(diasMeses==28){
							total=total+28;
						}
						if(esBisiesto()){
							total=total+1;
						}
					}
					i=mes;
					if(diasMeses[mes]==31){
						total=total+31-dia;
					}
					if(diasMeses[mes]==30){
						total=total+30-dia;
					}
					if(diasMeses[mes]==28){
						total=total+28-dia;
					}
					if(diasMeses[mes])


					for (i=mes; i<12; i++){//suma de meses de a�o de inicio
						if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
						if (i==4 ||i==6||i==9||i==11) total=total+30;
						if (i==2) total=total+28;
						if (i==2 && ((a�o%4==0 && a�o%100!=0) || a�o%400==0)) total=total+1;
					}
					for (i=1; i<mes2; i++){//suma de meses de a�o de fin
						if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
						if (i==4 ||i==6||i==9||i==11) total=total+30;
						if (i==2) total=total+28;
						if (i==2 && ((a�o2%4==0 && a�o2%100!=0) || a�o2%400==0)) total=total+1;
					}
					i=mes;//d�as mes de inicio
					if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia;
					if (i==4 ||i==6||i==9||i==11) total=total+30-dia;
					if (i==2) total=total+28-dia;
					if (i==2 && ((a�o%4==0 && a�o%100!=0) || a�o%400==0)) total=total+1;
					total=total+dia2;//d�as de mes final

				} else{
					if (a�o==a�o2){//fechas en el mismo a�o
						for (i=mes+1; i<mes2; i++){//suma de meses intermedios
							if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
							if (i==4 ||i==6||i==9||i==11) total=total+30;
							if (i==2) total=total+28;
							if (i==2 && ((a�o%4==0 && a�o%100!=0) || a�o%400==0)) total=total+1;
						}
						if (mes==mes2) {//mismo a�o, mismo mes
							total=dia2-dia;
						}	else{
							i=mes;//mes de inicio
							if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia;
							if (i==4 ||i==6||i==9||i==11) total=total+30-dia;
							if (i==2) total=total+28-dia;
							if (i==2 && ((a�o%4==0 && a�o%100!=0) || a�o%400==0)) total=total+1;
							total=total+dia2;//d�as mes final
						}
					}
				}
				return total;
	            
	            
	    }

		/*Integer num;
		String laFecha;
		int mesesA�o[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int diaDif = 0;
		int dia1, mes1, a�o1;
		int diasA�o, diasMes = 0, dias;

		System.out.println("Dame un d�a");
		dia1 = teclado.nextInt();

		System.out.println("Dame un mes");
		mes1 = teclado.nextInt();

		System.out.println("Dame un a�o");
		a�o1 = teclado.nextInt();

		Fecha fecha0 = new Fecha(a�o1, mes1, dia1);

		while (dia < dia1) {
			System.out.println("Los d�as de la segunda fecha han de ser inferiores.");
			System.out.println();

			System.out.println("Dame un d�a");
			dia1 = teclado.nextInt();

		}

		diasA�o = a�o * 365;

		while (esBisiesto() == true) {
			diasA�o++;
		}

		for (int i = 0; i < mesesA�o[mes]; i++) {
			diasMes = diasMes + mesesA�o[mes];
		}

		dias = dia + diasMes + diasA�o;

		if (dia < 0) {
			mes--;
			if (mes < 0) {
				a�o--;
			}
		} else {
			diaDif = dia - dia1;
		}

		laFecha = "" + diaDif;
		num = Integer.parseInt(laFecha);

		return num;
	}*/

	public Fecha sumaDias(Integer num) {

		int diasMes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// vector con los dias que tiene cada mes, la posicion corresponde con cada mes

		if (esBisiesto() == true) { // si el a�o es bisiesto 
			diasMes[2] = 29; // febrero = 29 si es bisiesto.
		}

		dia = num + dia; // dia sera la suma de los dias que introduzcamos

		while (dia > diasMes[mes]) { //mientras el dia sea mayor que los dias del vectos al mes se le sumara 1

			mes++;
			dia = dia - diasMes[mes]; // dia sera igual al dia actual menos los dias del mes indicado

			if (mes > 12) { // si mes es mayor que 12 , sumaremos 1 al a�o
				mes = 1;
				a�o++;
			}//if
		}//while
		sumaDias=dia; // sumasDias sera igual al dia que queremos
		return new Fecha(a�o, mes, dia); // devolvemos un objeto con a�o,mes,dia

	}// sumaDias

}// class
