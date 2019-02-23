import java.lang.invoke.SwitchPoint;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		//////////////principal////////////////////
		/*crear usuarios con contraseña cifrada, guardarlos en un treeMap y poder añadir , modificar y borrar usuarios*/

		TreeMap<String,String> cuenta = new TreeMap<String,String>();
		String nombre, contraseña, cifrada="";
		char caracter;
	//	nombre=Libreria.t_pedirCadena(0, "nombre del usuario ");
		//contraseña=Libreria.t_pedirCadena(0, "contraseña del usuario");
	///	registrar(cuenta, nombre, cifrada);

		//cifrada = cifrarContraseña(contraseña, cifrada);
		int op;
		
		do{
			
			menu();
			op=Libreria.t_pedirEnteroValidar(0, "elije opcion");
			
		switch (op) {
		case 1:
			nombre=Libreria.t_pedirCadena(0, "nombre del usuario ");
			contraseña=Libreria.t_pedirCadena(0, "contraseña del usuario");
			registrar(cuenta, nombre, contraseña);
			break;
		case 2:
			borrarUsuario(cuenta);
			break;
			
		case 3:
			modificarContraseña(cuenta);
			break;
			
		case 4:
			mostrarUsuarios(cuenta);
			break;
		default:
			break;
		}
			
			
			
		}while(op!=0);

	}//main

	private static String cifrarContraseña(String contraseña) {
		char caracter;
		String cifrada="";
		for(int i=0;i<contraseña.length();i++){
			caracter=contraseña.charAt(i);
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

	public static  void registrar(TreeMap<String,String> cuenta, String nombre, String contraseña){
		if(cuenta.containsKey(nombre)){
			System.out.println("el nombre ya esta registrado");
		}else{
			cuenta.put(nombre,cifrarContraseña(contraseña));
		}
	}//registrar

	public static void borrarUsuario(TreeMap<String,String> cuenta){
		String nombreAborrar, contraseña;
		nombreAborrar=Libreria.t_pedirCadena(0, "nombre que deseas borrar");
		if(cuenta.containsKey(nombreAborrar)){
			contraseña=Libreria.t_pedirCadena(0, "contraseña del usuario");
			if(cuenta.get(nombreAborrar).equals(cifrarContraseña(contraseña))){
				cuenta.remove(nombreAborrar);
				System.out.println("usuario borrado con exito");
			}else{
				System.out.println("contraseña incorrecta");
			}

		}else {
			System.out.println("nombre de usuario incorrecto");
		}
	}//borrar

	public static void modificarContraseña(TreeMap<String,String> cuenta){
		String nombre, contraseñanueva="", contraseña;
		nombre=Libreria.t_pedirCadena(0, "nombre que deseas modificar contraseña");
		if(cuenta.containsKey(nombre)){
			contraseña=Libreria.t_pedirCadena(0, "contraseña del usuario");
			if(cuenta.get(nombre).equals(cifrarContraseña(contraseña))){
				contraseñanueva=Libreria.t_pedirCadena(0, "nueva contraseña");
				cuenta.put(nombre, cifrarContraseña(contraseñanueva));
				System.out.println("usuario modificado con exito");
			}else{
				System.out.println("contraseña incorrecta");
			}

		}else {
			System.out.println("nombre de usuario incorrecto");
		}
		
	}//modificar
	
	public static void mostrarUsuarios(TreeMap<String,String> cuenta){
		for (String nombre : cuenta.keySet()) {
			String contraseña =cuenta.get(nombre);
			System.out.println(nombre+" "+contraseña);
		}
	}//mostrar
	
	
}//class
