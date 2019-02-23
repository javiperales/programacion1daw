package ejercicio_5;

public class Parque {

	private Automovil parque[];

	public Parque(int cuantos) {

		parque = new Automovil[cuantos];

	}

	public void añadirCoche(Automovil coche, int posicion) {

		parque[posicion] = coche;

	}

	public void verParque() {

		for (int i = 0; i < parque.length; i++) {

			System.out.println(parque[i].getMarca());
			System.out.println(parque[i].getModelo());
			System.out.println(parque[i].getCilindrada());
			System.out.println(parque[i].getPrecio());
		}
	}

	public void verCoche(int i) {
		System.out.println(parque[i].getMarca());
		System.out.println(parque[i].getModelo());
		System.out.println(parque[i].getCilindrada());
		System.out.println(parque[i].getPrecio());
	}

	public void ordenarCochesA() {
		Automovil aux;
		for (int i = 0; i < parque.length - 1; i++) {
			for (int j = 0; j < parque.length - 1 - i; j++) {
				if (parque[j].getMarca().compareTo(parque[j + 1].getMarca()) > 0) {
					aux = parque[j];
					parque[j] = parque[j + 1];
					parque[j + 1] = aux;
				}
			}
		}
	}

	public void ordenarCochesB() {
		Automovil aux;
		for (int i = 0; i < parque.length - 1; i++) {
			for (int j = 0; j < parque.length - 1 - i; j++) {
				if (parque[j].getModelo().compareTo(parque[j + 1].getModelo()) > 0) {
					aux = parque[j];
					parque[j] = parque[j + 1];
					parque[j + 1] = aux;
				}
			}
		}
	}

	public void ordenarCochesC() {
		Automovil aux;
		for (int i = 0; i < parque.length - 1; i++) {
			for (int j = 0; j < parque.length - 1 - i; j++) {
				if (parque[j].getCilindrada() < parque[j + 1].getCilindrada()) {
					aux = parque[j];
					parque[j] = parque[j + 1];
					parque[j + 1] = aux;
				}
			}
		}
	}

	public void ordenarCochesD() {
		Automovil aux;
		for (int i = 0; i < parque.length - 1; i++) {
			for (int j = 0; j < parque.length - 1 - i; j++) {
				if (parque[j].getPrecio() < parque[j + 1].getPrecio()) {
					aux = parque[j];
					parque[j] = parque[j + 1];
					parque[j + 1] = aux;
				}
			}
		}
	}
}// Parque
