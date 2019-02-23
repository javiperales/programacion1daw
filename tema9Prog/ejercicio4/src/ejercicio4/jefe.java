package ejercicio4;

public class jefe extends Empleado {
	private String departamento;
	private   double plusSueldo=250;
	public jefe( String nombre, Integer edad, Double porcentaje,String departamento) {
		super( nombre, edad, porcentaje);
		this.plusSueldo=plusSueldo;
		this.departamento=departamento;
		
	}//constructor
	
	public void DatosJefe(){
		super.imprimeTodo();
		System.out.println("departamento "+departamento);
		System.out.println("plus de jefe" +plusSueldo);
		System.out.println("sueldo final del jefe "+SueldoJefe());
	}//datosJefe
	
	public Double SueldoJefe(){
		Double sueldoTotalJefe;
		sueldoTotalJefe=(super.getSueldoBase()+plusSueldo)*super.getPorcentaje();
		 return sueldoTotalJefe;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getPlusSueldo() {
		return plusSueldo;
	}
	public void setPlusSueldo(double plusSueldo) {
		this.plusSueldo = plusSueldo;
	}
	
	


	
	
	

}//class
