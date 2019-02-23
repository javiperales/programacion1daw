package ejercicio4;

public class principal {

	public static void main(String[] args) {
		int op=0;
		Integer numaxjefes;
		Integer numaxempleados, edad;
		String nombreEmpleado, nombreJefe, nombreEmpresa, nombreDepart;
		Double nuevoSueldo, nuevoPlus, porcentaje;
		jefe jefe[];
		Empleado emple[];
	
		do{
			numaxempleados=Leer.pedirEntero("numero maximo de empleados");
			emple= new Empleado[numaxempleados];
			numaxjefes=Leer.pedirEntero("numero maximo de jefes");
			jefe = new jefe[numaxjefes];
		}while(numaxempleados<numaxjefes);
		
		 for (int i =0; i<emple.length;i++){
			 nombreEmpleado=Leer.pedirCadena("nombre del empleado");
			 edad=Leer.pedirEntero("edad del empleado");
			 porcentaje=Leer.pedirDouble("porcentaje de sueldo");
			 emple[i]=new Empleado(nombreEmpleado,edad,porcentaje);
			 emple[i].imprimeTodo();
			 System.out.println("");
		 }
		for (int i =0; i<jefe.length;i++){
			nombreJefe=Leer.pedirCadena("nombre del jefe");
			edad=Leer.pedirEntero("edad del jefe");
			nombreDepart=Leer.pedirCadena("nombre del departamento al que pertenece el jefe");
			porcentaje=Leer.pedirDouble("porcentaje de sueldo");
			jefe[i] = new jefe(nombreJefe,edad,porcentaje,nombreDepart);			
			jefe[i].DatosJefe();
			
		}
		
		do{
			
			menu();
			op=Leer.pedirEntero("elija una opcion");
			
			switch(op){
		
			case 1:
				nuevoSueldo=Leer.pedirDouble("nuevo sueldo base de todos los empleados");				
				for(int i =0; i<emple.length;i++){
					emple[i].setSueldoBase(nuevoSueldo);
				}
				
				break;
			
			case 2:
				nuevoPlus=Leer.pedirDouble("nuevo plus para los jefes");
				for(int i =0; i<jefe.length;i++){
					jefe[i].setPlusSueldo(nuevoPlus);
				}
				break;
				
			case 3:
				 for (int i =0; i<emple.length;i++){
					 emple[i].imprimeTodo();
					 System.out.println("");
				 }
				 
				 for (int i =0; i<jefe.length;i++){
					 jefe[i].DatosJefe();
					 System.out.println("");
				 } 
				
			}//switch
		}while(op !=0);
			
		
		
		
		
	
	}//main
		public static void menu(){
		System.out.println("1-modificar el sueldo base de todos los empleados");
		System.out.println("2-modificar el plus de todos los jefes");
		System.out.println("3-visualizar todos los datos de todos los empleados");
		System.out.println("0-fin");
		}
		
		

}
