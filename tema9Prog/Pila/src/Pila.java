import java.util.*;
public class Pila {

	public static void main(String[] args) {
		Integer pila[]= new Integer[6];
		Integer pila1[] = new Integer[5];
		Random alea = new Random();
		int num=alea.nextInt(50)+1;
		Integer n = null;
		int opc=0;
		
		Llenar(pila);
		
		System.out.println("---------------------------");
		
		
		
		
		menu();
		do{
		opc=Leer.pedirEntero("dime una opcion");
		switch(opc){
		case 1:
			mostrar(pila);
			break;
			
		case 2:
			mostrarAlreves(pila);
			
			break;
			
		case 3:
			vaciar(pila);
			break;
			
		case 4:
			
			break;
		case 5:
			anadir(pila,n);
			break;
			
		case 6:
			llena(pila);
			break;
			
		case 7:
			
			break;
		
		
		
		
		
		
		}
		}while(opc!=0);
		
		
		/*do{
		 * int opc;
			Leer.mostrarEnPantalla("elige una opcion valida");
			menu();
		}*/
		
		
	}//main

		public static Integer mostrar(Integer pila[] ){
			Integer n=0;
			for(int i=pila.length-1; i>=0; i--){
				if(pila[i]!=null){
				System.out.println(pila[i]);
				}else{
					n=i;
				}
				
			}//for
			return n;
			
		}//mostrar
		
		public static void Llenar(Integer pila[] ){	
			int num, num1;

			num=Leer.pedirEntero("numero para añadir a la pila");
			
			for(int i=0; i<=num-1; i++){
				num1=Leer.pedirEntero("numero para añadir a la pila");
				pila[i]= num1;	
				
			}
			
			
		
						
		}//llenar
		
		public static void copiarArray(){
			
			
			
		}
		
		public static void anadir(Integer pila[] , Integer n ){
			int num, numerosAñadir;
			numerosAñadir=Leer.pedirEntero("cuantos numeros quieres añadir");
			
			for(int i=n; i<pila.length;i++){
				
					num=Leer.pedirEntero("numero para añadir a la pila");	
					pila[i]= num;
				}
				
			}//for
			
	
		
		public static void mostrarAlreves(Integer pila[]){
			for(int i=0; i<pila.length ;i++){
				if(pila[i]!=null){ //si pila de posicion es distinto a nulo que muestre el valor
					System.out.println(pila[i]);
					}
					
			}	
		}
		
		public static void vaciar(Integer pila[]){
			for (int i = 0; i < pila.length; i++) {
				pila[i]=null;
				
			}
		}//vaciar
		
		public static Boolean llena(Integer pila[]){
			Boolean lleno=false;
			for (int i=0; i<pila.length;i++){
				if(pila[i]==pila.length){
					System.out.println("la pila esta llena");
					lleno=true;
				}else{
					System.out.println("la pila no esta llena");
					lleno=false;
				}
				
			}
			return lleno;
		}
		
		public static void menu(){
			System.out.println("1.mostrar en formato lifo");
			System.out.println("2.mostrar en formato fifo");
			System.out.println("3.copiar un array");
			System.out.println("4.borrar una pila");
			System.out.println("5.añadir un elemento a la pila");
			System.out.println("6.mostrar si la pila esta llena");
			
		}
		
		
}//class
