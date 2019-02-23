public class Jefes extends Empleados {

	private static double plusJefes;
	private static double sueldoTotalJefes;

	public Jefes() {
		super();
	}

	public Jefes(String nombre, int edad) {
		super(nombre, edad);
		plusJefes = 250;
		this.sueldoTotalJefes = Empleados.getSueldoBase() + plusJefes;
	}

	public double getSueldoTotalJefes() {
		return sueldoTotalJefes;
	}

	public void setSueldoTotalJefes(double sueldoTotalJefes) {
		this.sueldoTotalJefes = Empleados.getSueldoBase() + plusJefes;
	}

	public static double getPlusJefes() {
		return plusJefes;
	}

	public static void setPlusJefes(double plusJefes) {
		Jefes.plusJefes = plusJefes;
		System.out.println(plusJefes + " plus prueba");
		sueldoTotalJefes= Empleados.getSueldoBase()+plusJefes;
	}

	public void imprimeSueldo() {
		System.out.print("\n\t\tSUELDO " + sueldoTotalJefes);
		return;
	}

	public void imprimeTodo() {
		super.imprimeTodo();

	}

}// Jefes