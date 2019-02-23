import java.lang.invoke.SwitchPoint;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		//////////////principal////////////////////
		/*crear usuarios con contrase�a cifrada, guardarlos en un treeMap y poder a�adir , modificar y borrar usuarios*/

		TreeMap<String,String> cuenta = new TreeMap<String,String>();
		String nombre, contrase�a, cifrada="";
		char caracter;
	//	nombre=Libreria.t_pedirCadena(0, "nombre del usuario ");
		//contrase�a=Libreria.t_pedirCadena(0, "contrase�a del usuario");
	///	registrar(cuenta, nombre, cifrada);

		//cifrada = cifrarContrase�a(contrase�a, cifrada);
		int op;
		
		do{
			
			menu();
			op=Libreria.t_pedirEnteroValidar(0, "elije opcion");
			
		switch (op) {
		case 1:
			nombre=Libreria.t_pedirCadena(0, "nombre del usuario ");
			contrase�a=Libreria.t_pedirCadena(0, "contrase�a del usuario");
			registrar(cuenta, nombre, contrase�a);
			break;
		case 2:
			borrarUsuario(cuenta);
			break;
			
		case 3:
			modificarContrase�a(cuenta);
			break;
			
		case 4:
			mostrarUsuarios(cuenta);
			break;
		default:
			break;
		}
			
			
			
		}while(op!=0);

	}//main

	private static String cifrarContrase�a(String contrase�a) {
		char caracter;
		String cifrada="";
		for(int i=0;i<contrase�a.length();i++){
			caracter=contrase�a.charAt(i);
			caracter=(char)(caracter+2);
			cifrada=cifrada+caracter;

		}//for
		return cifrada;
	}



	public static void menu() {
		System.out.println("1-registrarse");
		System.out.println("2-borrar usuarios");
		System.out.println("3-modificar claves de un usuario");
		System.out.println("4-visualizar usuarios");
		System.out.println("0-Salir");

	}// menu

	public static  void registrar(TreeMap<String,String> cuenta, String nombre, String contrase�a){
		if(cuenta.containsKey(nombre)){
			System.out.println("el nombre ya esta registrado");
		}else{
			cuenta.put(nombre,cifrarContrase�a(contrase�a));
		}
	}//registrar

	public static void borrarUsuario(TreeMap<String,String> cuenta){
		String nombreAborrar, contrase�a;
		nombreAborrar=Libreria.t_pedirCadena(0, "nombre que deseas borrar");
		if(cuenta.containsKey(nombreAborrar)){
			contrase�a=Libreria.t_pedirCadena(0, "contrase�a del usuario");
			if(cuenta.get(nombreAborrar).equals(cifrarContrase�a(contrase�a))){
				cuenta.remove(nombreAborrar);
				System.out.println("usuario borrado con exito");
			}else{
				System.out.println("contrase�a incorrecta");
			}

		}else {
			System.out.println("nombre de usuario incorrecto");
		}
	}//borrar

	public static void modificarContrase�a(TreeMap<String,String> cuenta){
		String nombre, contrase�anueva="", contrase�a;
		nombre=Libreria.t_pedirCadena(0, "nombre que deseas modificar contrase�a");
		if(cuenta.containsKey(nombre)){
			contrase�a=Libreria.t_pedirCadena(0, "contrase�a del usuario");
			if(cuenta.get(nombre).equals(cifrarContrase�a(contrase�a))){
				contrase�anueva=Libreria.t_pedirCadena(0, "nueva contrase�a");
				cuenta.put(nombre, cifrarContrase�a(contrase�anueva));
				System.out.println("usuario modificado con exito");
			}else{
				System.out.println("contrase�a incorrecta");
			}

		}else {
			System.out.println("nombre de usuario incorrecto");
		}
		
	}//modificar
	
	public static void mostrarUsuarios(TreeMap<String,String> cuenta){
		for (String nombre : cuenta.keySet()) {
			String contrase�a =cuenta.get(nombre);
			System.out.println(nombre+" "+contrase�a);
		}
	}//mostrar
	
	
}//class
