import java.util.*;
public class TreemapNotasAlumnosPorApellido {

	public static void main(String[] args) {
		TreeMap<String,Integer> treemap= new TreeMap<String,Integer>();
		String alumnos[] ={"Javi","Antonio","Pedro","Oscar","Pablo","Alejandro","David","Ivan","Zacarias"};
		Integer notas[]={10,9,8,7,6,5,4,3,2,1,0};
		Random alea= new Random();
		
		System.out.println("listado de alumnos");
		
		
		
		for(int i=0; i<alumnos.length;i++){
			Integer num=notas[alea.nextInt(notas.length)];
			treemap.put(alumnos[i], num);
			
		}
		System.out.print(treemap);
		
for(String texto: treemap.keySet()){
			
			System.out.println(texto+" "+treemap.get(texto));
		}//foreach
	}

}
