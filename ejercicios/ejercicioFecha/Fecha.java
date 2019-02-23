import java.util.*;

public class Fecha {

	private int dia;
	private int mes;
	private int año;
	private int sumaDias;

	Scanner teclado = new Scanner(System.in);

	Fecha(int año, int mes, int dia) {

		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getSumaDias() {
		return sumaDias;
	}

	public boolean esBisiesto() {

		if ((año%4==0)&& ((año%100!=0) && (año%400==0))){
			//System.out.println("el año es bisiesto.");
			return true;
		}else{
			//System.out.println("el año no es bisiesto.");
			return false;
		}

	}// esBisiesto

	public boolean esCorrecta() {
		boolean correcto = true;

		esBisiesto();

		if ((año >= 0 && año <= 2018)) {
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
		String mesesAño[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		String mesCorrecto = "";
		// int [] diasMesesAño = new int [12];

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				// si mes == 1
				mesCorrecto = mesesAño[i];
				// mesCorrecto=Enero
			}
		}

		return mesCorrecto;
	}

	public int getDiasMes() {
		String mesesAño[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		int mesCorrecto = 0;

		esBisiesto(); // lo llamamos para comprobar si el año es bisiesto. (Dado
						// que lo habremos escrito anteriormente, sabrá de que
						// año hablamos).

		mesesAño[1] = "31";
		mesesAño[2] = "28";
		mesesAño[3] = "31";
		mesesAño[4] = "30";
		mesesAño[5] = "31";
		mesesAño[6] = "30";
		mesesAño[7] = "31";
		mesesAño[8] = "31";
		mesesAño[9] = "30";
		mesesAño[10] = "31";
		mesesAño[11] = "30";
		mesesAño[12] = "31";

		if (esBisiesto() == true) {
			mesesAño[1] = "29"; // febrero = 29 si es bisiesto.
		}

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				mesCorrecto = Integer.parseInt(mesesAño[i]);
			}
		}

		return mesCorrecto;

	}

	public String getCadenaFecha1() {
		String cadena;
		String diaString, mesString, añoString;

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
		if (año >= 0 && año <= 9) {
			añoString = "000" + año;
		} else if (año >= 10 && año <= 99) {
			añoString = "00" + año;
		} else if (año >= 100 && año <= 999) {
			añoString = "0" + año;
		} else {
			añoString = "" + año;
		}

		cadena = diaString + "/" + mesString + "/" + añoString;

		return cadena;
	}

	public String getCadenaFecha2() {
		String cadena;

		getCadenaMes();

		cadena = "" + dia + " de " + getCadenaMes() + " de " + año;

		return cadena;
	}

	public Integer diferenciaFecha(Fecha fecha2) {
		public int diferencia (Fecha fecha2){
	        //CAMBIAR AÑOS BISIESTOS (MAL CALCULADO)
	        int año2, mes2, dia2, i, total=0;
	            año2=fecha2.getAño();
	            mes2=fecha2.getMes();
	            dia2=fecha2.getDia();
	            if (año2>año){ //si el segundo año es mayor que el primero entra al for

					for (i=año ; i<año2-1; i++){//suma de años
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


					for (i=mes; i<12; i++){//suma de meses de año de inicio
						if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
						if (i==4 ||i==6||i==9||i==11) total=total+30;
						if (i==2) total=total+28;
						if (i==2 && ((año%4==0 && año%100!=0) || año%400==0)) total=total+1;
					}
					for (i=1; i<mes2; i++){//suma de meses de año de fin
						if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
						if (i==4 ||i==6||i==9||i==11) total=total+30;
						if (i==2) total=total+28;
						if (i==2 && ((año2%4==0 && año2%100!=0) || año2%400==0)) total=total+1;
					}
					i=mes;//días mes de inicio
					if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia;
					if (i==4 ||i==6||i==9||i==11) total=total+30-dia;
					if (i==2) total=total+28-dia;
					if (i==2 && ((año%4==0 && año%100!=0) || año%400==0)) total=total+1;
					total=total+dia2;//días de mes final

				} else{
					if (año==año2){//fechas en el mismo año
						for (i=mes+1; i<mes2; i++){//suma de meses intermedios
							if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
							if (i==4 ||i==6||i==9||i==11) total=total+30;
							if (i==2) total=total+28;
							if (i==2 && ((año%4==0 && año%100!=0) || año%400==0)) total=total+1;
						}
						if (mes==mes2) {//mismo año, mismo mes
							total=dia2-dia;
						}	else{
							i=mes;//mes de inicio
							if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia;
							if (i==4 ||i==6||i==9||i==11) total=total+30-dia;
							if (i==2) total=total+28-dia;
							if (i==2 && ((año%4==0 && año%100!=0) || año%400==0)) total=total+1;
							total=total+dia2;//días mes final
						}
					}
				}
				return total;
	            
	            
	    }

		/*Integer num;
		String laFecha;
		int mesesAño[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int diaDif = 0;
		int dia1, mes1, año1;
		int diasAño, diasMes = 0, dias;

		System.out.println("Dame un día");
		dia1 = teclado.nextInt();

		System.out.println("Dame un mes");
		mes1 = teclado.nextInt();

		System.out.println("Dame un año");
		año1 = teclado.nextInt();

		Fecha fecha0 = new Fecha(año1, mes1, dia1);

		while (dia < dia1) {
			System.out.println("Los días de la segunda fecha han de ser inferiores.");
			System.out.println();

			System.out.println("Dame un día");
			dia1 = teclado.nextInt();

		}

		diasAño = año * 365;

		while (esBisiesto() == true) {
			diasAño++;
		}

		for (int i = 0; i < mesesAño[mes]; i++) {
			diasMes = diasMes + mesesAño[mes];
		}

		dias = dia + diasMes + diasAño;

		if (dia < 0) {
			mes--;
			if (mes < 0) {
				año--;
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

		if (esBisiesto() == true) { // si el año es bisiesto 
			diasMes[2] = 29; // febrero = 29 si es bisiesto.
		}

		dia = num + dia; // dia sera la suma de los dias que introduzcamos

		while (dia > diasMes[mes]) { //mientras el dia sea mayor que los dias del vectos al mes se le sumara 1

			mes++;
			dia = dia - diasMes[mes]; // dia sera igual al dia actual menos los dias del mes indicado

			if (mes > 12) { // si mes es mayor que 12 , sumaremos 1 al año
				mes = 1;
				año++;
			}//if
		}//while
		sumaDias=dia; // sumasDias sera igual al dia que queremos
		return new Fecha(año, mes, dia); // devolvemos un objeto con año,mes,dia

	}// sumaDias

}// class
