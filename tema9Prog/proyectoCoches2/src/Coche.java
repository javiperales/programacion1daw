
public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private Fecha fechaFabricacion;
	private boolean disponible;
	private Integer precioDiario;
	
	public Coche(String matricula, String marca, String modelo, Fecha fechaFabricacion, boolean disponible,
			Integer precioDiario) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.disponible = disponible;
		this.precioDiario = precioDiario;
	}//constructor

	
	public String alquiar() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", fechaFabricacion="
				+ fechaFabricacion + ", disponible=" + disponible + ", precioDiario=" + precioDiario + "]";
	}//alquilar


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Fecha getFechaFabricacion() {
		return fechaFabricacion;
	}


	public void setFechaFabricacion(Fecha fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}


	public boolean getDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public Integer getPrecioDiario() {
		return precioDiario;
	}


	public void setPrecioDiario(Integer precioDiario) {
		this.precioDiario = precioDiario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
		

}//class
