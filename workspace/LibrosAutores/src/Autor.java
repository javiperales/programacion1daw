
public class Autor {
		private String nombre;
		private String correo;
		private char genero;
		
		
		
		public Autor (String nombre, String correo, char genero){
			this.nombre=nombre;
			this.correo=correo;
			this.genero= genero;
		}
		
		public Autor (String nombre, String correo, String genero){
			this.nombre=nombre;
			this.correo=correo;
			this.genero= genero.charAt(0);
			
		}//constructor
		
		public String cadenaAutor(){
			return "Autor[nombre = " +nombre + " ,email " + correo +" , genero " + genero + " ] "+ "\n";
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public char getGenero() {
			return genero;
		}

		public void setGenero(char genero) {
			this.genero = genero;
		}
		
		
}//class
