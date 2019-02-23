
public class Maquinista extends Empleado{
	private Integer numMaquina;
	private Integer anios;



	public Maquinista(String nombre, Integer edad, Integer numMaquina, Integer anios) {
		super(nombre, edad);
		this.numMaquina = numMaquina;
		this.anios = anios;
	}

	public Integer getNumMaquina() {
		return numMaquina;
	}

	public void setNumMaquina(Integer numMaquina) {
		this.numMaquina = numMaquina;
	}

	public Integer getAnios() {
		return anios;
	}

	public void setAnios(Integer anios) {
		this.anios = anios;
	}

	public void visualizarTodosDatos(){
		super.visualizarTodosDatos();
		Leer.mostrarEnPantalla("Maquina numero: " + numMaquina + "\tAntigüedad: " + anios);
	}
}
