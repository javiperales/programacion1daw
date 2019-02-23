package ejemplo1Modificado;

public class empleado {
	 private String nombre;
	 private float sueldo;

	 
		public empleado(String nombre, float sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

		public void setNombre(String nombre){	
			this.nombre=nombre;
			return;
		}
		
		public void setSueldo(float sueldo){		
			this.sueldo=sueldo;
			return;
		}
		
		public void setTodo(String nombre , float sueldo){
			this.nombre=nombre;
			this.sueldo=sueldo;
			return;
			
		}//setTodo
		
		public void imprimeNombre(){
			System.out.println("NOMBRE" + nombre);
			return;
		}
	 public void imprimeSueldo(){
		 System.out.println("su sueldo es: " + sueldo);
		 return;
	 }
	 public void imprimeTodo(){
		 imprimeNombre();
		 imprimeSueldo();
		 
		 return;
	 }
	 
}//class
