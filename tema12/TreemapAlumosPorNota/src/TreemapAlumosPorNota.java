import java.util.TreeMap;
import java.util.*;
public class TreemapAlumosPorNota {

	public static void main(String[] args) {
		///////////////principal///////////////////
		TreeMap<Integer,ArrayList<String>> treemap= new TreeMap<Integer,ArrayList<String>>();
		
		String apellido="";
		Integer nota;
		Scanner teclado = new Scanner(System.in);
		System.out.println("apellido del alumno");
		apellido=teclado.nextLine();


		do{
			do{	
			System.out.println("nota del alumno");
			nota=teclado.nextInt();
			if(treemap.containsKey(nota)){
				treemap.get(nota).add(apellido);
				//ArrayList<String> temp=treemap.get(nota);
				//temp.add(apellido);
			}else{
				ArrayList<String> Arraynombre= new ArrayList<String>();
				Arraynombre.add(apellido);
				treemap.put(nota,Arraynombre);
			}//else
			}while(nota<0 || nota>10);
			teclado.nextLine();

			System.out.println("apellido del alumno,* para salir");
			apellido=teclado.nextLine();
		}while(!apellido.equals("*"));
		
		
		

		/*for(Integer notaAlu: treemap.keySet()){

			System.out.println("la nota "+notaAlu+" la han sacado "+treemap.get(notaAlu));
		}*/
		
		for(Integer notaAlu: treemap.keySet()){
			for(String apellidoAlu : treemap.get(notaAlu)){
			System.out.println(apellidoAlu+" ha sacado un "+notaAlu);	
			}
		}
		
		

	}//main

}//class
