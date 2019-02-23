public class Coleccion {

	private Disco discos[];
	private int indice;
	private int contador;

	/***
	 * Constructor de la colección, que se le pasa con el parametro "cuantos"
	 */
	public Coleccion(int cuantos) {
		discos = new Disco[cuantos];
		indice = 0;
		contador = 0;

	}

	/**
	 * Metodo que añade un disco nuevo a la coleccion. El if controla que no
	 * pueda haber mas de 100 discos en la coleccion. El identificador establece
	 * el número de los discos, y controla los huecos los que se puede añadir un
	 * disco.
	 **/

	public void añadirDisco(Disco disco) {
		boolean libre = false;

		if (indice < discos.length || contador < discos.length) {
			for (int i = 0; i <= indice && libre == false; i++) {

				if (discos[i] == null) {// BUSCA EL PRIMER HUECO, para ello
										// recorre el índice
										// buscando huecos en los que añadir los
										// nuevos discos
					discos[i] = disco;
					discos[i].setIdentificador(i);
					libre = true;
					contador++;
				}
				if (indice == i) {
					indice++;
				}
			}
		} else
			System.out.println("No se pueden añadir mas discos. Borre algún disco.");

	}

	public void eliminarDisco(int id) {
		if (discos[id] != null) {
			discos[id] = null;
			contador--;
		}
	}

	/**
	 * En el contador acumulamos los discos que se van añadiendo a la colección,
	 * menos los que se borran.
	 */
	public int cuantos() {
		return contador;
	}

	/** Primero se compueba que el disco a modificar existe, y se modifica */
	public void modificarTitulo(String titulo, int id) {
		if (discos[id] != null) {
			System.out.println(discos[id].getTitulo());
			discos[id].setTitulo(titulo);
			System.out.println(discos[id].getTitulo());
		}
	}

	public void modificarArtista(String artista, int id) {
		if (discos[id] != null) {
			System.out.println(discos[id].getArtista());
			discos[id].setArtista(artista);
			System.out.println(discos[id].getArtista());
		}
	}

	public void modificarCanciones(int nCanciones, int id) {
		if (discos[id] != null) {
			System.out.println(discos[id].getnCanciones());
			discos[id].setnCanciones(nCanciones);
			System.out.println(discos[id].getnCanciones());
		}
	}

	public void modificarPrecio(int precio, int id) {
		if (discos[id] != null) {
			System.out.println(discos[id].getPrecio());
			discos[id].setPrecio(precio);
			System.out.println(discos[id].getPrecio());
		}
	}

	public void modificarFechaCompra(String fechaCompra, int id) {
		if (discos[id] != null) {
			System.out.println(discos[id].getFechaCompra());
			discos[id].setFechaCompra(fechaCompra);
			System.out.println(discos[id].getFechaCompra());
		}
	}

	public void modificarCodigoEAN(String codigoEAN, int id) {
		if (discos[id] != null) {
			System.out.println(discos[id].getCodigoEAN());
			discos[id].setCodigoEAN(codigoEAN);
			System.out.println(discos[id].getCodigoEAN());
		}
	}

	/** Este método muestra un disco de la colección, y sus respectivos datos */
	public void verDiscos(int id) {
		if (discos[id] != null) {
			System.out.println(discos[id].getIdentificador());
			System.out.println(discos[id].getTitulo());
			System.out.println(discos[id].getArtista());
			System.out.println(discos[id].getnCanciones());
			System.out.println(discos[id].getPrecio());
			System.out.println(discos[id].getFechaCompra());
			System.out.println(discos[id].getCodigoEAN());
		} else
			System.out.println("El disco " + id + " no existe");
	}

	/**
	 * Este método muestra los discos de la colección (el título y el artista)
	 */
	public void verColeccion() {

		for (int i = 0; i < indice; i++) {

			if (discos[i] != null)
				System.out.println("Nº" + discos[i].getIdentificador() + " " + discos[i].getTitulo() + " de "
						+ discos[i].getArtista());
		}
	}

	/** Busca si el disco existe (mediante el id) y si existe devuelve true */
	public boolean buscar(int id) {
		boolean disco;
		if (discos[id] != null) {
			disco = true;
		} else
			disco = false;
		return disco;
	}

	/**
	 * Al añadir un disco te pide primero el codigo EAN (ya que es un codigo
	 * unico para cada disco) y si ya existe no te deja avanzar y te pide otro
	 */
	public boolean buscarEan(String ean) {
		boolean disco = false;

		for (int i = 0; i < indice && !disco; i++) {
			if (discos[i] != null) {
				if (discos[i].getCodigoEAN().equalsIgnoreCase(ean)) {
					disco = true;
				}
			}
		}
		return disco;
	}

}// Clase Colección

