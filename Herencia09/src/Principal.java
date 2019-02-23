
public class Principal {

	public static void main(String[] args) {
		Integer cuantos;
		Empleado [] empleados;
		Administrativo [] administrativos;
		Maquinista [] maquinistas;
		String nombres[]={"Luis","Jesus","Jaime","Carlos","Rafa","Jose","Pilar","Maria","Paola","Lolo"};
		String estudios[]={"Informatica","Administracion","Peluqueria","Marketing","Derecho","Torcido"};
		
		cuantos = Leer.pedirEntero("Cuantos empleados hay en la empresa?");
		empleados = new Empleado[cuantos];
		cuantos = Leer.pedirEntero("Cuantos administrativos hay en la empresa?");
		administrativos = new Administrativo[cuantos];
		cuantos = Leer.pedirEntero("Cuantos maquinistas hay en la empresa?");
		maquinistas = new Maquinista[cuantos];
		
		crearEmpleados(empleados,nombres);
		crearAdministrativos(administrativos,nombres,estudios);
		crearMaquinistas(maquinistas,nombres);
		
		mostrarDatos(empleados);Leer.mostrarEnPantalla("********************************");
		mostrarDatos(administrativos);Leer.mostrarEnPantalla("********************************");
		mostrarDatos(maquinistas);Leer.mostrarEnPantalla("********************************");
		
	}//main
	
	public static void crearEmpleados(Empleado [] empleados, String[] nombres){
		for (int i = 0; i < empleados.length; i++) {
			empleados[i]=new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20));
		}
	}
	
	public static void crearAdministrativos(Administrativo [] administrativos, String[] nombres, String[] estudios ){
		for (int i = 0; i < administrativos.length; i++) {
			administrativos[i]=new Administrativo(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),
					estudios[(int) (Math.random()*estudios.length)],(int)(Math.random()*20+1));
		}
	}
	
	public static void crearMaquinistas(Maquinista [] maquinistas, String[] nombres){
		for (int i = 0; i < maquinistas.length; i++) {
			maquinistas[i]=new Maquinista(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),(int)(Math.random()*20+1),(int)(Math.random()*5));
		}
	}
	
	public static void mostrarDatos(Empleado [] v){
		for (int i = 0; i < v.length; i++) {
			v[i].visualizarTodosDatos();
		}
	}

}//Principal
