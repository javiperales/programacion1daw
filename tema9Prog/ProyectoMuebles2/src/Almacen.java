import java.util.Arrays;
import java.util.Random;
public class Almacen {
	private String nombre;
	private String direccion;
	private Mueble mueble[];
	
	public Almacen(String nombre, String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		
	}//1║constructor
	
	public Almacen(String nombre,Mueble mueble[] ,String direccion){
		this.nombre=nombre;
		this.direccion=direccion;
		this.mueble=mueble;
		
	}//2║constructor para pasarle muebles

	
	public String muestraAlmacen() {
		return "Almacen [nombre=" + nombre + ", direccion=" + direccion + "]";
	}// metodo para mostrar los datos del almacen

	public String getDireccion() {
		return direccion;
	}

	public Mueble[] getMueble() {
		return mueble;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void mostrarAlmacen(){
		Random alea= new Random();
		int i;
		System.out.println("nombre" +  nombre);
		System.out.println("direccion " + direccion);
		System.out.println("informacion de los muebles que guarda");
		i=alea.nextInt(mueble.length);
		for(int k =0; k<mueble.length; k++){
			if(mueble[i]!=null){
				System.out.println(mueble[i].muestraMueble());
			}else{
				System.out.println("no hay muebles en este almacen");
			}
			
		}
		
		
	}
	
}//class
