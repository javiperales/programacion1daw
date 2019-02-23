import java.util.*;
public class GestionAgencia {
	public static void main(String[] args) {
		/////////////////////principal///////////////////////////////////////
		final Integer NUMCOCHE=20;
		Coche[] coches = new Coche[NUMCOCHE];
		Coche [] CocheLujo = new Lujo[5];
		Coche[] CocheNormal = new Normal[15];

	}//main

	public static void devolver(){
		Libreria.mostrarEnPantalla("1-devolver coche de lujo");
		Libreria.mostrarEnPantalla("2-devolver coche normal");

	}//devolver

	public static void crearCocheLujo(Coche CocheLujo[]){
		Random alea = new Random();
		boolean disponible=true;
		Fecha fecha;
		int dia, mes, a�o, codigo=10000;
		for(int i=0; i<CocheLujo.length; i++){
			codigo++;
			dia=alea.nextInt(30);
			mes=alea.nextInt(12)+1;
			a�o=alea.nextInt(2018)-2000;
			fecha = new Fecha(dia,mes,a�o);

			CocheLujo[i]= new Lujo(Libreria.matriculaAzar(),Libreria.marcaAzar(),Libreria.modeloAzar(),fecha, disponible,Libreria.enteroAzar(50, 60),codigo);			
		}//for

	}//creaarCocheDeLujo

	public static Fecha pedirFecha(){
		Fecha fecha;
		Integer dia=0, mes=0 , a�o=0;
		if(dia<31 && mes<12 && a�o<2018){
			System.out.println("fecha incorrecta");
		}else{
			dia=Libreria.pedirEntero("dia del mes");
			mes=Libreria.pedirEntero("mes actual");
			a�o=Libreria.pedirEntero("a�o actual");


		}
		fecha = new Fecha(dia,mes,a�o);
		return fecha;
	}//pedirFecha

	public static void creaCocheNormal(Coche CocheNormal[]){
		Random alea = new Random();
		boolean disponible=true;
		Fecha fecha;
		fecha=pedirFecha();
		for(int i=0; i<CocheNormal.length; i++){
			CocheNormal[i] = new Normal(Libreria.matriculaAzar(), Libreria.cocheAzar(),Libreria.modeloAzar(), fecha, disponible,Libreria.enteroAzar(20, 30), aparcaAzar(), fecha);

		}//for		
	}//creaCocheNormal

	public static void alquilarCocheLujo(Coche coches[]){
		String matricula;
		boolean alquilado=false;
		for(int i=0; i<coches.length;i++){
			if(coches[i] instanceof Lujo){
				Lujo lujo;
				lujo=(Lujo) coches[i];
				System.out.println(lujo.alquiar());
			}else{
				System.out.println("no hay coches para alquilar");
			}//if
		}//for

		matricula=Libreria.pedirCadena("matricula del coche que quieres alquilar");
		for(int i=0; i<coches.length && alquilado==false; i++){
			if(alquilado==false){
				if(coches[i] instanceof Lujo){
					Lujo lujo;
					lujo =(Lujo) coches[i];
					if(lujo.getMatricula()==(matricula)){
						if(lujo.getDisponible()==true){
							lujo.setDisponible(false);
							alquilado=true;
							System.out.println("coche alquilado");
						}else{
							System.out.println("el coche no esta disponible");
						}
					}
				}else{
					System.out.println("no hay coches para alquilar");
				}
					
			}//if
		}//for
	}//alquilarCochedeLujo
	
	public static void devolverCocheLujo(Coche coches[]){
		Integer contador;
		String matricula;
		boolean devuelto=false;
		for(int i=0; i<coches.length; i++){
			if(coches[i] instanceof Lujo){
				Lujo lujo;
				lujo=(Lujo) coches[i];
				System.out.println(lujo.alquiar());
			}else{
				System.out.println("no hay coches para devolver");
			}//if
			
		}//for
		
		
		
	}//devolverCocheLujo
	

	static public String aparcaAzar() {
		Random azar= new Random();
		int n;
		String apar = "";
		n=azar.nextInt(2)+1;
		if(n==1){
			apar= "Aparcamiento del Ebro";
		}
		if(n==2){
			apar= "IberPark";
		}
		if(n==3){
			apar= "Aragonia";
		}
		return apar;
	}




}//class
