
public class Ingrediente implements Comparable<Ingrediente> {

		private String nombre;
		private Integer precio;
		
		public Ingrediente(String nombre, Integer precio) {
			
			this.nombre = nombre;
			this.precio = precio;
		}//constructor
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
		
		public int compareTo(Ingrediente otro){
			
			return this.nombre.compareTo(otro.nombre);
		}//compareTo
		
		
}
