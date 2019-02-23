
public class Coche  extends Vehiculo{
	
	private Integer numAsientos;
	
	
	
	public Coche(String matricula, Integer numRuedas, Integer numAsientos) {
		super(matricula, numRuedas);
		this.numAsientos = numAsientos;
	}



	public String PonerMarcha(){
		return "se ha puesto en marcha el coche";
	}//mostrar



	public Integer getNumAsientos() {
		return numAsientos;
	}



	public void setNumAsientos(Integer numAsientos) {
		this.numAsientos = numAsientos;
	}
	
	public void hacerTrompo(){
		System.out.println("voy quemando ruenda y te hago un derrape");
	}



	@Override
	public String toString() {
		return super.toString()+"Coche [numAsientos=" + numAsientos + "]";
	}
	
	
	
}
