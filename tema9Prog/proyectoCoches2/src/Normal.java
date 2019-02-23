

public class Normal extends Coche {
	private String aparcamiento;
	private Fecha fecha;
	public Normal(String matricula, String marca, String modelo, Fecha fechaFabricacion, boolean disponible,
			Integer precioDiario, String aparcamiento, Fecha fecha) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		this.aparcamiento = aparcamiento;
		this.fecha = fecha;
	}//constructor
	
	public String alquilar(){
		return super.alquiar()+" aparcamiento: "+aparcamiento+ " Fecha: "+fecha ;
		
	}//alquilar
	
	
	
	
	

}
