import java.util.TreeMap;

public class Plato {
	private String nombre;
	private TreeMap<String,Integer> mapaIngredientes;
	private Integer precio;
	public Plato(String nombre, Integer precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		mapaIngredientes= new TreeMap<String,Integer>();
		
	}
	
	public void agregaIngrediente(String nombreIngrediente,Integer cantidad){
		
		mapaIngredientes.put(nombreIngrediente, cantidad);
		
	}//agregaIngrediente
	
	
	
}//plato
