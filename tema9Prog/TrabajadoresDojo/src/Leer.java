import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author yo
 *
 */
public class Leer {
	
	/**
	 * M�todo para imprimir mensaje que se repet�a
	 */
	static public void mensaje(String mensage){
		System.out.println(mensage);
	}
	
	/**
	 * @param texto
	 * @return
	 */
	static public String pedirCadena(final String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String dato="";
		boolean error = true;
		while (error) {
			try {
				dato="";
				mensaje(texto);
				dato = dataIn.readLine();
				error=false;
			} catch (IOException e) {
				mensaje("Vuelve a introducir el dato, por favor: ");
				error = true;
			}
		}
		return dato;

	}
	
	/**
	 * @param texto
	 * @return
	 */
	static public int pedirEntero(final String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		int dato=0;
		boolean error = true;
		while (error) {
			try {
				mensaje(texto);
				dato = Integer.parseInt(dataIn.readLine());
				error=false;
			} catch (IOException e) {
				mensaje("Vuelve a introducir el dato, por favor");
				error = true;
			} catch(NumberFormatException e){
				mensaje("El dato introducido no es entero");
				mensaje("Vuelve a introducir el dato, por favor: ");
				error=true;
			}
		}
		return dato;

	}
	
	/**
	 * @param texto
	 * @return
	 */
	static public double pedirDecimal(final String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		double dato=0;
		boolean error = true;
		while (error) {
			try {
				mensaje(texto);
				dato = Double.parseDouble(dataIn.readLine());
				error=false;
			} catch (IOException e) {
				mensaje("Vuelve a introducir el dato, por favor: ");
				error = true;
			} catch(NumberFormatException e){
				mensaje("El dato introducido no es decimal");
				mensaje("Vuelve a introducir el dato, por favor: ");
				error=true;
			}
		}
		return dato;

	}
	/**
	 * @param texto
	 * @return
	 */
	static public float pedirFloat(final String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		float dato=0;
		boolean error = true;
		while (error) {
			try {
				mensaje(texto);
				dato = Float.parseFloat(dataIn.readLine());
				error=false;
			} catch (IOException e) {
				mensaje("Vuelve a introducir el dato, por favor: ");
				error = true;
			} catch(NumberFormatException e){
				mensaje("El dato introducido no es decimal");
				mensaje("Vuelve a introducir el dato, por favor: ");
				error=true;
			}
		}
		return dato;

	}
}
