
import java.util.Scanner;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;

	public Fecha() {
		dia = 1;
		mes = 1;
		a�o = 1;
	}

	public Fecha(int dia, int mes, int a�o) {

		boolean bisiesto;

		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0)))
			bisiesto = true;
		else
			bisiesto = false;

		if (mes > 12 || mes < 1) {
			System.out.println("Error el a�o solo tiene 12 meses");
			this.dia = 0;
			this.mes = 0;
			this.a�o = 0;

		} else {
			if (dia > 31 || dia < 1) {
				System.out.println("Error el mes solo tiene 31 dias");
				this.dia = 0;
				this.mes = 0;
				this.a�o = 0;
			} else {
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) {
					System.out.println("Error el mes solo tiene 30 dias");
					this.dia = 0;
					this.mes = 0;
					this.a�o = 0;
				} else {
					if (mes == 2 && bisiesto && dia > 29) {
						System.out.println("Error el mes solo tiene 29 dias");
						this.dia = 0;
						this.mes = 0;
						this.a�o = 0;
					} else if (mes == 2 && !bisiesto && dia > 28) {
						System.out.println("Error el mes solo tiene 28 dias");
						this.dia = 0;
						this.mes = 0;
						this.a�o = 0;
					} else {
						this.dia = dia;
						this.mes = mes;
						this.a�o = a�o;
					}
				}
			}
		}
	}

	public Fecha peticionfecha() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Fecha fecha;

		do {
			System.out.println("Introduce una fecha: ");
			System.out.println("Dia: ");
			dia = teclado.nextInt();
			System.out.println("Mes: ");
			mes = teclado.nextInt();
			System.out.println("A�o: ");
			a�o = teclado.nextInt();

			fecha = new Fecha(dia, mes, a�o);

		} while (fecha.getDia() == 0 && fecha.getMes() == 0 && fecha.getA�o() == 0);

		return fecha;
	}

	public String datosfecha() {

		@SuppressWarnings("unused")
		Fecha fecha = new Fecha(dia, mes, a�o);

		String datosfecha = dia + "/" + mes + "/" + a�o;

		return datosfecha;
	}

	public int diferencia(Fecha fecha2) {
		// CAMBIAR A�OS BISIESTOS (MAL CALCULADO)
		int a�o2, mes2, dia2, i, total = 0;
		a�o2 = fecha2.getA�o();
		mes2 = fecha2.getMes();
		dia2 = fecha2.getDia();
		// dat0= a�o*1000+mes*100+dia;
		// dat1= a�o2*1000+mes2*100+dia2;

		/*
		 * if (dat1<dat0){ aux1=a�o2; aux2=mes2; aux3=dia2; a�o2=a�o; mes2=mes;
		 * dia2=dia; a�o=aux1; mes=aux2; dia=aux3; }
		 */
		if (a�o2 > a�o) {// fechas en a�os distintos

			for (i = a�o + 1; i < a�o2; i++) {// suma de aos
				total = total + 365;
				if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
					total = total + 1;
			}
			for (i = mes + 1; i < 13; i++) {// suma de meses de a�o de inicio
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					total = total + 31;
				if (i == 4 || i == 6 || i == 9 || i == 11)
					total = total + 30;
				if (i == 2)
					total = total + 28;
				if (i == 2 && ((a�o % 4 == 0 && a�o % 100 != 0) || a�o % 400 == 0))
					total = total + 1;
			}
			for (i = 1; i < mes2; i++) {// suma de meses de a�o de fin
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					total = total + 31;
				if (i == 4 || i == 6 || i == 9 || i == 11)
					total = total + 30;
				if (i == 2)
					total = total + 28;
				if (i == 2 && ((a�o2 % 4 == 0 && a�o2 % 100 != 0) || a�o2 % 400 == 0))
					total = total + 1;
			}
			i = mes;// d�as mes de inicio
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				total = total + 31 - dia;
			if (i == 4 || i == 6 || i == 9 || i == 11)
				total = total + 30 - dia;
			if (i == 2)
				total = total + 28 - dia;
			if (i == 2 && ((a�o % 4 == 0 && a�o % 100 != 0) || a�o % 400 == 0))
				total = total + 1;
			total = total + dia2;// d�as de mes final

		} else {
			if (a�o == a�o2) {// fechas en el mismo a�o
				for (i = mes + 1; i < mes2; i++) {// suma de meses intermedios
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
						total = total + 31;
					if (i == 4 || i == 6 || i == 9 || i == 11)
						total = total + 30;
					if (i == 2)
						total = total + 28;
					if (i == 2 && ((a�o % 4 == 0 && a�o % 100 != 0) || a�o % 400 == 0))
						total = total + 1;
				}
				if (mes == mes2) {// mismo a�o, mismo mes
					total = dia2 - dia;
				} else {
					i = mes;// mes de inicio
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
						total = total + 31 - dia;
					if (i == 4 || i == 6 || i == 9 || i == 11)
						total = total + 30 - dia;
					if (i == 2)
						total = total + 28 - dia;
					if (i == 2 && ((a�o % 4 == 0 && a�o % 100 != 0) || a�o % 400 == 0))
						total = total + 1;
					total = total + dia2;// d�as mes final
				}
			}
		}
		return total;

	}

	public Fecha sumardias(int sumarDias) {

		int dia = this.dia, mes = this.mes, a�o = this.a�o;
		Fecha fecha2;
		fecha2 = new Fecha();

		// suma
		if (sumarDias > 0) {
			for (int i = 0; i < sumarDias; i++) {
				if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					dia++;
					if (dia > 30) {
						mes++;
						dia = 1;
					}
				}
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					dia++;
					if (dia > 31) {
						mes++;
						dia = 1;
						if (mes > 12) {
							a�o++;
							mes = 1;
							dia = 1;
						}
					}
				}
				if (mes == 2) {
					if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
						dia++;
						if (dia > 29) {
							mes++;
							dia = 1;
						}
					} else {
						dia++;
						if (dia > 28) {
							mes++;
							dia = 1;
						}
					}
				}
			}

			fecha2.setDia(dia);
			fecha2.setMes(mes);
			fecha2.setA�o(a�o);

		}
		// resta
		if (sumarDias < 0) {

			for (int i = 0; i > sumarDias; i--) {
				dia = dia - 1;
				if (dia < 1) {
					mes = mes - 1;
					if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
						dia = 30;
					}
					if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
						dia = 31;
					}
					if (mes == 2) {
						if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
							dia = 29;
						}
						if ((a�o % 4 != 0) && ((a�o % 100 == 0) || (a�o % 400 != 0))) {
							dia = 28;
						}
					}
					if (mes < 1) {
						a�o = a�o - 1;
						mes = 12;
						dia = 31;
					}

				}

				fecha2.setDia(dia);
				fecha2.setMes(mes);
				fecha2.setA�o(a�o);
			}
		}
		return fecha2;
	}

	public String diadelaSemana() {
		String diasemana = "";
		Fecha fecha1;
		fecha1 = new Fecha(31, 12, 1899);
		int dif = fecha1.diferencia(this);
		if (dif < 0) {
			dif = -dif;
			dif = dif % 7;
			switch (dif) {
			case 0:
				diasemana = "Domingo";
				break;
			case 1:
				diasemana = "S�bado";
				break;
			case 2:
				diasemana = "Viernes";
				break;
			case 3:
				diasemana = "Jueves";
				break;
			case 4:
				diasemana = "Mi�rcoles";
				break;
			case 5:
				diasemana = "Martes";
				break;
			case 6:
				diasemana = "Lunes";
				break;
			}
		} else {

			dif = dif % 7;
			switch (dif) {
			case 0:
				diasemana = "Domingo";
				break;
			case 1:
				diasemana = "Lunes";
				break;
			case 2:
				diasemana = "Martes";
				break;
			case 3:
				diasemana = "Mi�rcoles";
				break;
			case 4:
				diasemana = "Jueves";
				break;
			case 5:
				diasemana = "Viernes";
				break;
			case 6:
				diasemana = "Sabado";
				break;
			}
		}
		return diasemana;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
}
