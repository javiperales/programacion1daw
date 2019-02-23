
public class Administrativo extends Empleado{
	private String estudios;
	private Integer numOrdenador;

	

	public Administrativo(String nombre, Integer edad, String estudios, Integer numOrdenador) {
		super(nombre, edad);
		this.estudios = estudios; 
		this.numOrdenador = numOrdenador;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public Integer getNumOrdenador() {
		return numOrdenador;
	}

	public void setNumOrdenador(Integer numOrdenador) {
		this.numOrdenador = numOrdenador;
	}

	public void visualizarTodosDatos(){
		super.visualizarTodosDatos();
		//Leer.mostrarEnPantalla("" + getClass());
		Leer.mostrarEnPantalla("Estudios: " + estudios + "\tOrdenador num: " + numOrdenador);
	}

}
