public class Coche {

	/***
	 * @author Diogo Pinto
	 ***/

	private String matricula;
	private String marca;
	private String modelo;
	private Fecha fechaFabricacion;
	private Boolean disponible;
	private Integer precioDiario;

	public Coche(String matricula, String marca, String modelo, Fecha fechaFabricacion, Integer precioDiario) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.disponible = true;
		this.precioDiario = precioDiario;
	}

	public String visualizar() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", fechaFabricacion="
				+ fechaFabricacion + ", disponible=" + disponible + ", precioDiario=" + precioDiario + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Fecha getFechaFabricacion() {
		return fechaFabricacion;
	}

	public Integer getPrecioDiario() {
		return precioDiario;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void alquilar() {
		this.disponible = false;
	}

	public Integer devolver(Integer dias) {
		this.disponible = true;
		return dias*precioDiario;
	}

}