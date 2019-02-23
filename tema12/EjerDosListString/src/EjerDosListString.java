import java.util.*;
public class EjerDosListString {

	public static void main(String[] args) {
		ArrayList<String> conjunto=new ArrayList<String>();	
		LinkedList<String> linkconjunto=new LinkedList<String>();
		String[]palabra={"este","oeste","montaña","norte","sur","bajo","frio","aleatorio","pc","teclado","raton","oscar","portatil","pantalla","musica"};
		int num;
		Random alea= new Random();
		num=alea.nextInt(15)+1;
		System.out.println("se van a generar "+num+" datos");
		
		for(int i=0; i<num; i++){
			conjunto.add(palabra[i]);
			linkconjunto.add(palabra[i]);
			
		}
		System.out.print("ArrayList "+conjunto);
		System.out.println("");
		System.out.print("LinkedList "+linkconjunto);
		System.out.println("");
		System.out.println("foreach");
		
for(String texto: conjunto){
			
			System.out.print(texto+" ");
		}
		System.out.println("");
		for(String texto: linkconjunto){
			System.out.print(texto+" ");
		}
		System.out.println("");
		
		
		

	}

}
