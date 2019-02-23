
import java.util.*;


public class GestionAgencia {

	private static final Lujo[] Lujo = null;
	private static final Normal[] Normal = null;

	public static void main(String[] args) {
		///////////////principal//////////////////////////////////
		Fecha hoy = new Fecha(01,03,2018);
		Normal cocheNormal=null;
		Lujo cocheLujo=null;
		creoCocheNormal( cocheNormal);	
		creoCocheLujo( cocheLujo);
		Coche[] coche=null;
		final Integer NUMCOCHE=20;
		Coche[] coches=new Coche[NUMCOCHE];
		// llamada al método para crear los coches	.

		int opcion=menu();//opción de menú
		while (opcion!=0) {//menú
			switch (opcion) {//acciones de menú
			case 1://alquilar

				alquilarCoche(coche);
				//código
				break;
			case 2://devolver
				devolverCoche(coche);
				//código
				break;
			case 3://Listar disponibles
				listarCochesDisponibles(coche);
				break;
			case 4://Listar ocupados
				listarCochesAlquilados( coche);
				//código
			}
			opcion = menu();
		}//wehile 
	}//main
	//metodo que crea coches normales con valores aleatorios
	public static void creoCocheNormal(Normal cocheNormal){

		Random alea = new Random();
		String matricula[]={"3053FBW","9140CCH","2526JDD","0009KDW","3456DFK","1234KDD"};
		String marca[]={"opel","seat","renault","peugeot","alfa romeo", "honda"};
		String modelo[]={"corsa","ibiza","clio","206","julieta","civic"};
		String Aparcamiento[]={"Aparcamiento del Ebro","iberPark","Aragonia"};
		Fecha FechaFabricacion = new Fecha((int)(Math.random()*28)+1, (int)(Math.random()*11)+1,(int)(Math.random()*(2017-2000+1))+2000);
		Integer precioDiario;
		precioDiario=alea.nextInt(30-20)+20;

		Fecha hoy = new Fecha(01,03,2018);

		cocheNormal= new Normal(matricula[(int)Math.random()*6],marca[(int)Math.random()*6],modelo[(int)Math.random()*6],
				FechaFabricacion,disponibleNormal(Normal, hoy),precioDiario,Aparcamiento[(int)Math.random()*3]);

	}//creacoche normal
	//metodo que crea coches de lujo con valores aleatorios
	public static void creoCocheLujo(Lujo cocheLujo){
		Random alea = new Random();
		String matricula[]={"3053FBW","9140CCH","2526JDD","0009KDW","3456DFK","1234KDD"};
		String marca[]={"opel","seat","renault","peugeot","alfa romeo", "honda"};
		String modelo[]={"corsa","ibiza","clio","206","julieta","civic"};
		String Aparcamiento[]={"Aparcamiento del Ebro","iberPark","Aragonia"};
		Fecha FechaFabricacion = new Fecha((int)(Math.random()*28)+1, (int)(Math.random()*11)+1,(int)(Math.random()*(2017-2000+1))+2000);
		Integer precioDiario;
		precioDiario=alea.nextInt(60-50)+50;
		Fecha hoy = new Fecha(01,03,2018);

		cocheLujo= new Lujo(matricula[(int)Math.random()*6],marca[(int)Math.random()*6],modelo[(int)Math.random()*6],
				FechaFabricacion,disponibleLujo(Lujo, hoy),precioDiario);

	}//creo un coche de lujo con valores aleatorios
	//visualizar todos los coches
	public static void visualizarCoches(Coche coches[]){
		Leer.mostrarEnPantalla("coches de lujo");
		for(int i=0; i<coches.length;i++){
			if(coches[i] instanceof Lujo){
				coches[i].visualizaTodo();
			}//if

		}//for
		Leer.mostrarEnPantalla("coches normales");
		for(int i=0; i<coches.length;i++){
			if(coches[i] instanceof Normal){
				coches[i].visualizaTodo();
			}//if

		}//for

	}




	//metodo booleano para ver si un coche de lujo esta disponible
	public static Boolean disponibleLujo(Lujo cocheLujo[], Fecha hoy){
		Boolean disponible=false;
		for(int i=0;i<cocheLujo.length;i++){
			if(cocheLujo[i].cocheDisponible(hoy)==disponible){
				Leer.mostrarEnPantalla("coche no disponible");

			}else{
				Leer.mostrarEnPantalla("coche disponible");
			}

		}

		return disponible;

	}
	//metodo booleano para confirmar si un coche normal esta disponible
	public static Boolean disponibleNormal(Normal cocheNormal[], Fecha hoy){
		boolean disponible=false;
		for(int i=0;i<cocheNormal.length;i++){
			if(cocheNormal[i].cocheDisponible(hoy)==disponible){
				Leer.mostrarEnPantalla("coche no disponible");

			}else{
				Leer.mostrarEnPantalla("coche disponible");
			}

		}

		return disponible;

	}
	//metodo para que un coche disponible pueda alquilarse
	public static Boolean alquilarCoche(Coche coche[]){
		Fecha hoy = new Fecha(01,03,2018);
		Boolean disponible =false;
		int opc=0;
		String matricula;
		Integer precioDia;


		matricula=Leer.pedirCadena("dime que coche quieres alquilar, dime la matricula");

		for(int i=0; i<coche.length;i++){
			if(coche[i].getMatricula().equalsIgnoreCase(matricula)&& (disponibleNormal(Normal, hoy)==true || disponibleLujo(Lujo, hoy)==true)){
				Leer.mostrarEnPantalla("el coche esta disponible");
			}else{
				Leer.mostrarEnPantalla("ese coche no esta disponible");
			}//else


		}
		return disponible;
	}//alquilarCoche
	//metodo que al meter una matricula de un coche ocupado pueda devolver el coche
	public static Boolean devolverCoche(Coche coche[]){
		Fecha hoy = new Fecha(01,03,2018);
		Boolean disponible =false;
		String matricula;
		matricula=Leer.pedirCadena("que coche quieres devolver indique su matricula");
		for(int i=0; i<coche.length;i++){
			if(coche[i].getMatricula().equalsIgnoreCase(matricula)&& (disponibleNormal(Normal, hoy)==false || disponibleLujo(Lujo, hoy)==false)){
				Leer.mostrarEnPantalla("el coche esta disponible");
			}else{
				Leer.mostrarEnPantalla("ese coche no esta disponible");
			}//else
			
		}
		return disponible;
	}
	//metodo para listar los coches que estan alquilados
	public static void listarCochesAlquilados(Coche coche[]){
		Fecha hoy = new Fecha(01,03,2018);
		Lujo[] cocheLujo=null;
		Normal[] cocheNormal=null;
		for(int i=0; i<coche.length;i++){
			if(coche[i] instanceof Lujo){
				
				if(disponibleLujo(cocheLujo, hoy)==false){
					coche[i].visualizaTodo();
				}//if
			}//ifpadre
			
		}//for
		for(int i=0; i<coche.length;i++){
			if(coche[i] instanceof Normal){
				
				
				if(disponibleNormal(cocheNormal, hoy)==false){
					coche[i].visualizaTodo();
				}//if
			}//ifpadre
			
		}//for
		
	}//listarCochesAlquilados
	// metodo para listsr los coches que estan disponibles
	public static void listarCochesDisponibles(Coche coche[]){
		Fecha hoy = new Fecha(01,03,2018);
		Lujo[] cocheLujo=null;
		Normal[] cocheNormal=null;
		for(int i=0; i<coche.length;i++){
			if(coche[i] instanceof Lujo){
				
				if(disponibleLujo(cocheLujo, hoy)==true){
					coche[i].visualizaTodo();
				}//if
			}//ifpadre
			
		}//for
		for(int i=0; i<coche.length;i++){
			if(coche[i] instanceof Normal){
				
				
				if(disponibleNormal(cocheNormal, hoy)==true){
					coche[i].visualizaTodo();
				}//if
			}//ifpadre
			
		}//for
		
	}//listarCochesDisponibles
	
	
	

	public static int menu(){
		int opcion;
		Leer.mostrarEnPantalla("1.- Alquilar coche");
		Leer.mostrarEnPantalla("2.- Devolver coche");
		Leer.mostrarEnPantalla("3.- Listado de coches disponibles");
		Leer.mostrarEnPantalla("4.- Listado de coches ocupados");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion=Leer.pedirEntero("elige una opcion valida");
		return opcion;
	}
}
