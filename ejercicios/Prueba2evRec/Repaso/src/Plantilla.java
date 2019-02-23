import utilidades.Leer;

public class Plantilla extends Empleado {
	private int hijos;
	private double salarioBase=700;


	public Plantilla(String DNI, String nombre, String apellidos){
		super(DNI,nombre,apellidos);


	}

	public void datosTrabajador(){
		hijos=Leer.pedirEnteroValidar("Introduce el numero de hijos que tiene a su cargo el trabajador");

	}

	public void imprimir(){
		super.imprimir();
		System.out.println("Nº hijos            "+hijos);
	}

	public void salario(){
		double total;
		total=salarioBase+(hijos*20);
		System.out.println("El sueldo total es " +total);

	}

}
