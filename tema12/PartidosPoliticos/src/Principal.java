import java.util.*;
public class Principal {

	public static void main(String[] args) {
		String nombrePartido="";
		Integer numVotos=0,numEscaños=0,numPartidos=0;

		Random alea= new Random();
		///////////////principal///////////////////////////////////////////////////
		TreeMap<String,Partido> Partidos= new TreeMap<String,Partido>();
		TreeMap<Integer, TreeSet<String>> MapaReparto = new TreeMap<Integer, TreeSet<String>>();
		numPartidos=Leer.pedirEntero("cuantos partidos politicos participan en las elecciones");
		numEscaños=Leer.pedirEntero("cuantos escaños hay");
		Integer array[] = new Integer[numPartidos];
		int cociente, mayor=0;
		rellena(Partidos,numPartidos,MapaReparto);


	}//main


	public static void rellena(TreeMap<String, Partido>Partidos,int numPartidos,TreeMap<Integer, TreeSet<String>> MapaReparto){
		String nombrePartido="";
		Integer numVotos=0,numEscaños=0, totalVotos = 0, cociente = 0;;
		Random alea = new Random();
		TreeSet<String> listaPartidos = null;

		for(int i=0;i<numPartidos;i++){

			nombrePartido=Leer.pedirCadena("nombre del partido politico");
			numVotos=alea.nextInt(10000)+8000;
			Leer.mostrarEnPantalla("el partido "+nombrePartido+" a obtenido "+numVotos+ " votos");
			Partido part = new Partido();

			Partidos.put(nombrePartido, part);

			//foreach
			for(Map.Entry<String, Partido>nodoDeMapaPartido:Partidos.entrySet()){

				nombrePartido=nodoDeMapaPartido.getKey();
				part=nodoDeMapaPartido.getValue();
				part.setNum_votos(numVotos);
				Partidos.put(nombrePartido, part);
				totalVotos=totalVotos+numVotos;

			}//foreach

			eliminaPartidos(Partidos,numVotos);
			//calculamos los cocientes de los votos
			for(Map.Entry<String, Partido>nodoDeMapaPartido: Partidos.entrySet()){
				part=nodoDeMapaPartido.getValue();
				numVotos=part.getNum_votos();
				for(int k=0; k<numVotos; k++){
					cociente=numVotos/k;
					if(MapaReparto.containsKey(cociente)){
						MapaReparto.get(cociente).add(part.getNombre());
					}else{//ese cociente no esta en el mapa de reparto
						listaPartidos=new TreeSet<String>();
						listaPartidos.add(part.getNombre());
						MapaReparto.put(cociente, listaPartidos);
					}
				}//for
			}//foreach




		}//for
	}//rellena

	public static void eliminaPartidos(TreeMap<String, Partido>Partidos,Integer numVotos ){

		Iterator<Map.Entry<String, Partido>> it=Partidos.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Partido> nodoDeMapaPartido=it.next();
			Leer.mostrarEnPantalla(nodoDeMapaPartido.getKey()+" : "+nodoDeMapaPartido.getValue());
			if(nodoDeMapaPartido.getValue().getNum_votos()<numVotos*0.05){
				it.remove();
			}//if
		}//while
		Leer.mostrarEnPantalla("se han eliminado los partidos con pocos votos");

	}//eliminaPartidos



	public static void calcula(TreeMap<String, Partido>Partidos,Integer numEscaños,TreeMap<Integer, TreeSet<String>> MapaReparto){
		Partido part;
		TreeSet<String>ListaPartidos;
		Integer cociente, contEscanos=0;
		for(Map.Entry<Integer, TreeSet<String>>nodoDeMapaReparto :MapaReparto.entrySet()){
			cociente=nodoDeMapaReparto.getKey();
			Leer.mostrarEnPantalla("-->"+cociente);
			ListaPartidos=nodoDeMapaReparto.getValue();
			Leer.mostrarEnPantalla(ListaPartidos.toString());
			
			for(String nombrePartido:ListaPartidos){
				part=Partidos.get(nombrePartido);
				part.setNum_escaños(part.getNum_escaños()+1);
				Partidos.put(nombrePartido, part);
				contEscanos++;
				if(contEscanos==numEscaños){
					break;
				}//if
				if(contEscanos==numEscaños){
					break;
				}//if
				
			}//foreach
			
			
			
			
			
		}//foreach
		
		
			
	}//calcula




}//class
