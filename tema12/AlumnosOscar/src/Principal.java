import java.util.*;
public class Principal {

	public static void main(String[] args) {

		TreeMap<String,Integer> mapaDeNombresYNotas=new TreeMap<String,Integer>();
		TreeMap<Integer,String> mapaDeNotasYCadenaDeNombres=new TreeMap<Integer,String>();
		TreeMap<Integer,TreeSet<String>> mapaDeNotasYTreeSetDeNombre=new TreeMap<Integer,TreeSet<String>>();
		String nombre;
		Integer nota;
		System.out.println(" ");
		nombre=Leer.pedirCadena("Introduce el nombre del alumno. * - para salir");
		while(!nombre.equals("*")){
			
			if(!mapaDeNombresYNotas.containsKey(nombre)){
				if(!nombre.equals("*")){
					nota=Leer.pedirEntero("Introduce la nota de "+nombre);
					mapaDeNombresYNotas.put(nombre, nota);
				}//if asterisco
			}else{
				System.out.println(nombre+" ya existe.");
				nota=Leer.pedirEntero("Introduce una nota para "+nombre);
				mapaDeNombresYNotas.put(nombre, nota);
			}//else si existe la clave con ese nombre
			nombre=Leer.pedirCadena("Introduce el nombre del alumno. * - para salir");
		}//while
		
		System.out.println("Listado ordenado por nombre");
		for (String clave : mapaDeNombresYNotas.keySet()) {
			Integer valor=mapaDeNombresYNotas.get(clave);
			System.out.println(clave + " " + valor);
		}
		System.out.println();	
		for (String clave : mapaDeNombresYNotas.keySet()) {
			Integer valor=mapaDeNombresYNotas.get(clave);
			if(mapaDeNotasYCadenaDeNombres.containsKey(valor)){
				clave+=" * "+mapaDeNotasYCadenaDeNombres.get(valor);
				mapaDeNotasYCadenaDeNombres.put(valor, clave);
			}else{
				mapaDeNotasYCadenaDeNombres.put(valor, clave);
			}//elseif
		}//for each
		
		for (String clave : mapaDeNombresYNotas.keySet()) {
			Integer valor=mapaDeNombresYNotas.get(clave);
			if(mapaDeNotasYTreeSetDeNombre.containsKey(valor)){
				clave+=" * "+mapaDeNotasYTreeSetDeNombre.get(valor).toString();				
				mapaDeNotasYTreeSetDeNombre.put(valor,new  TreeSet<String>());
				mapaDeNotasYTreeSetDeNombre.get(valor).add(clave);
			}else{
				mapaDeNotasYTreeSetDeNombre.put(valor,new  TreeSet<String>());
				mapaDeNotasYTreeSetDeNombre.get(valor).add(clave);
			}//elseif
		}//for each
		System.out.println("Listado ordenado por nota.");
		for (Integer clave : mapaDeNotasYCadenaDeNombres.keySet()) {
			System.out.println(clave+" "+ mapaDeNotasYCadenaDeNombres.get(clave));			
		}//for each
		System.out.println("Listado por nota con TreeSet");
		for (Integer clave : mapaDeNotasYTreeSetDeNombre.keySet()) {
			System.out.println(clave+" "+ mapaDeNotasYTreeSetDeNombre.get(clave));			
		}//for each
	}//main
}//class