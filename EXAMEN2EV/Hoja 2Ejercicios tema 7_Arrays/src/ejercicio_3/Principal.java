package ejercicio_3;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random azar = new Random();

		int cuantas = 100;
		char letra;
		String codigo = "";
		String nombre;
		float saldo;
		Cuentas cuentas;
		cuentas = new Cuentas(cuantas);
		CuentaCorriente[] cuentaCorriente = new CuentaCorriente[20];

		for (int n = 0; n < cuentaCorriente.length; n++) {

			codigo = "";
			for (int i = 0; i < 20; i++) {
				letra = (char) (azar.nextInt(10) + 48);
				codigo = codigo + letra;
			}
			String nombres[] = { "Juan", "Jose", "David", "Ana", "Pilar", "Lucia", "Luis", "Alberto", "María", "Pablo",
					"Eva", "Rafa", "Pedro", "Nuria", "Carlos", "Daniel" };

			nombre = nombres[azar.nextInt(nombres.length)];
			saldo = azar.nextInt(2000);

			cuentaCorriente[n] = new CuentaCorriente(nombre, saldo, codigo);
			cuentas.añadirCuenta(cuentaCorriente[n]);

		}
           cuentas.verCuenta();
           cuentas.ordenarCuentas();
          //int orden[]=cuentas.ordenarCuentas2();
           cuentas.verCuenta();
           
           
           
           
           
           
           
	}

}
