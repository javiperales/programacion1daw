import java.util.*;
public class EjerDosListInt {

	public static void main(String[] args) {
		ArrayList<Integer> conjunto=new ArrayList<Integer>();	
		LinkedList<Integer> linkconjunto=new LinkedList<Integer>();
		Random alea= new Random();
		int num,num2;
		num=alea.nextInt(15)+1;
		
		System.out.println("se van a generar "+num+" datos");
		for(int i=0; i<num; i++){
			num2=alea.nextInt(15)+1;
			conjunto.add(num2);
			linkconjunto.add(num2);
			
		}
		System.out.print("arrayList "+conjunto);
		System.out.println("");
		//System.out.println("sin orden");
		System.out.print("linkedList "+linkconjunto);
		System.out.println("");
		
	}//main

}//class
