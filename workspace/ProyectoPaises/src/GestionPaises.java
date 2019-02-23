
public class GestionPaises {

	public static void main(String[] args) {
		ListaDePaises lista = null;
		Integer op;
		String nombre;
		menu();
		op=Leer.pedirEntero("elija opcion");
		while(op !=0){
			switch(op){
			case 1:
				lista=crearLista();
				break;
			case 2:
				if(lista.anyadir(Leer.pedirCadena("pais para añadir"))){
					Leer.mostrarEnPantalla("se ha añadido");
				}else{
					Leer.mostrarEnPantalla("lista completa");
				}
				break;
			case 3:
				nombre=Leer.pedirCadena("nombre para borrar");
				lista.borrar(nombre);
				break;
			case 4:
				for(int i =0;i<lista.numElementos();i++){
					Leer.mostrarEnPantalla(lista.mostrar(i));
				}
				break;
			case 5 :
				lista.vaciarLista();
				break;
			}
			menu();
			op=Leer.pedirEntero("elija opcion");
		}
		
	}//main
	
	public static void menu(){
		Leer.mostrarEnPantalla("1- Crear lista");
		Leer.mostrarEnPantalla("2- Añadir un nombre");
		Leer.mostrarEnPantalla("3- Borrar un nombre");
		Leer.mostrarEnPantalla("4- Listar todos los nombres");
		Leer.mostrarEnPantalla("5- Borrar todos los nombres");
		Leer.mostrarEnPantalla("0 Finalizar el programa");
	}
	
	public static ListaDePaises crearLista(){
		ListaDePaises miLista;
		Integer cuantos;
		cuantos =Leer.pedirEntero("¿cuantos paises tendra la lista?");
		miLista= new ListaDePaises(cuantos);
		return miLista;
	}
	
}// class






