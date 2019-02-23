
public abstract class Empleado {
	private static int contaEmpleado=0;
	private int numEmpleado;
	private String DNI;
	private String nombre;
	private String apellidos;
	public Empleado(String DNI, String nombre, String apellidos){
		contaEmpleado++;
		this.numEmpleado=contaEmpleado;
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	public void imprimir(){
		System.out.println("Nº Empleado         "+numEmpleado);
		System.out.println("DNI                 "+DNI);
		System.out.println("Nombre              "+nombre);
		System.out.println("Apellidos           "+apellidos);		
	};
	public abstract void salario();
	public abstract void datosTrabajador();




}
