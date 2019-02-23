package ejercicioPila;
import java.util.*;
public class Pila {

	/*Implementar el tipo abstracto de datos pila de enteros (se podrán almacenar un
número indeterminado de números enteros y a la hora de extraer información el
último elemento que se haya añadido será el primero en salir) con las operaciones de:
1 Apilar en la cima
2 Desapilar de la cima
3 Número de elementos apilados
4 Visualización de elementos de la pila. Tener en cuenta que al mostrar un
elemento de una pila lo borramos.
*/
	public static void main(String[] args) {
		////////////////////////////principal///////////////////////////////////////////////////
		ArrayList<Integer> pila = new ArrayList<Integer>();
		int num=0;
		int op=0;
		do{
			menu();
			op=Leer.pedirEntero("elige opcion");
			
			
			
			switch(op){
			case 1:
				
				apilarCima(num,pila);
				break;
			case 2:
				desapilarCima(num, pila);
				break;
			case 3:
				numeroDeElementos(pila);
				break;
			case 4:
				mostrarPila(pila);
				break;
			}
		}while(op!=0);
		
		
			
	}//main
	public static void apilarCima(Integer num,ArrayList<Integer> pila){
		num=Leer.pedirEntero("dame un numero");
		pila.add(num);
		
	}//
	
	public	static  void desapilarCima(int num,ArrayList<Integer> pila){
		num=pila.size()-1;
		System.out.println(pila.size());
		pila.remove(num);
		
		
	}//desapilarCima
		
	public static void mostrarPila(ArrayList<Integer> pila){
		for(int i=0; i<pila.size();i++){
			System.out.println(pila);
		}
	}
	public static void numeroDeElementos(ArrayList<Integer> pila){
	Integer num;
	num=pila.size();
	System.out.println("hay "+num+ " en mi lista");
	}//numeroDeElementos
	public static void menu(){
		
		Leer.mostrarEnPantalla("1-apilar numero");
		Leer.mostrarEnPantalla("2-desapilar numero");
		Leer.mostrarEnPantalla("3-mostrar el numero de elementos que hay en la pila");
		Leer.mostrarEnPantalla("4-visualizar elementos que hay en la pila");
		Leer.mostrarEnPantalla("0-salir");
	}
}//class
