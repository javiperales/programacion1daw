package ejemplo1Modificado;

public class jefe extends empleado {
	private String departamento;
	private String titulo;
	
	
	public jefe(String nombre, float sueldo, String departamento, String titulo) {
		super(nombre, sueldo);
		this.departamento = departamento;
		this.titulo = titulo;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setTodo(String nombre, float sueldo, String departamento, String titulo){
		super.setTodo(nombre, sueldo);
		setDepartamento(departamento);
		setTitulo(titulo);
	}//setTodo
	
	public void imprimeDepart(){
		System.out.println("su departamento es " + departamento);
		
	}
	public void imprimeTitulo(){
		System.out.println("su titulo es " + titulo);
	}
	
	public void imprimeTodo(){
		super.imprimeTodo();
		imprimeDepart();
		imprimeTitulo();
	}

}
