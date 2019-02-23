package ejercicio4_Usuarios;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		///////////////////// PRINCIPAL///////////////////////////////////////
		String nombre = "", contraseņa = "", claveNueva = "";
		TreeMap<String, String> registro = new TreeMap<String, String>();
		Integer op = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		do {

			menu(op);
			op = Libreria.t_pedirEnteroValidar(0, "opcion");
			switch (op) {
			case 1:

				crearUsuario(nombre, contraseņa, registro);

				break;

			case 2:
				BorrarUsuario(nombre, contraseņa, registro);

				break;

			case 3:
				modificarClave(nombre, contraseņa, registro, claveNueva);
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

	public static void crearUsuario(String nombre, String contraseņa, TreeMap<String, String> registro) {
		nombre = Libreria.t_pedirCadena(0, "nombre del usuario");
		contraseņa = Libreria.t_pedirCadena(0, "contraseņa del usuario");
		if (registro.containsKey(nombre)) {
			Libreria.t_pedirCadena(0, "usuario ya existente");

		} else {
			if (!claveValidar(contraseņa)) {
				System.out.println("error");
			} else {
				contraseņa = codificar(contraseņa);
				registro.put(nombre, contraseņa);
			}

		}
	}// crearUsuario

	public static void BorrarUsuario(String nombre, String contraseņa, TreeMap<String, String> registro) {
		nombre = Libreria.t_pedirCadena(0, "usuario que deseas eliminar");
		contraseņa = Libreria.t_pedirCadena(0, "contraseņa del usuario");
		contraseņa = codificar(contraseņa);
		if (registro.containsKey(nombre) && registro.containsValue(contraseņa)) {

			Leer.mostrarEnPantalla("usuario borrado");
			registro.remove(nombre);
		} else {
			System.out.println("usuario  no encontrado");
		}
	}

	public static Boolean claveValidar(String contraseņa) {
		char caracter;

		for (int i = 0; i < contraseņa.length(); i++) {
			if (!((contraseņa.charAt(i) >= 'a' && contraseņa.charAt(i) <= 'z')
					|| (contraseņa.charAt(i) >= 'A' && contraseņa.charAt(i) <= 'Z')
					|| (contraseņa.charAt(i) >= '0' && contraseņa.charAt(i) <= '9'))) {
				System.out.println("contraseņa erronea");
				return false;

			}
		}
		return true;
	}// claveValidar

	public static String codificar(String contraseņa) {
		char caracter;
		String claveAux = "";
		int num = 0;
		num = Leer.pedirEntero("grado de codificacion");
		for (int i = 0; i < contraseņa.length(); i++) {

			caracter = contraseņa.charAt(i);
			caracter = (char) (caracter + num);
			claveAux += "" + caracter;
		} // for
		return claveAux;
	}

	public static String descodificar(String contraseņa) {
		char caracter;
		String claveAux = "";
		int num = 0;
		num = Leer.pedirEntero("grado de codificacion");
		for (int i = 0; i < contraseņa.length(); i++) {

			caracter = contraseņa.charAt(i);
			caracter = (char) (caracter - num);
			claveAux += "" + caracter;
		} // for
		return claveAux;
	}

	public static Boolean existeUsuario(String nombre, String contraseņa, TreeMap<String, String> registro) {
		boolean existe = false;
		if (registro.containsKey(nombre)) {
			existe = true;
		}
		return existe;
	}// existeUsuario

	public static Boolean modificarClave(String nombre, String contraseņa, TreeMap<String, String> registro,
			String claveNueva) {
		Boolean modificar = false;
		nombre = Libreria.t_pedirCadena(0, "nombre de usuario");
		contraseņa = Libreria.t_pedirCadena(0, "contraseņa vieja");
		if (registro.get(nombre).equals(codificar(contraseņa))) {

			if (existeUsuario(nombre, contraseņa, registro) == true) {

				claveNueva = Libreria.t_pedirCadena(0, "nueva contraseņa para el usuario");
				
					
						registro.put(nombre, codificar(claveNueva));

					
				 // ifpadre
			} else {
				System.out.println("usuario no encontrado");
			}
		} else {
			System.out.println("contraseņa erronea");
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
