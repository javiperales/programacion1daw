import java.util.TreeMap;

public class Plato {
	private String nombre;
	private TreeMap<Ingrediente,Integer> mapaIngredientes;
	private Integer precio;
	Ingrediente ingrediente;
	
	public Plato(String nombre, Integer precio) {
		this.nombre = nombre;
		this.precio = precio;
		//mapaIngredientes= new TreeMap<String,Integer>();
		//mapaIngredientes.put(ingrediente.getNombre(), ingrediente.getPrecio());
	}
	
	public void agregaIngrediente(Ingrediente nombreIngrediente,Integer cantidad){
		
		mapaIngredientes.put(nombreIngrediente, cantidad);
		
	}//agregaIngrediente
	
	public int compareTo(Plato otro){
		
		return this.nombre.compareTo(otro.nombre);
	}//compareTo

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", mapaIngredientes=" + mapaIngredientes + ", precio=" + precio + "]";
	}
	
	
	
	
}//plato
