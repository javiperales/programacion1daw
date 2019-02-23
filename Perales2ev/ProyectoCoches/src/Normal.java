import java.util.Arrays;

public class Normal extends Coche{
	private Integer codigo;
	private static Integer siguiente=1;
	private String aparcamiento;
	Normal cocheNormal[]=new Normal[15];
	
	
	public Normal(String matricula, String marca, String modelo, Fecha fechaFabricacion, Boolean disponible,
			Integer precioDiario,String aparcamiento) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		this.codigo = codigo;
		this.aparcamiento=aparcamiento;
		siguiente++;
	}//constructor con parametros
	
	//metodo para visualizar los datos de los coches
	public void visualizaTodo(){
		super.visualizaTodo();
		Leer.mostrarEnPantalla("Coche Normal con codigo " +codigo +"aparcamiento " +aparcamiento);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Normal [codigo=" + codigo + ", aparcamiento=" + aparcamiento + ", cocheNormal="
				+ Arrays.toString(cocheNormal) + "]";
	}

	public Boolean cocheDisponible(Fecha hoy){
		Boolean disponible=false;
		if(siguiente>cocheNormal.length){
			disponible=false;
		}else{
			disponible=true;
		}
		
		return disponible;
		
	}
	
	
	//getters and setters

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}

	public static void setSiguiente(Integer siguiente) {
		Normal.siguiente = siguiente;
	}
	
	
	
	
	
		
}//clase normal
