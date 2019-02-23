import java.util.Arrays;

public class Lujo extends Coche {
	private String parking;
	private  Integer codigoCoche=1001;
	private Integer siguiente=1;
	Lujo cocheLujo[];

	public Lujo(String matricula, String marca, String modelo, Fecha fechaFabricacion, Boolean disponible,
			Integer precioDiario, String parking) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		this.parking = parking;
		siguiente++;
		codigoCoche++;
	}//constructor con parametros
	
	//metodo para visualizar los datos de los coches
	public void visualizaTodo(){
		super.visualizaTodo();
		Leer.mostrarEnPantalla("Coche de Lujo con su parking"+parking + "con el codigo de coche" +codigoCoche+siguiente);
	}
	
	
	
	@Override
	public String toString() {
		return "Lujo [parking=" + parking + ", codigoCoche=" + codigoCoche + ", siguiente=" + siguiente + ", cocheLujo="
				+ Arrays.toString(cocheLujo) + "]";
	}

	public Lujo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Lujo(String matricula, String marca, String modelo, Fecha fechaFabricacion, Boolean disponible,
			Integer precioDiario) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		// TODO Auto-generated constructor stub
	}



	public Boolean cocheDisponible(Fecha hoy){
		Boolean disponible=false;
		if(siguiente>cocheLujo.length){
			disponible=false;
		}else{
			disponible=true;
		}
		
		return disponible;
		
	}//cocheDisponible
	
	

	public Integer getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Integer siguiente) {
		this.siguiente = siguiente;
	}

	//getters and setters
	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}
	
	
	
	
	
	
		
}//clase lujo
