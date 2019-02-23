
public class Moto extends Vehiculo{
	private Integer cilindrada;

	public Moto(String matricula, Integer numRuedas, Integer cilindrada) {
		super(matricula, numRuedas);
		this.cilindrada = cilindrada;
	}//constructor
	

	public String PonerMarcha(){
		return "se ha puesto en marcha la moto";
		
	}//mostrar


	public Integer getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public void hacerCaballito(){
		System.out.println("hago un caballito que me caigo pa´tras");
	}


	@Override
	public String toString() {
		return super.toString()+"Moto [cilindrada=" + cilindrada + "]";
	}

		
}
