import utilidades.Leer;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Random azar=new Random();
		int numEmpleHoras, numEmplePlantilla, elec, elec2, elec3, elec4, dato, activoHoras=0, activoPlantilla=0;
		String nombre[]={"Juan", "Pepe", "Luis", "Lolo", "Javier", "Pablo", "Maria", "Eva", "Luis"};
		String apellido[]={"Morquecho","Pequeño", "Ravioli", "Sartalamata", "Random", "Libertad", "Remo", "Lobo", "Frio"};
		String DNI[]={"17763936R","40888480T","17763937W","40888737G","25012222M","26998555L","88999555M","66588999W","31336665X"};
		
		System.out.println("¿Cuantos Empleados por horas quieres crear?");
		numEmpleHoras=Leer.pedirEnteroValidar(" ");
		Empleado empleHora[]= new PorHoras[numEmpleHoras];
		for(int i=0; i<empleHora.length; i++){
			empleHora[i]= new PorHoras(DNI[azar.nextInt(9)],nombre[azar.nextInt(9)],apellido[azar.nextInt(9)]);
			activoHoras++;
		}
		
		System.out.println("¿Cuantos Empleados de plantilla quieres crear?");
		numEmplePlantilla=Leer.pedirEnteroValidar(" ");
		Empleado emplePlantilla[]= new Plantilla[numEmplePlantilla];
		for(int i=0; i<emplePlantilla.length; i++){
			emplePlantilla[i]= new Plantilla(DNI[azar.nextInt(9)],nombre[azar.nextInt(9)],apellido[azar.nextInt(9)]);
			activoPlantilla++;
		}
		do{
			System.out.println("Elige una opcion");
			System.out.println("1. Añadir el numero de hijos a un trabajador en plantilla");
			System.out.println("2. Añadir las horas trabajadas a un trabajador por horas");
			System.out.println("3. Consultar nominas de trabajadores por horas o por plantilla");
			System.out.println("4. Eliminar trabajadores");
			System.out.println("5. Añadir trabajadores");
			System.out.println("6. Imprimir listado de trabajadores activos de la empresa");
			System.out.println("Pulse 3 para ver los datos de todos los trabajadores");
			elec=Leer.pedirEnteroValidar("");
			switch(elec){
			case 1://Numero de hijos trabajador plantilla
				for(int i=0; i<emplePlantilla.length; i++){
					System.out.println("\n Pulse " +i +" para introducir el numero de hijos de: ");
					emplePlantilla[i].imprimir();
				}
				dato=Leer.pedirEnteroValidar("");
				if(dato>=0 && dato<emplePlantilla.length){
					emplePlantilla[dato].datosTrabajador();	;
				}else{
					System.out.println("El dato " + dato + " no corresponde a ningun trabajador.");
				}

				break;
			case 2://Numero de horas trabajador por horas
				for(int i=0; i<empleHora.length; i++){
					System.out.println("\n Pulse " +i +" para introducir las horas de: ");
					empleHora[i].imprimir();
				}
				dato=Leer.pedirEnteroValidar("");
				if(dato>=0 && dato<empleHora.length){
					empleHora[dato].datosTrabajador();	;
				}else{
					System.out.println("El dato " + dato + " no corresponde a ningun trabajador.");
				}

				break;

			case 3://Consultar la nomina 
				do{
					System.out.println("1. Nomina trabajadores por horas");
					System.out.println("2. Nomina trabajadores plantilla (Tienen un sueldo fijo)");
					elec4=Leer.pedirEnteroValidar("0. Salir");
					switch(elec4){
					case 1://nomina por horas
						for(int i=0; i<empleHora.length; i++){
							System.out.println("\n Pulse " +i +" para consultar la nomina de");
							empleHora[i].imprimir();
						}
						dato=Leer.pedirEnteroValidar("");
						if(dato>=0 && dato<empleHora.length){
							empleHora[dato].imprimir();
							empleHora[dato].salario();
						}else{
							System.out.println("Empleado " + dato + " no encontrado.");
						}
						break;
					case 2://nomina plantilla
						for(int i=0; i<emplePlantilla.length; i++){
							System.out.println("Pulse " +i +" para ver la nomina de:");
							emplePlantilla[i].imprimir();
						}
						dato=Leer.pedirEnteroValidar("");
						if(dato>=0 && dato<emplePlantilla.length){
							emplePlantilla[dato].imprimir();
							emplePlantilla[dato].salario();
						}else{
							System.out.println("Empleado " + dato + " no encontrado.");
						}
						break;
					}}while(elec4!=0);

				break;

			case 4://ELIMINAR TRABAJADORES
				do{
					System.out.println("1. Eliminar un trabajador por horas.");
					System.out.println("2. Eliminar un trabajador de plantilla");
					elec2=Leer.pedirEnteroValidar("Pulse 0 para salir.");
					switch(elec2){
					case 1://Eliminar trabajador por hora
						for(int i=0; i<empleHora.length; i++){
							System.out.println("\n Pulse " +i +" para eliminar a:");
							empleHora[i].imprimir();
						}
						dato=Leer.pedirEnteroValidar("El trabajador eliminado no se podrá volver a recuperar.");
						empleHora[dato].imprimir();
						if(dato>=0 && dato<empleHora.length){

							if (dato == empleHora.length - 1) {
								System.out.println("Eliminando trabajador:");
								empleHora[dato].imprimir();
								empleHora[dato] = null;
								activoHoras--;
							} else {
								
								for (int i = dato; i < empleHora.length-1; i++) {
									empleHora[i] = empleHora[i+1];
									empleHora[i+1]=null;
								}
								activoHoras--;

								
								System.out.println("Trabajador eliminado");
							} 
						}else{
							System.out.println("Empleado " + dato + " no encontrado.");
						}
						System.out.println(activoHoras);
						break;

					case 2://Eliminar trabajadores por plantilla
						for(int i=0; i<emplePlantilla.length; i++){
							System.out.println("\n Pulse " +i +" para eliminar a:");
							emplePlantilla[i].imprimir();
						}
						dato=Leer.pedirEnteroValidar("El trabajador eliminado no se podrá volver a recuperar.");
						emplePlantilla[dato].imprimir();
						if(dato>=0 && dato<emplePlantilla.length){

							if (dato == emplePlantilla.length - 1) {
								System.out.println("Eliminando trabajador:");
								emplePlantilla[dato].imprimir();
								emplePlantilla[dato] = null;
								activoPlantilla--;
							} else {

								for (int i = dato + 1; i < emplePlantilla.length-1; i++) {

									emplePlantilla[i] = emplePlantilla[i+1];
									emplePlantilla[i+1]=null;

								}
								activoPlantilla--;
								
								System.out.println("Trabajador eliminado");
							} 
						}else{
							System.out.println("Empleado " + dato + " no encontrado.");
						}
						break;

					}
				}while(elec2!=0);
				break;

			case 5://Añadir trabajadores
				do{
					System.out.println("1. Añadir un trabajador por horas");
					System.out.println("2. Añadir un trabajador de plantilla");
					elec3=Leer.pedirEnteroValidar("Pulse 0 para salir");
					switch(elec3){
					case 1://por horas
						
						if(activoHoras==empleHora.length){
							System.out.println("No hay puestos de trabajo libres");
						}else{
							empleHora[activoHoras]= new PorHoras(DNI[azar.nextInt(9)],nombre[azar.nextInt(9)],apellido[azar.nextInt(9)]);
							activoHoras++;
						}
						break;
					case 2:// de plantilla
						
						if(activoPlantilla==emplePlantilla.length){
							System.out.println("No hay puestos de trabajo libres");
						}else{
							emplePlantilla[activoPlantilla]= new Plantilla(DNI[azar.nextInt(9)],nombre[azar.nextInt(9)],apellido[azar.nextInt(9)]);
							activoPlantilla++;
						}
						break;

					}
				}while(elec3!=0);
				break;
			case 6:	//imprimir datos
				for (int i=0; i<emplePlantilla.length; i++){
					if(emplePlantilla[i]!=null){
						emplePlantilla[i].imprimir();
					}
					
				}

				for(int i=0; i<empleHora.length; i++){
					if(empleHora[i]!=null){
						empleHora[i].imprimir();
					}
					
				}

				break;
			}

		}while(elec!=0);

	}

}
