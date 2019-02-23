
public class Empleado implements persona {
	
	 String nombreEmpresa;
	 String nombre , apellidos, id_empresa;
	 public void pedirDatos(){
		
		 nombre=Leer.pedirCadena("nombre del empleado");
		 apellidos=Leer.pedirCadena("apellido del empleado");
		 id_empresa=Leer.pedirCadena("id del empleado");
		 
		 
	 }
	 public void TodosDatos(){
		 
		 System.out.println("nombre: "+nombre);
		 System.out.println("apellidos: " +apellidos);
		 System.out.println("id_empresa" +id_empresa);
	 }
	 
	 public static void main(String[] args){
		 
		 System.out.println("hola");
		 
		 Cliente cli = new Cliente();
		 Empleado emple = new Empleado();
		 
		 cli.TodosDatos();
		 cli.pedirDatos();
		 emple.pedirDatos();
		 emple.TodosDatos();
		
		 
		 
	 }//main


}
