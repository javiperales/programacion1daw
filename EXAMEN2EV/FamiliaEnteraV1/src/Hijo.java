
public class Hijo extends Padre{
	private int edad;
	
	public Hijo(String nombre, String apellido, int edad){
		super(nombre, apellido);
		this.edad=edad;
	}
	
	public String toString(){
		return super.toString() + " " + edad;
	}
}
