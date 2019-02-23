
public class Cliente implements persona {
	
	 String nombreEmpresa;
	 String nombre , apellidos, id_cliente;
	 public void pedirDatos(){
		 
		 nombre=Leer.pedirCadena("nombre del empleado");
		 apellidos=Leer.pedirCadena("apellido del empleado");
		 id_cliente=Leer.pedirCadena("id del cliente");
		 
	 }
	 public void TodosDatos(){
		 System.out.println("nombre: "+nombre);
		 System.out.println("apellidos: " +apellidos);
		 System.out.println("id_empresa" +id_cliente);
		 
	 }

}
