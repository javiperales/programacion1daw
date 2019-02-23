import java.util.Arrays;

public class Coche {
	 private String matricula;
	 private String marca;
	 private String modelo;
	 private Fecha fechaFabricacion;
	 private Boolean disponible;
	 private Integer precioDiario;
	 
	 Coche cocheLujo[] = new Lujo[5];
	 Coche cocheNormal[] = new Normal[15];
	 
	public Coche(String matricula, String marca, String modelo, Fecha fechaFabricacion, Boolean disponible,
			Integer precioDiario) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.disponible = disponible;
		this.precioDiario = precioDiario;
	}//constructor con parametros
	
	public Coche(){
		
	}//constructor sin parametros
	
	//metodo para visualizar los coches
	public void visualizaTodo(){
		Leer.mostrarEnPantalla("Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", fechaFabricacion="
				+ fechaFabricacion + ", disponible=" + disponible + ", precioDiario=" + precioDiario);
		
	}	
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", fechaFabricacion="
				+ fechaFabricacion + ", disponible=" + disponible + ", precioDiario=" + precioDiario + ", cocheLujo="
				+ Arrays.toString(cocheLujo) + ", cocheNormal=" + Arrays.toString(cocheNormal) + "]";
	}

	//getters and setters
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

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public Integer getPrecioDiario() {
		return precioDiario;
	}

	public void setPrecioDiario(Integer precioDiario) {
		this.precioDiario = precioDiario;
	}
	
	
	
	 
	
}//class
