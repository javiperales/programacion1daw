

public class Lujo extends Coche{
	private Integer codigo;
	private static Integer siguiente=0;
	public Lujo(String matricula, String marca, String modelo, Fecha fechaFabricacion, boolean disponible,
			Integer precioDiario, Integer codigo) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		this.codigo = codigo;
		siguiente++;
	}//constructor
	
	public String alquilar(){
		return super.alquiar()+" codigo = "+codigo;
		
	}//alquilar

	public Integer getCodigo() {
		return codigo;
	}
	
	
	
	
	

}//class