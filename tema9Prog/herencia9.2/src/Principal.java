
public class Principal {

	public static void main(String[] args) {
		Integer cuantosEmp, cuantosAdmin, cuantosMaqui, total;
		Empleado [] empleados;
		//Administrativo [] administrativos;
		//Maquinista [] maquinistas;
		String nombres[]={"Luis","Jesus","Jaime","Carlos","Rafa","Jose","Pilar","Maria","Paola","Lolo"};
		String estudios[]={"Informatica","Administracion","Peluqueria","Marketing","Derecho","Torcido"};
		
		
		cuantosEmp = Leer.pedirEntero("Cuantos empleados hay en la empresa?");
		total=cuantosEmp;
		cuantosAdmin = Leer.pedirEntero("Cuantos administrativos hay en la empresa?");
		total+=cuantosAdmin;
		//administrativos = new Administrativo[cuantos];
		cuantosMaqui = Leer.pedirEntero("Cuantos maquinistas hay en la empresa?");
		//maquinistas = new Maquinista[cuantos];
		total+=cuantosMaqui;
		empleados = new Empleado[total];
		crearEmpleados(empleados,nombres,estudios,cuantosEmp, cuantosAdmin,cuantosMaqui);
		//crearAdministrativos(empleados,nombres,estudios);
		//crearMaquinistas(empleados,nombres);
		
		mostrarDatos(empleados);Leer.mostrarEnPantalla("********************************");
		//mostrarDatos(administrativos);Leer.mostrarEnPantalla("********************************");
		//mostrarDatos(maquinistas);Leer.mostrarEnPantalla("********************************");
		EdadMedia(empleados);
		
	}//main
	
	public static void crearEmpleados(Empleado [] empleados, String[] nombres , String [] estudios 
			, Integer contaEmpleados, Integer contaAdmin, Integer contaMaqui ){
		
		for(int i=0; i<contaEmpleados;i++){
			empleados[i]= new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20));
			
		}//forcontaEmple
		
		for(int i =0; i<contaEmpleados+contaAdmin; i++){
			empleados[i]= new Administrativo(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),
					estudios[(int) (Math.random()*estudios.length)],(int)(Math.random()*20+1));
		}//for contraAdmin
		
		for(int i =contaEmpleados+contaAdmin; i<empleados.length; i++){
			empleados[i]= new Maquinista(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),(int)(Math.random()*20+1),(int)(Math.random()*5));
		}
	}
	
/*	public static void crearAdministrativos(Empleado [] administrativos, String[] nombres, String[] estudios ){
		for (int i = 0; i < administrativos.length; i++) {
			administrativos[i]=new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),
					estudios[(int) (Math.random()*estudios.length)],(int)(Math.random()*20+1));
		}
	}
	
	public static void crearMaquinistas(Empleado [] maquinistas, String[] nombres){
		for (int i = 0; i < maquinistas.length; i++) {
			maquinistas[i]=new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),(int)(Math.random()*20+1),(int)(Math.random()*5));
		}
	}*/
	
	public static void mostrarDatos(Empleado [] v){
		for (int i = 0; i < v.length; i++) {
			v[i].visualizarTodosDatos();
		}
	}
	
	public static void EdadMedia(Empleado [] v){
		Integer sumaEdad=0, MediaEdad, maxEmple=0;
		for(int i =0; i<v.length;i++){
			v[i].getEdad();
			sumaEdad=sumaEdad+v[i].getEdad();
			maxEmple=v.length;			
		}
		MediaEdad=sumaEdad/maxEmple;
		System.out.println(MediaEdad);
	}//EdadMedia

}//Principal
