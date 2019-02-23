package manolo;

import java.util.ArrayList;
import java.util.TreeMap;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, ArrayList<String>> arbol=new TreeMap<Integer, ArrayList<String>>();
		ArrayList<String> array=new ArrayList<String>();
		array.add("gfdhf");
		array.add("nhj,k");
		array.add("saarw");
		array.add("ghmnthj");
		array.add("ttby");
		arbol.put(1, array);
		array=new ArrayList<String>();
		array.add("fdgbdf");
		array.add("dfgb");
		array.add("");
		array.add("dfgbe");
		array.add("");
		arbol.put(2, array);
		array=new ArrayList<String>();
		array.add("");
		array.add("");
		array.add("dfgb");
		array.add("");
		array.add("");
		arbol.put(3, array);
		array=new ArrayList<String>();
		array.add("");
		array.add("");
		array.add("");
		array.add("");
		array.add("");
		arbol.put(4, array);
		array=new ArrayList<String>();
		array.add("");
		array.add("sdfvs");
		array.add("");
		array.add("ddddd");
		array.add("");
		
		
		for(Integer clave:arbol.keySet()){//tipo de dato de la clave: nombre coleccion.keySet para mostrar la clave
			System.out.println(clave);
			ArrayList<String>valores=arbol.get(clave);
			System.out.println(valores);
			for(String valorA: valores){//tipo de dato de el valor asociado: nombre del ArrayList
				System.out.println(valorA);//imprimir el valor asociado del TreeMap
			}
			 
			
		}
	}

}
