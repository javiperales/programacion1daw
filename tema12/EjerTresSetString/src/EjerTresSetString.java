import java.util.*;
public class EjerTresSetString {

	public static void main(String[] args) {
		HashSet<String> conjunto=new HashSet<String>();	
		LinkedHashSet<String> linkconjunto=new LinkedHashSet<String>();
		TreeSet<String>Treeconjunto= new TreeSet<String>();
		Random alea = new Random();
		String[]palabra={"este","oeste","montaña","norte","sur","bajo","frio","aleatorio","pc","teclado","raton","oscar","portatil","pantalla","musica"};
		int num;
		
		num=alea.nextInt(15)+1;
		System.out.println("se van a generar "+num+" datos");
		for(int i=0; i<num; i++){
			conjunto.add(palabra[i]);
			linkconjunto.add(palabra[i]);
			Treeconjunto.add(palabra[i]);
		}
		System.out.print("HashShet "+conjunto);
		System.out.println("");
		System.out.println("sin orden");
		System.out.print("linkedhashSet "+linkconjunto);
		System.out.println("");
		System.out.println(" orden de inserccion");
		System.out.print("TreeSet "+Treeconjunto);
		System.out.println("");
		System.out.println(" orden alfabetico");
		System.out.println("foreach");
		
for(String texto: conjunto){
			
			System.out.print(texto+" ");
		}
		System.out.println("");
		for(String texto: linkconjunto){
			System.out.print(texto+" ");
		}
		System.out.println("");
		for(String texto: Treeconjunto){
			System.out.print(texto+" ");
		}
		
	
	}//main

}//class
