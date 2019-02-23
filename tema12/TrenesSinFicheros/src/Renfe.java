import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Renfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tren[] trenes = new Tren[3];//Los tres trenes del enunciado
		trenes[0] = new Tren("0621", "Zaragoza", "Calatayud", "15:00");
		trenes[1] = new Tren("0622", "Zaragoza", "Barcelona", "18:00");
		trenes[2] = new Tren("0623", "Zaragoza", "Madrid", "19:00");
		Map<Fecha, List<Tren>> viajes= new TreeMap<>();//Mapa con los trenes organizados por fechas
		List<Billete> billetes = new ArrayList<>();//lista de billetes
		List<Tren> trenesFecha =new ArrayList<>();//Lista de trenes para el mapa
		Billete billete;
		int opcion=-1;//opci�n del men�
		Fecha fecha;//fecha
		Tren tren;//tren
		int ntren;//posici�n de tren escogido
		String bill;//cadena con el vag�n y el asiento
		int numBillete;//billete a seleccionar
		
		
		while (opcion!=0){//Bucle de manejo de opciones
			opcion=menu();
			switch (opcion){
			case 1: //Vender billete
				ntren = seleccionaTren(trenes);//Selecciona el tren de la lista de trenes
				tren= new Tren(trenes[ntren-1]);//crea un tren para esa fecha basado en el que se ha escogido.
				fecha = pideFecha();//pide la fecha
				if (!viajes.containsKey(fecha)){//si la fecha no est� en el mapa...
					trenesFecha=new ArrayList<>();//Crea una Lista nueva para el nodo del mapa
					trenesFecha.add(tren);//a�ade el tren a la Lista
				} else {// si la fecha ya est� en el mapa...
					trenesFecha=viajes.get(fecha);//obtiene el List de trenes de esa fecha que est� en el mapa
					Tren trenAux=estaTren(trenesFecha, tren.getNumeroTren());// busca el tren (n�meroTren) en la Lista
					if (trenAux==null){//Si no est�...
						trenesFecha.add(tren);//a�ade el tren a la Lista				
					} else {//si est�...
						tren=trenAux;//recupera el tren (trenAux) a la variable de trabajo
					}
				}
				bill=tren.venta();//asigna asiento y vag�n para la compra en el tren de trabajo
				viajes.put(fecha, trenesFecha);//a�ade-sustituye el nodo al mapa
				billete= new Billete(tren.getNumeroTren(),fecha, bill);//crea el nuevo billete
				Leer.mostrarEnPantalla(billete.toString());//muestra el billete
				billetes.add(billete);// a�ade el billete en la lista
				break;
			case 2://Anular billete
				numBillete=Leer.pedirEntero("N�mero de billete a borrar ", "[0-9]+");//Toma el n�mero del billete
				billete=null;
				for(Billete e: billetes){//localiza el billete
					if (e.getNumeroBillete()==numBillete){
						billete=e;
						break;
					}
				}
				if (billete==null){//si no est� en la lista
					Leer.mostrarEnPantalla("El billete "+numBillete+" no existe ");
				} else{//borra el billete
					trenesFecha=viajes.get(billete.getFecha());//obtiene del mapa la lista de trenes para la fecha del billete
					tren=estaTren(trenesFecha, billete.getNumeroTren());//obtiene el tren de la lista a partir del dato del billete
					Leer.mostrarEnPantalla(tren.borra(billete.getVagon(), billete.getAsiento())+billete.toString());//borrar el asiento del vag�n del tren obtenido
					billetes.remove(billete);//borra de la lista de billetes el billete
				}
				break;
			case 3:// Ver billetes
				Leer.mostrarEnPantalla(billetes.toString());//imprime los billetes
				break;
			case 4:// Ver trenes
				Leer.mostrarEnPantalla(viajes.toString());//imprime el mapa de trenes
				break;			
			}
		}
	}

	private static Fecha pideFecha() {
		Fecha fecha;
		int dia;
		int mes;
		int anio;
		dia=Leer.pedirEntero("d�a ","[1-9]|[1-2][1-9]|30|31");//lee el d�a
		mes=Leer.pedirEntero("mes ","[1-9]|10|11|12");//lee el mes
		anio=Leer.pedirEntero("a�o ","[1-2][0-9]{3}");//lee el a�o
		fecha= new Fecha(dia,mes,anio);//crea la fecha
		return fecha;
	}

	private static int seleccionaTren(Tren[] trenes) {
		int ntren;
		for (int i=0; i<trenes.length;i++){
			Leer.mostrarEnPantalla((i+1)+" - "+trenes[i].toCadena());				
		}
		ntren=Leer.pedirEntero("escoge el tren","[1-3]");//escoge el tren de base
		return ntren;
	}

	public static int menu(){//men� de la aplicaci�n
		int opcion;
		Leer.mostrarEnPantalla("1.- Vender billete");
		Leer.mostrarEnPantalla("2.- Anular billete");
		Leer.mostrarEnPantalla("3.- Ver billetes");
		Leer.mostrarEnPantalla("4.- Ver trenes");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion=Leer.pedirEntero("opci�n seleccionada", "[0-4]");
		return opcion;
	}
	
	public static Tren estaTren(List<Tren> trenesFecha, String numTren){//devuelve nulo si el tren no est� en la Lista. Si est� lo devuelve
		Tren train=null;
		for (Tren t: trenesFecha){
			if (t.getNumeroTren().equals(numTren)){
				train=t;
			}
		}
		return train;
	}
}
