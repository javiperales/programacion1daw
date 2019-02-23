package visibilidad1;
import visibilidad2.empleadoespecial; // importar el package para tener visibilidad en otros package
public class jefe extends empleado{
	
	empleadoespecial  emple;
	
	public jefe(){
		super.direccion="c/limite";
		super.edad=20;
		super.nombre="oscarito";
		emple = new empleadoespecial();
		emple.nombreEs="paco";
		
		
		}///jefe

}//class

