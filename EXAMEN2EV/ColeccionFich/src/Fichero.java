
import java.util.Scanner;
import java.io.*;

public class Fichero {

	String archivo;// atributo de Fichero que será de la clase Fichero donde
					// agruparemos
	// todos los métodos relacionados con File

	public Fichero() {
		archivo = null;
	}

	public Fichero(String nombre) {
		archivo = nombre;
	}

	public static String nombreFichero() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String nombre;
		System.out.println("Nombre del fichero (incluye la ruta y doble contrabarra) ");
		nombre = teclado.nextLine();
		return nombre;
	}

	public static char separadorFichero() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		char separador;
		System.out.println("Carácter de separación entre atributos ");
		separador = teclado.nextLine().charAt(0);
		return separador;
	}

	public void leeFichero(Coleccion col, char separador) {
		FileReader fr = null;
		BufferedReader br = null;
		Disco disc = new Disco();
		int pos, desde, cont;
		String codean = "";
		String titulo = "";
		String artista = "";
		int ncanciones = 0;
		float precio = 0.0f;
		Fecha fechacompra = null;
		String trozo;
		int anio = 0, mes = 0, dia = 0;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				// System.out.println(linea);
				pos = -1;
				cont = 1;
				do {
					pos++;
					desde = pos;
					pos = linea.indexOf(separador, pos);
					if (pos == -1) {
						trozo = linea.substring(desde);
					} else {
						trozo = linea.substring(desde, pos);
					}
					switch (cont) {
					case 1:
						codean = trozo;
						break;
					case 2:
						titulo = trozo;
						break;
					case 3:
						artista = trozo;
						break;
					case 4:
						ncanciones = Integer.parseInt(trozo);
						break;
					case 5:
						precio = Float.parseFloat(trozo);
						break;
					case 6:
						dia = Integer.parseInt(trozo);
						break;
					case 7:
						mes = Integer.parseInt(trozo);
						break;
					case 8:
						anio = Integer.parseInt(trozo);
						break;
					}
					cont++;
				} while (pos != -1);
				fechacompra = new Fecha(dia, mes, anio);
				if (fechacompra.getDia() == 0) {
					fechacompra = new Fecha();
				}
				disc = new Disco(codean, titulo, artista, ncanciones, precio, fechacompra);
				col.añadirdisco(disc);
			}
			System.out.println("Fin de lectura de fichero. Registros " + (col.getIndice()));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void escribeFichero(Coleccion col, char separador) {

		// FileWriter fw = null;
		PrintWriter pw = null;
		String linea = "";
		// Disco disc=new Disco;
		int cont = col.getIndice();
		try {
			pw = new PrintWriter(archivo);

			for (int i = 0; i < cont; i++) {

				linea = col.getDisco(i).escribeFichero(separador);
				// pw.write(linea,0,linea.length());
				pw.write(linea);
				pw.write("\r\n");
			}
			System.out.println("Escritos " + cont + " registros en el fichero");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != pw)
					pw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
