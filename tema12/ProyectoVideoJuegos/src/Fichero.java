import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero implements Separable{
	private BufferedReader entrada;
	private BufferedWriter salida;

	public Fichero(String nombre, String io){
		Videojuego juego;
		//fin=false;
		if (io.equals("I")){//abrir el fichero para leer
			try{
				entrada=new BufferedReader(new FileReader(nombre));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de entrada "+e.getMessage());
				System.exit(1);
			}
		}
		if (io.equals("O")){//abrir el fichero para escribir
			try{
				salida=new BufferedWriter(new FileWriter(nombre));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de salida "+e.getMessage());
				System.exit(1);
			}
		}
	}
	
	public ArrayList<Videojuego>leer(){
		ArrayList<Videojuego> listaJuegos = new ArrayList<Videojuego>();
		//Videojuego juego=null;
		String regTexto=null;
		String nombre= "", apellido="",formajuego="",plataforma="",fabricante="";
		float precio=0;
		int edad=0,UnidadesVendidas=0,edadMin=0;
		try {
			regTexto = entrada.readLine();//leemos un registro
			if(regTexto.length() != 0){// si tiene contenido procesamos sabiendo que separa cada campo y cuantos campos tiene
				// los valores de cada atributo estan separados por lo que devuelve getSeparador() En este caso ;
				if(regTexto.indexOf(getSeparador())!=-1){// recuperamos el valor del primer atributo		
					nombre= regTexto.substring(0, regTexto.indexOf(getSeparador()));
					regTexto = regTexto.substring(regTexto.indexOf(getSeparador()) + 1 );
				}
				if(regTexto.indexOf(getSeparador())!=-1){// recuperamos el valor del segundo atributo
					apellido= regTexto.substring(0, regTexto.indexOf(getSeparador()));
					regTexto = regTexto.substring(regTexto.indexOf(getSeparador()) + 1 );
				}
				// recuperamos el valor del tercer atributo
				try {
					edad = Integer.parseInt(regTexto);
				} catch(NumberFormatException e){
					Leer.mostrarEnPantalla("Datos err�neos se asigna 0.");
					edad=0;
				}
			}
			
		}catch(IOException e){
			Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {
			return null;
		}
		return listaJuegos;
	}

	public Boolean escribir(Videojuego[] juego ){
		
		try {
			if(juego!=null){//si el objeto existe lo escribimos
				salida.write(juego.toString());
			}
		}catch(IOException e){//controlar el error de escritura
			Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {//controlar el error de asignaci�n de fichero
	        return false;
	    }
		return true;
	}
	
	public void cerrar(String io){ 
		try{
			if(io.equals("I")){//cerrar el buffer de entrada
				entrada.close();
			}
			if(io.equals("O")){//cerrar el buffer de salida
				salida.close();
			}
		}catch(IOException e){//controlar la excepci�n
			Leer.mostrarEnPantalla("Error al cerrar el archivo "+e.getMessage());
			System.exit(1);
		}
	}
}
