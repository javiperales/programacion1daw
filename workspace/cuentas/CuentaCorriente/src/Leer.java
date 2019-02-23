
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Leer {

	static public String pedirCadena(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";

		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;					
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			break;
		case -1://solo una vez
			boolean er = true;
			while (er) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					er=false;					
				} catch (IOException e) {
					System.out.println("Error dato mal introducido");
					er = false;
				}
			}

			break;


		}
		return dato;

	}

	static public int pedirEnteroValidar(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		int dato=0;
		switch(opcion){
		case 0://hasta que de dato correcto
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = Integer.parseInt(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Un fallo y fuera
			boolean er = true;
			while (er) {
				try {
					System.out.println(texto);
					dato = Integer.parseInt(dataIn.readLine());
					er=false;
				} catch (IOException e) {
					System.out.println("Dato no correcto");
					er = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					er=false;
				}
			}
			break;
		default :
			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while (err) {
					try {
						System.out.println(texto);
						dato = Integer.parseInt(dataIn.readLine());
						err=false;
						k=opcion-1;
					} catch (IOException e) {
						System.out.println("El dato introducido no es entero");
						err = false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					} catch(NumberFormatException e){
						System.out.println("El dato introducido no es entero");
						err=false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					}
				}
			}
		}
		return dato;

	}
	
/*LONG*/
	static public Long pedirLongValidar(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		Long dato=0l;
		switch(opcion){
		case 0://hasta que de dato correcto
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = Long.parseLong(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Un fallo y fuera
			boolean er = true;
			while (er) {
				try {
					System.out.println(texto);
					dato = Long.parseLong(dataIn.readLine());
					er=false;
				} catch (IOException e) {
					System.out.println("Dato no correcto");
					er = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					er=false;
				}
			}
			break;
		default :
			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while (err) {
					try {
						System.out.println(texto);
						dato = Long.parseLong(dataIn.readLine());
						err=false;
						k=opcion-1;
					} catch (IOException e) {
						System.out.println("El dato introducido no es entero");
						err = false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					} catch(NumberFormatException e){
						System.out.println("El dato introducido no es entero");
						err=false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					}
				}
			}
		}
		return dato;

	}

	static public double decimal(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		double dato=0;

		switch(opcion){
		case 0://Repetir hasta que nos den un dato correcto
			boolean error = true;
			while (error) {			
				try {
					System.out.println(texto);
					dato = Double.parseDouble(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Solo permite introducir un dato y si no lo meten correctamente se cierra el programa
			boolean er = true;
			while(er){
				try {
					System.out.println(texto);
					dato = Double.parseDouble(dataIn.readLine());
					er=false;
				} catch (IOException e) {
					System.out.println("El dato introducido no es decimal ");
					er = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");				
					er=false;
				}
			}
			break;
		default:

			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while(err){
					try {
						System.out.println(texto);
						dato = Double.parseDouble(dataIn.readLine());
						err=false;
						k=opcion-1;
					} catch (IOException e) {
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						err = false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					} catch(NumberFormatException e){
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						err=false;
						if(k==(opcion-2)){System.out.println("El dato introducido no es decimal. \nUltimo intento");}
					}
				}
			}
			break;
		}
		return dato;

	}
	static public float pedirFloat(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		float dato=0;
		switch(opcion){
		case 0://Sigue hasta que nos den un dato correcto
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = Float.parseFloat(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Un fallo y fuera
			boolean erro = true;
			while (erro) {
				try {
					System.out.println(texto);
					dato = Float.parseFloat(dataIn.readLine());
					erro=false;
				} catch (IOException e) {
					System.out.println("El dato introducido no es decimal");
					//System.out.println("Vuelve a inroducir el dato, por favor: ");
					erro = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");
					//System.out.println("Vuelve a inroducir el dato, por favor: ");
					erro=false;
				}
			}
			break;
		default:
			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while (err) {
					try {
						System.out.println(texto);
						dato = Float.parseFloat(dataIn.readLine());
						err=false;
					} catch (IOException e) {
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
						err = false;
					} catch(NumberFormatException e){
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						if(k==(opcion-2)){System.out.println("Ultimo intento");}

						err=false;
					}
				}
			}
			break;
		}
		return dato;

	}
	

	static public String iban(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[a-zA-Z]{2}[0-9]{22}$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("IBAN Válido");

				}else{
					System.out.println("IBAN No Válido");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			Pattern patr = Pattern.compile("^[a-zA-Z]{2}[0-9]{22}$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("IBAN Válido");

			}else{
				System.out.println("IBAN No Válido");
				dato=null;
			}
			break;

		}
		return dato;
	}

	static public String identificacion(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[klmxyzKLMXYZ\\d]{1}[0-9]{7}[a-zA-Z&&[^iouIOU]]{1}$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("Documento identificación Válido");

				}else{
					System.out.println("Documento identificación No Válido");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			Pattern patr = Pattern.compile("^[klmxyzKLMXYZ\\d]?[0-9]{7}[a-zA-Z&&[^iouIOU]]{1}$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("Documento identificación Válido");

			}else{
				System.out.println("Documento identificación No Válido");
				dato=null;
			}
			break;

		}
		return dato;
	}

	static public String fecha(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[-](0?[1-9]|1[012])[-][\\d]{4}$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("Fecha Válida");

				}else{
					System.out.println("Fecha No Válida");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			// 
			Pattern patr = Pattern.compile("^ (0?[1-9]|[12][0-9]|3[01])[-](0?[1-9]|1[012])[-][\\d]{4}$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("Fecha Válida");

			}else{
				System.out.println("Fecha No Válida");
				dato=null;
			}
			break;

		}
		return dato;
	}
	
	static public String email(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("Correo Válido");

				}else{
					System.out.println("Correo No Válido");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			Pattern patr = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("Correo Válido");

			}else{
				System.out.println("Correo No Válido");
				dato=null;
			}
			break;

		}
		return dato;
	}
	
	static public String alfanumerico(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[A-Za-z0-9]*$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					//System.out.println("Contraseña Válida");

				}else{
					System.out.println("Contraseña no Válida");
					dato=null;
				}
			}while(dato==null);
			break;
		}
		return dato;
	}
}
