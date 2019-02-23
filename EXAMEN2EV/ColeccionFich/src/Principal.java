
public class Principal {

	public static void main(String[] args) {

		Coleccion c = new Coleccion();
		String fich;// MAAG
		char sep;// MAAG

		fich = Fichero.nombreFichero();// MAAG nombre con la ruta completa
		sep = Fichero.separadorFichero();// MAAG separador de campos
		Fichero fichero = new Fichero(fich);
		fichero.leeFichero(c, sep);// MAAG carga el fichero en la colección
		// C:\\datos\\col.txt
		c.menu();
		fichero.escribeFichero(c, sep);// MAAG vuelca la colección en el fichero
	}// main
}// Principal