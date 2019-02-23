
import java.util.*;

//import fecha.*;
public class Coleccion {

	private Disco[] coleccion;

	private int indice = 0;

	public Coleccion() {
		coleccion = new Disco[100];
	}

	public int getIndice() {
		return indice;
	}

	// MAAG Método para recuperar un disco
	public Disco getDisco(int posicion) {
		return coleccion[posicion];
	}
	// MAAG fin de la insercción

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void añadirdisco(Disco disco) {
		coleccion[indice] = disco;
		indice++;
	}

	public void borrardisco(int indice) {
		coleccion[indice - 1] = null;
		while (this.indice >= indice) {
			coleccion[indice - 1] = coleccion[indice];
			indice++;
		}
		this.indice--;
	}

	public void imprimir() {
		for (int i = 0; i < indice; i++) {
			System.out.print("Disco " + (i + 1));
			coleccion[i].imprimir();
			System.out.println();
		}
	}

	public void menu() {
		Disco disco = new Disco();

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		while (menu != -1) {

			System.out.println("Menu Coleccion de discos");
			System.out.println("¿Que quieres hacer?");
			System.out.println("Opcion1: Añadir discos");
			System.out.println("Opcion2: Borrar discos");
			System.out.println("Opcion3: Ver disco //añadir discos primero");
			System.out.println("Opcion4: Ver coleccion // añadir discos primero");
			System.out.println("Opcion5: Salir");
			menu = teclado.nextInt();

			if (menu == 1) {
				System.out.println("¿Cuantos discos quieres añadir?");
				int ndiscos = teclado.nextInt();
				for (int i = 0; i < ndiscos; i++) {
					Disco disco1 = disco.pedirdisco();
					añadirdisco(disco1);
				}
			}
			if (menu == 2) {
				System.out.println("¿Cuantos discos quieres borrar?");
				int ndiscos = teclado.nextInt();
				for (int i = 0; i < ndiscos; i++) {
					System.out.println("¿Que disco quieres borrar?");
					int borrar = teclado.nextInt();
					borrardisco(borrar);
				}
			}
			if (menu == 3) {
				System.out.println("¿Que disco quieres ver?");
				int i = teclado.nextInt();
				i = i - 1;
				coleccion[i].imprimir();
			}
			if (menu == 4) {
				imprimir();
			}
			if (menu == 5) {
				menu = -1;
			}
		}
	}
}
