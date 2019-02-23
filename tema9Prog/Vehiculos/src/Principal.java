import java.lang.reflect.Array;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
	//////////////////////////////principal//////////////////////////////////////////////
		Random alea = new Random();
		String marca[]={"opel","renault","ford","ferrari","seat","chevrolet","mercedes"};
		String modelo[]={"astra","clio","mustang","scenic","ibiza","altea","clase a"};
		int cilindrada[]={100,110,130,140,150,160,170};
		String marc, model;
		Integer cil, precio ,numLineas;
		int cocheAzar;
		
		vehiculo coche1[];
		cocheAzar=alea.nextInt(20)+1;
		coche1= new vehiculo[cocheAzar];
		int opc=0;
		Leer.mostrarEnPantalla("se han generado " +cocheAzar + " coches "  );
		numLineas=Leer.pedirEntero("numero de lineas para mostrar los coches");
		do{
			System.out.println("");
			System.out.println("----------------------------");
			menu();
			opc=Leer.pedirEntero("elige opcion");
			
			switch(opc){
			case 1:
				for(int i=0; i<coche1.length; i++){
					marc=marca[alea.nextInt(marca.length)];
					model=modelo[alea.nextInt(modelo.length)];
					cil=cilindrada[alea.nextInt(cilindrada.length)];
					precio=alea.nextInt(10000)+50000;
					coche1[i]= new vehiculo(marc,model,cil,precio);
				}//for
				
				break;
				
			case 2:
				Arrays.sort(coche1 , new ordenaMarca());
				listar(coche1 ,numLineas);
				break;
				
			case 3:
				Arrays.sort(coche1 , new ordenaModelo());
				listar(coche1 ,numLineas);
				break;
				
			case 4:
				Arrays.sort(coche1 , new ordenaPrecio());
				listar(coche1 ,numLineas);
				break;
				
			case 5:
				Arrays.sort(coche1 , new ordenaCilindrada());
				listar(coche1 ,numLineas);
				break;
			case 6:
				for(int i=0; i<coche1.length;i++){
					coche1[i].verCoche();
					
				}
				
				break;
			}
			
		}while(opc!=0);
		
	}//main

	public static void menu(){
		System.out.println("1.generar coches automaticamente");
		System.out.println("2.ordenar coches por marca");
		System.out.println("3.ordenar coches por modelo ");
		System.out.println("4.ordenar coches por precio");
		System.out.println("5.ordenar coches por cilindrada");
		System.out.println("6.visualizar los coches");
		System.out.println("0.salir");
		
	}//menu
	
	public static void listar(vehiculo automoviles[], int numLineas){
		int i;
		String cadena="";
		
		for( i =0; i<automoviles.length; i++){
			
			if(i>0 && i % numLineas==0){
				do{
					cadena=Leer.pedirCadena("pulsa intro");
					
				}while(cadena.length()>0);
			}//if
			System.out.println(automoviles[i].verCoche());
			
		}//for	
	}//listar
	
	
	
}//class
