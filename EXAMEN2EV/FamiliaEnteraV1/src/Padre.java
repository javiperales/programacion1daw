
public class Padre extends Persona{
	private String apellido;
	
	/*public Padre(){//Implicit super constructor Persona() is undefined. Must explicitly invoke another constructor
	
		apellido="UnApellido";
     }*/
	public Padre(String nombre, String apellido){
		super(nombre);
		this.apellido=apellido;
	}
	
	public String toString(){
		return super.toString() + " " + apellido;
	}
}
