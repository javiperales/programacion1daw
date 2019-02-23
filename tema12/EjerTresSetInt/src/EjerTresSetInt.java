import java.util.HashSet;
import java.util.*;
public class EjerTresSetInt {

	public static void main(String[] args) {
		HashSet<Integer> conjunto=new HashSet<Integer>();	
		LinkedHashSet<Integer> linkconjunto=new LinkedHashSet<Integer>();
		TreeSet<Integer>Treeconjunto= new TreeSet<Integer>();
		
		Random alea = new Random();
		int num,num2;
		num2=alea.nextInt(15)+1;
		System.out.println("se van a generar "+num2+" datos");
		
		for(int i=0;i<=num2-1;i++){
		num=alea.nextInt(1000)+8000;
			conjunto.add(num);
			linkconjunto.add(num);
			Treeconjunto.add(num);
		}
		System.out.print("HashShet "+conjunto);
		System.out.println("");
		System.out.print("linkedhashSet "+linkconjunto);
		System.out.println("");
		System.out.print("TreeSet "+Treeconjunto);
		System.out.println("");
		
		System.out.println("foreach");
		
		for(Integer numero: conjunto){
			
			System.out.print(numero+" ");
		}
		System.out.println("");
		for(Integer numero: linkconjunto){
			System.out.print(numero+" ");
		}
		System.out.println("");
		for(Integer numero: Treeconjunto){
			System.out.print(numero+" ");
		}
		
		
	}

}
