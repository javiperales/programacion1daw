import java.util.Arrays;

public class Almacen {

	/***
	 * @author Diogo Pinto
	 ***/

	private String nombre;
	private String direccion;
	private Mueble[] muebles;

	public Almacen(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		muebles = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDirección(String dirección) {
		this.direccion = dirección;
	}

	public String muestraAlmacenTodo() {
		String cadenaMuebles = "\n";
		for (int i = 0; i < muebles.length; i++) {
			cadenaMuebles = cadenaMuebles + muebles[i].muestraMueble() + "\n";
		}
		return "Almacen [nombre=" + nombre + ", dirección=" + direccion + "]" + cadenaMuebles;
	}

	public String muestraAlmacenBreve() {
		return "Almacen [nombre=" + nombre + ", dirección=" + direccion + "]";
	}
	
	public void guardarMueble(Mueble mueble) {
		if (muebles == null) {
			muebles = new Mueble[1];
			muebles[0] = mueble;
		} else {
			muebles = Arrays.copyOf(muebles, muebles.length + 1);
			muebles[muebles.length-1] = mueble;
		}
	}
}