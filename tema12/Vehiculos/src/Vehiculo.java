import java.util.*;
public abstract class Vehiculo implements Comparable <Vehiculo> {

	private String matricula;
	private Integer numRuedas;
	public Vehiculo(String matricula, Integer numRuedas) {
		super();
		this.matricula = matricula;
		this.numRuedas = numRuedas;
	}

	public  abstract String  PonerMarcha();


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(Integer numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", numRuedas=" + numRuedas + "]";
	}

	public int compareTo(Vehiculo v2){

		return this.matricula.compareTo(v2.matricula);
	}//compareto , esto me lo tengo que mirar bien


}//class
