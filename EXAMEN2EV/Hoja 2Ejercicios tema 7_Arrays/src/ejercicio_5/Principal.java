package ejercicio_5;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random azar = new Random();
		int cuantos;
		Automovil coche;
		Parque parque;

		String marca[] = { "Audi", "Porsche", "Mercedes", "Citroen", "Seat", "Kia" };
		String modelo[] = { "Deportivo", "Tres puertas", "Cinco puertas", "Descapotable", "Todoterreno",
				"Coche de Campo" };
		int cilindrada[];
		int precio[];

		cuantos = azar.nextInt(5001);
		parque = new Parque(5);// Esta puesto el 5 para verlos y comprpbar
								// mejor. Poner cuantos
		for (int i = 0; i < 5; i++) { // Igual que lo de arriba. Poner cuantos

			coche = new Automovil(marca[azar.nextInt(marca.length)], modelo[azar.nextInt(modelo.length)],
					azar.nextInt(2000) + 1000, azar.nextInt(200000) + 3000);
			parque.añadirCoche(coche, i);
		}

		// parque.verParque();
		// System.out.println("******************************************************");
		// parque.ordenarCochesB();
		// parque.verParque();

		parque.verParque();

	}//
}//