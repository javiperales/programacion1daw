package ejercicio4_Usuarios;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		///////////////////// PRINCIPAL///////////////////////////////////////
		String nombre = "", contrase�a = "", claveNueva = "";
		TreeMap<String, String> registro = new TreeMap<String, String>();
		Integer op = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		do {

			menu(op);
			op = Libreria.t_pedirEnteroValidar(0, "opcion");
			switch (op) {
			case 1:

				crearUsuario(nombre, contrase�a, registro);

				break;

			case 2:
				BorrarUsuario(nombre, contrase�a, registro);

				break;

			case 3:
				modificarClave(nombre, contrase�a, registro, claveNueva);
				break;

			case 4:
				Libreria.recorreTreeMapStrings(registro);
				System.out.print(registro);
				System.out.println(" ");
				//Libreria.f_escribirFichero(registro, "fichero.txt");
				Libreria.f_escribirFicheroXML(registro, "usuarios");
				break;
			}

		} while (op != 0);

	}// main

	public static void crearUsuario(String nombre, String contrase�a, TreeMap<String, String> registro) {
		nombre = Libreria.t_pedirCadena(0, "nombre del usuario");
		contrase�a = Libreria.t_pedirCadena(0, "contrase�a del usuario");
		if (registro.containsKey(nombre)) {
			Libreria.t_pedirCadena(0, "usuario ya existente");

		} else {
			if (!claveValidar(contrase�a)) {
				System.out.println("error");
			} else {
				contrase�a = codificar(contrase�a);
				registro.put(nombre, contrase�a);
			}

		}
	}// crearUsuario

	public static void BorrarUsuario(String nombre, String contrase�a, TreeMap<String, String> registro) {
		nombre = Libreria.t_pedirCadena(0, "usuario que deseas eliminar");
		contrase�a = Libreria.t_pedirCadena(0, "contrase�a del usuario");
		contrase�a = codificar(contrase�a);
		if (registro.containsKey(nombre) && registro.containsValue(contrase�a)) {

			Leer.mostrarEnPantalla("usuario borrado");
			registro.remove(nombre);
		} else {
			System.out.println("usuario  no encontrado");
		}
	}

	public static Boolean claveValidar(String contrase�a) {
		char caracter;

		for (int i = 0; i < contrase�a.length(); i++) {
			if (!((contrase�a.charAt(i) >= 'a' && contrase�a.charAt(i) <= 'z')
					|| (contrase�a.charAt(i) >= 'A' && contrase�a.charAt(i) <= 'Z')
					|| (contrase�a.charAt(i) >= '0' && contrase�a.charAt(i) <= '9'))) {
				System.out.println("contrase�a erronea");
				return false;

			}
		}
		return true;
	}// claveValidar

	public static String codificar(String contrase�a) {
		char caracter;
		String claveAux = "";
		int num = 0;
		num = Leer.pedirEntero("grado de codificacion");
		for (int i = 0; i < contrase�a.length(); i++) {

			caracter = contrase�a.charAt(i);
			caracter = (char) (caracter + num);
			claveAux += "" + caracter;
		} // for
		return claveAux;
	}

	public static String descodificar(String contrase�a) {
		char caracter;
		String claveAux = "";
		int num = 0;
		num = Leer.pedirEntero("grado de codificacion");
		for (int i = 0; i < contrase�a.length(); i++) {

			caracter = contrase�a.charAt(i);
			caracter = (char) (caracter - num);
			claveAux += "" + caracter;
		} // for
		return claveAux;
	}

	public static Boolean existeUsuario(String nombre, String contrase�a, TreeMap<String, String> registro) {
		boolean existe = false;
		if (registro.containsKey(nombre)) {
			existe = true;
		}
		return existe;
	}// existeUsuario

	public static Boolean modificarClave(String nombre, String contrase�a, TreeMap<String, String> registro,
			String claveNueva) {
		Boolean modificar = false;
		nombre = Libreria.t_pedirCadena(0, "nombre de usuario");
		contrase�a = Libreria.t_pedirCadena(0, "contrase�a vieja");
		if (registro.get(nombre).equals(codificar(contrase�a))) {

			if (existeUsuario(nombre, contrase�a, registro) == true) {

				claveNueva = Libreria.t_pedirCadena(0, "nueva contrase�a para el usuario");
				
					
						registro.put(nombre, codificar(claveNueva));

					
				 // ifpadre
			} else {
				System.out.println("usuario no encontrado");
			}
		} else {
			System.out.println("contrase�a erronea");
		}
		return modificar;
	}// modificar clave

	public static void menu(Integer op) {
		System.out.println("1-registrarse");
		System.out.println("2-borrar usuarios");
		System.out.println("3-modificar claves de un usuario");
		System.out.println("4-visualizar usuarios");
		System.out.println("0-Salir");

	}// menu
}// class