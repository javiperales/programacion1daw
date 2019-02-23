package ejemplo1Modificado;

import java.util.*;

public class Trabajadores {

	public static void main(String[] args) {
		empleado emple[];
		jefe jefe[];
		String titulo, nombre, departamento;
		float sueldo;
		int maxEmpleados, maxJefes;
		
		do{
			System.out.println("numero maximo de empleados");
			maxEmpleados=Leer.pedirEnteroValidar();
			emple= new empleado[maxEmpleados];
		}while(maxEmpleados<=0);
		do{
			System.out.println("numero maximo de jefes");
			maxJefes=Leer.pedirEnteroValidar();
			jefe= new jefe[maxJefes];
		}while(maxJefes<=0);
		
		for(int i=0; i<emple.length;i++){
			System.out.println("\n\tVamos a insertar los datos del empleado: ");		
			System.out.print("\n\t\tNOMBRE ");
			nombre=Leer.pedirCadena();		
			System.out.print("\n\t\tSUELDO ");
			sueldo=Leer.pedirFloat();		
			emple[i]=new empleado(nombre, sueldo);
		}//for
		
		for(int i=0; i<jefe.length;i++){
			System.out.println("\n\tVamos a insertar los datos del jefe: ");
			System.out.print("\n\t\tNOMBRE ");
			nombre=Leer.pedirCadena();		
			System.out.print("\n\t\tSUELDO ");
			sueldo=Leer.pedirFloat();				
			System.out.print("\n\t\tDEPARTAMENTO DEL QUE ES JEFE? ");
			departamento=Leer.pedirCadena();
			System.out.print("\n\t\tTITULO UNIVERSITARIO? ");
			titulo=Leer.pedirCadena();
			jefe[i]= new jefe(nombre, sueldo, departamento, titulo);
		}//for
		for(int i=0; i<emple.length;i++){
		System.out.println("\n\tVamos a mostrar los datos del empleado: ");
		emple[i].imprimeTodo();
		}
		for(int i=0; i<jefe.length;i++){
		System.out.println("\n\tVamos a mostrar los datos del jefe: ");
		jefe[i].imprimeTodo();
		}//for	
	}//main

}//class
