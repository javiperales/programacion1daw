
public class Principal {

	public static void main(String[] args) {
		Integer cuantosEmp,cuantosAdmin,cuantosMaqui,total;
		Empleado [] empleados;
		
		String nombres[]={"Luis","Jesus","Jaime","Carlos","Rafa","Jose","Pilar","Maria","Paola","Lolo"};
		String estudios[]={"Informatica","Administracion","Peluqueria","Marketing","Derecho","Torcido"};
		
		cuantosEmp = Leer.pedirEntero("Cuantos empleados hay en la empresa?");
		total=cuantosEmp;
		
		cuantosAdmin = Leer.pedirEntero("Cuantos administrativos hay en la empresa?");
		total+=cuantosAdmin;
		
		cuantosMaqui = Leer.pedirEntero("Cuantos maquinistas hay en la empresa?");
		total+=cuantosMaqui;
		
		empleados=new Empleado[total];
		
		crearEmpleados(empleados,nombres,estudios,cuantosEmp,cuantosAdmin,cuantosMaqui);
		
		mostrarDatos(empleados);
		
	}//main
	
	public static void crearEmpleados(Empleado [] empleados, String[] nombres, String[] estudios, Integer contaEmpleados, Integer contaAdministrativos, Integer contaMaquinistas ){
		//crea los empleados
		for (int i = 0; i < contaEmpleados; i++) {
			empleados[i]=new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20));
		}
		//crea los administrativos
		for (int i = contaEmpleados; i < contaEmpleados+contaAdministrativos; i++) {
			empleados[i]=new Administrativo(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),
					estudios[(int) (Math.random()*estudios.length)],(int)(Math.random()*20+1));
		}
		// crea los maquinistas
		for (int i = contaEmpleados+contaAdministrativos; i < empleados.length; i++) {
			empleados[i]=new Maquinista(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),(int)(Math.random()*20+1),(int)(Math.random()*5));
		}
	}
	
	
	public static void mostrarDatos(Empleado [] v){
		for (int i = 0; i < v.length; i++) {
			v[i].visualizarTodosDatos();
		}
	}

}//Principal
