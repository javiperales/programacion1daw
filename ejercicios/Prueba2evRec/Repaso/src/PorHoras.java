import java.util.Random;

import utilidades.Leer;

public class PorHoras extends Empleado {
	private double precioHora=11;
	private int horas[];
	private boolean hecho=false;
	public PorHoras( String DNI, String nombre, String apellidos){
		super(DNI,nombre,apellidos);	
	}

	public void imprimir(){
		super.imprimir();
		System.out.println("La hora la cobra a  "+precioHora);
	}

	public void datosTrabajador(){
		int elec, dato;
		Random azar = new Random();
		horas = new int[12];
		String mes[]={"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

		do{
			System.out.println("1. Introducir las horas trabajadas al azar");
			System.out.println("2. Introducir las horas trabajadas en el mes que indiquemos");
			elec=Leer.pedirEnteroValidar("Introduzca 0 para salir");

			switch(elec){
			case 1:
				for(int k=0; k<horas.length; k++){
					horas[k]=azar.nextInt(141)+20;
				}
				hecho=true;
				break;
			case 2:
				for(int k=0; k<mes.length; k++){
					System.out.println("Pulse " +(k+1) +" para introducir las horas que ha trabajado en " +mes[k] +". \n" );
				}
				dato=Leer.pedirEnteroValidar("");
				if(dato>0 && dato<13){
					horas[dato-1]=Leer.pedirEnteroValidar("Introduzca las horas trabajadas en" +mes[dato-1]);
					hecho=true;
				}else{
					System.out.println("El mes introducido no es correcto");
				}
				break;}

		}while(elec!=0);
	}
	public void salario(){
		int i, elec;
		double total;

		String mes[]={"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		if(hecho==true){
			do{
				System.out.println("1. Ver la nomina de un mes");
				System.out.println("2. Ver la nomina de todo el año");
				elec=Leer.pedirEnteroValidar("Introduzca 0 para salir");
				switch(elec){
				case 1:

					for (int j = 0; j < mes.length; j++) {
						System.out.println("Pulse " +(j+1) +" para ver el mes de " +mes[j] );						
					}
					i=Leer.pedirEnteroValidar("Introduce el mes que quiere visualizar");
					if(i<13 && i>0){
						total= horas[i-1]*precioHora;
						System.out.println("El dinero que ha combrado en el mes de " +mes[i-1] +" es " +total);
					}else{
						System.out.println("Numero mal puesto");
					}

					break;
				case 2:				
					for(int k=0; k<horas.length; k++){
						System.out.println(mes[k] + " " + horas[k]*precioHora);
					}					
					break;
				}
			}while(elec!=0);
		}else{System.out.println("No ha trabajado este año");}

	}
}



