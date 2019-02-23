import java.util.*;
public class Principal {

	public static void main(String[] args) {
		//////////////////////////////////PRINCIPAL/////////////////////////////////////////////////////////////////
		Fecha hoy = new Fecha(26,2,2018); //creo un objeto de tipo fecha llamado hoy 
		Integer opc;
		Empleado emple[] = new Empleado[20]; //creamos un vector de tipo Empleado llamado emple de longitud 20
		
		do {
			opc = menu();
			switch (opc) {
			case 1:
				creaResponsable(emple);
				break;
			case 2:
				creaTecnico(emple);
				break;
			case 3:
				creaAdministrativo(emple);
				break;
			case 4:
				visualizarPlantilla(emple, hoy);
				break;
			case 5:
				nominaEmpresa(emple, hoy);

			default:
				break;
			}

		} while (opc != 0);
		
		
	}//main

	public static void visualizarPlantilla(Empleado[] emple, Fecha hoy){
		Leer.mensaje("------JEFES------");
		for(int i=0; i<emple.length;i++){
			if(emple[i] instanceof Responsable){
				emple[i].visualizaTodo(hoy);
				Leer.mensaje("----------------------------");
			}//if						
		}//for
		
		Leer.mensaje("-----------------");
		Leer.mensaje("----Administrativos----");
		for(int i=0; i<emple.length;i++){
			if(emple[i] instanceof Administrativo){
				emple[i].visualizaTodo(hoy);
				Leer.mensaje("--------------------");
			}//if
		}//for
		
		Leer.mensaje("------------------");
		Leer.mensaje("-----Tecnicos-----");
		for(int i=0; i<emple.length;i++){
			if(emple[i] instanceof Tecnico){
				emple[i].visualizaTodo(hoy);
				Leer.mensaje("-----------------");
			}//if
			
		}//for
		Leer.mensaje("---------------------------");
		
	}//visualizar
	
	
	
	
	public static void creaTecnico(Empleado empleados[]){
		Responsable jefe;
		String nombres[]={"javier","oscar","raquel","yaiza","david"};
		String especialidad[]={"informatica","mecanica","electricista","redes"};
		Fecha newFecha = new Fecha((int)(Math.random()*28)+1, (int)(Math.random()*11)+1,(int)(Math.random()*(2017-1960+1))+1960);//creo una fecha aleatoria
		Fecha newFechaIng=new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2017 - 2000 + 1)) + 2000);//creo una fecha de ingreso aleatoriamente
		Float especialidadesPlus[]={0.1f,0.2f,0.3f,0.4f,0.5f};
		int plus =(int) (Math.random() * especialidadesPlus.length);
		Integer numJefe;
		for (int i=0; i<empleados.length;i++){
			if(empleados[i] instanceof Responsable){
				Leer.mensaje(empleados[i].toString());
			}//if		//si los empleados estan asignados a un responsable los mostrara
	}//for
		 Boolean salir=false;
		 
		 while(salir==false){
			 do{
				 numJefe=Leer.pedirEntero("numero de empleado de un jefe para asignarle al tecnico");
			 }while(numJefe>empleados.length); //pedir un numero de empleado que sea jefe, lo pedira mientras numjefe sea mayor que la longitud del vector
			 if(empleados[numJefe -1] instanceof Responsable){
				 jefe=(Responsable) empleados[numJefe -1]; //el jefe es un responsable con el numero de jefe -1
				 empleados[Empleado.getSiguiente()-1]= new Tecnico(nombres[(int)(Math.random()*5)],newFecha, newFechaIng,
						 especialidad[plus],especialidadesPlus[plus], jefe );
				 salir=true;
			 }//if
			 
		 }//while
		
	} //crearTecnico
	
	public static void creaAdministrativo(Empleado empleados[]){
		String nombres[]={"javier","oscar","raquel","yaiza","david"};
		String departamentos[]={"ventas","entradas","it","devoluciones"};
		Fecha newFecha = new Fecha((int)(Math.random()*28)+1, (int)(Math.random()*11)+1,
				(int)(Math.random()*(2017-1960+1))+1960);//creo una fecha aleatoria
		Fecha newFechaIng=new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2017 - 2000 + 1)) + 2000);//creo una fecha de ingreso aleatoriamente
		Responsable jefe;
		Integer numJefe;
		
		for(int i =0; i<empleados.length;i++){
			if(empleados[i] instanceof Responsable){
				Leer.mensaje(empleados[i].toString());
			}//if
		}//for
		Boolean salir=false;
		
		while(salir==false){
			do{
				numJefe=Leer.pedirEntero("indica el numero de jefe para asignarle al administrador");
			}while(numJefe<empleados.length);
			if(empleados[numJefe -1]  instanceof Responsable){
				jefe=(Responsable) empleados[numJefe -1];
				empleados[Empleado.getSiguiente()-1]=new Administrativo(nombres[(int)(Math.random()*5)],
						newFecha, newFechaIng,departamentos[(int)(Math.random()*4)],jefe);
			}//if
			
		}//while								
	}//crearAdministrativo
	
	public static void nominaEmpresa(Empleado[] empresa, Fecha hoy){
		Float suma=0f;
		Administrativo administrativo;
		Leer.mensaje("nomina de los empleados");
		
		for(int i=0; i<empresa.length && empresa[i]!=null; i++){
			Leer.mensaje(empresa[i].getNombre()+"----->"+empresa[i].getClass());
			if(empresa[i] instanceof Administrativo){
				administrativo=(Administrativo) empresa[i];
				Leer.mensaje(administrativo.calculoNomina(hoy)+"€");
				suma=suma+empresa[i].calculoNomina(); //al estar el metodo sobrecargado , hay que crear un objeto Administrativo para poder ver el metodo
			}else{
				Leer.mensaje(empresa[i].calculoNomina() + "€");
				suma=suma+empresa[i].calculoNomina();
			}
			
		}
		Leer.mensaje("nomina total de la empresa: "+suma +"\n\n");		
	}//nominaEmpresa
	
	
	
	public static void creaResponsable(Empleado empleados[]){
		String nombres[]={"javier","oscar","raquel","yaiza","david"};
		String departamentos[]={"ventas","entradas","it","devoluciones"};
		Fecha newFecha = new Fecha((int)(Math.random()*28)+1, (int)(Math.random()*11)+1,(int)(Math.random()*(2017-1960+1))+1960);//creo una fecha aleatoria
		
		Fecha newFechaIng=new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2017 - 2000 + 1)) + 2000);//creo una fecha de ingreso aleatoriamente
		
		empleados[Empleado.getSiguiente()-1] = new Responsable(nombres[(int) Math.random()*5], newFecha, newFechaIng , (float)Math.random()*4,
				departamentos[(int)Math.random()*4]);
		//creo un empleado con nombres y fechas aleatorios

		
	}//creaResponsable
	
	public static Integer menu() {
		Integer opcion;
		Leer.mensaje("1-CREAR RESPONSABLE");
		Leer.mensaje("2-CREAR TECNICO");
		Leer.mensaje("3-CREAR ADMINISTRATIVO");
		Leer.mensaje("4-VISUALIZAR PLANTILLA");
		Leer.mensaje("5-CALCULAR NOMINA EMPRESA");
		Leer.mensaje("6-CAMBIAR BONOS");
		Leer.mensaje("0-SALIR");
		opcion = Leer.pedirEntero("*****SELECCIONA UNA OPCION****");
		return opcion;
	}//menu
}//class
