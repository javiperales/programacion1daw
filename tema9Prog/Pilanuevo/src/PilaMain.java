
public class PilaMain {

	public static void main(String[] args) {
		pila origen = new pila();
		
		pila destino = new pila();
		for(int i=0; i<20;i++){			
			origen.add(i);
		}//for
		
		for(int i= origen.getCima()-1; i >=0; i--){
			Leer.mostrarEnPantalla(""+ origen.Pop());
		}
		
		
		origen.copiar(destino);
		
		
		
	}//main

}//class
