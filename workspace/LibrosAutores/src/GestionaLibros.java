import java.util.*;
public class GestionaLibros {

	public static void main(String[] args) {
		///////////////////////////////////////////principal////////////////////////////////////////////////////
		int op;
		libro libros[]=null;
		Autor autores[]=null;
		int numLibros;
		Scanner teclado = new Scanner(System.in);
		do{
			menu();
			op=Leer.pedirEntero("elija una opcion");

			switch(op){
			case 1:
				String titulo;
				double precio;
				int cantidad, numAutor;
				String nombre , correo, genero;

				numLibros=Leer.pedirEntero("cuantos libros quieres crear");
				libros= new libro[numLibros];
				numAutor=Leer.pedirEntero("cuantos autores tendra el libro");
				autores= new Autor[numAutor];
				for(int i=0; i<numLibros; i++){
					titulo=Leer.pedirCadena("titulo del libro");
					for(int k=0; k<numAutor;k++){
						nombre=Leer.pedirCadena("nombre del autor");
						correo=Leer.pedirCadena("correo del autor");
						do{
							genero=Leer.pedirCadena("genero del autor (m)asculino o (f)emenino");
						}while(validarGenero(genero)==false);
						autores[k] = new Autor(nombre, correo, genero);

						precio=Leer.pedirDouble("precio del libro");
						cantidad=Leer.pedirEntero("cantidad de libros");
						libros[i] = new libro(titulo, autores, precio, cantidad);

					}//for
				}//for
				break;
			case 2:
				String nombreAutor;
				nombreAutor=Leer.pedirCadena("Introduce el nombre del autor que quiere modificar");
				String nuevoNombre = null,nuevoCorreo;
				char nuevoGenero;

				String nuevoGeneroString = null;
				for(int indice=0;indice<autores.length;indice++){
					if(autores[indice].getNombre().equals(nombreAutor)){

						modificarAutor();
						op=Leer.pedirEntero("");
						if(op==1){//cambiar nombre

							nuevoNombre=Leer.pedirCadena("Introduzca el nuevo nombre");
							autores[indice].setNombre(nuevoNombre);
						}
						if(op==2){//cambiar correo
							nuevoCorreo=Leer.pedirCadena("Introduzca el nuevo correo");
							autores[indice].setCorreo(nuevoCorreo);
						}
						if(op==3){//cambiar genero
							do{
								nuevoGeneroString=Leer.pedirCadena("Introduce el nuevo genero");
								nuevoGenero=nuevoGeneroString.charAt(0);
							}while(validarGenero(nuevoGeneroString)==false);
							autores[indice].setGenero(nuevoGenero);
						}
					}else{
						Leer.mostrarEnPantalla("El "+nuevoNombre+" no existe");
					}
				}//for para recorrer 

				break;
			case 3:
				String nombreLibro;
				double precioLibro;
				int cantidadLibros;
				nombreLibro=Leer.pedirCadena("nombre del libro a buscar");

				for(int i=0; i<libros.length;i++){
					if(libros[i].getTitulo().equalsIgnoreCase(nombreLibro)){
						modificarLibro();
						op=Leer.pedirEntero("");

						if(op==1){
							nombreLibro=Leer.pedirCadena("nuevo titulo del libro");
							libros[i].setTitulo(nombreLibro);
						}//ifop1
						if(op==2){
							precioLibro=Leer.pedirDouble("cual es el precio actualizado del libro");
							libros[i].setPrecio(precioLibro);
						}//ifop2

						if(op==3){
							cantidadLibros=Leer.pedirEntero("nueva cantidad de libros?");
							libros[i].setCantidad(cantidadLibros);

						}

					}else{
						Leer.mostrarEnPantalla("El "+nombreLibro+" no existe");
					}//else
				}//for

				break;
			case 4:
				for(int i=0; i<libros.length; i++){
					System.out.println(libros[i].cadenaLibro());
				}
				break;
			case 5:
				for(int i=0;i<autores.length;i++){
					System.out.println(autores[i].cadenaAutor());
				}
				break;
			}}while(op!=0);








	}//main
	public  static void menu(){

		System.out.println("1-crear libros");
		System.out.println("2-modificar autor");
		System.out.println("3-modificar libro");
		System.out.println("4-listado de libros");
		System.out.println("5-listado de autores");
		System.out.println("0-salir");



	}//menu
	public static void  modificarAutor(){
		System.out.println("1-modificar nombre");
		System.out.println("2-modificar el correo");
		System.out.println("3-modificar genero");
		//System.out.println("0-salir"); 
	}

	public static void modificarLibro(){
		System.out.println("1-modificar el titulo");
		System.out.println("2-modificar el precio");
		System.out.println("3-modificar cantidad");
		//System.out.println("0-salir"); 

	}

	public static boolean validarGenero(String caracter){
		boolean correcto = false;
		int contador=0;
		if(caracter.equalsIgnoreCase("M") || caracter.equalsIgnoreCase("F")){

		}else{
			contador++;
			Leer.mostrarEnPantalla("elije (m)asculino o (f)emenino");
		}
		if(contador==0){
			correcto=true;
		}else{
			correcto=false;
		}
		return correcto;
	}//validarGenero


}//class
