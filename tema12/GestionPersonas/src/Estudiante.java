
public class Estudiante extends Persona {
	
	private int curso;
	private String estudios;
	public Estudiante(String nombre, String apellido, String estudios, int curso) {
		super(nombre, apellido);
		this.curso = curso;
		this.estudios = estudios;
	}//constructor
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Estudiante [curso=" + curso + ", estudios=" + estudios + "]";
	}
	
	//setters and getters
	
	//metodo toString
	
	
	
	

}
