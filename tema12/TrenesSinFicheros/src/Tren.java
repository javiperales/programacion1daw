import java.util.ArrayList;
import java.util.List;

public class Tren implements Comparable<Tren>{
	private String numeroTren;
	private String estacionOrigen;
	private String estacionDestino;
	private String horaSalida;
	private List<Vagon> composicion;
	
	
	public Tren(String numeroTren, String estacionOrigen, String estacionDestino, String horaSalida) {//Crea los vagones de referencia pero sin lista de vagones

		this.numeroTren = numeroTren;
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.horaSalida = horaSalida;
		composicion= new ArrayList<Vagon>();
	}
	
	public Tren(Tren tren){//Crea tren a partir del de referencia. En este se a�ade la lista de vagones
		Vagon vagon=new Vagon(1);
		this.numeroTren = tren.getNumeroTren();
		this.estacionOrigen = tren.getEstacionOrigen();
		this.estacionDestino = tren.getEstacionDestino();
		this.horaSalida = tren.getHoraSalida();
		composicion= new ArrayList<Vagon>();
		composicion.add(vagon);
	}
	
	public String venta(){// vende el billete del tren que est� en la lista de trenes de la fecha correspondiente en el mapa
		String vagonYasiento="";
		int asiento=-1;
		for (Vagon vagon: composicion){//recorre los vagones de la lista para buscar un asiento libre
			asiento=vagon.venta();//busca en el vag�n un asiento libre
			if(asiento!=-1){//si devuelve distinto de -1 es el asiento que se vende
				vagonYasiento=""+vagon.getVagon(0)+" "+asiento;//compone la cadena con el vag�n y el asiento separado por un blanco
				break;
			}
		}//for
		
		if (asiento==-1){// si est�n todos los vagones de la lista ocupados crea un vag�n nuevo
			Vagon vagon=new Vagon(composicion.size()+1);//Crea el siguiente vag�n
			composicion.add(vagon);//lo a�ade a la lista
			asiento=vagon.venta();//reserva un asiento
			vagonYasiento=""+vagon.getVagon(0)+" "+asiento;//compone la cadena con el vag�n y el asiento separado por un blanco
		}
		return vagonYasiento;
	}

	public String borra(Integer numVagon, Integer asiento){//de la lista de vagones localiza el vag�nn correspondiente y manda liberar el asiento
		Vagon vagon =this.composicion.get(numVagon-1);//localiza el vag�n
		vagon.borra(asiento);//libera el asiento del vag�n correspondiente
		
		return "El billete ha sido borrado ";
	}

	public String getEstacionOrigen() {
		return estacionOrigen;
	}

	public String getEstacionDestino() {
		return estacionDestino;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public String getNumeroTren() {
		return numeroTren;
	}

	@Override
	public String toString() {//Para imprimir los datos del tren y los de los vagones
		return "\n\tTren [numeroTren=" + numeroTren + ", estacionOrigen=" + estacionOrigen + ", estacionDestino="
				+ estacionDestino + ", horaSalida=" + horaSalida + "]\n\t composicion=" + composicion.toString();
	}

	public String toCadena() {//Para imprimir solo los datos del tren
		return "Tren [numeroTren=" + numeroTren + ", estacionOrigen=" + estacionOrigen + ", estacionDestino="
				+ estacionDestino + ", horaSalida=" + horaSalida + "]";
	}

	@Override
	public int compareTo(Tren o) {//para ordenar los trenes seg�n el n�mero del mismo (es de tipo String)
		// TODO Auto-generated method stub
		return this.numeroTren.compareTo(getNumeroTren());
	}
}
