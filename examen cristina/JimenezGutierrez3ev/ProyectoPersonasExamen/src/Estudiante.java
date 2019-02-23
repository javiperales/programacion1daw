
public class Estudiante extends Persona {
private Integer curso;
private String estudios;


public Estudiante(String nombre, String apellido,  String estudios,Integer curso) {
	super(nombre, apellido);
	this.curso = curso;
	this.estudios = estudios;
}


public Integer getCurso() {
	return curso;
}


public void setCurso(Integer curso) {
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



}
