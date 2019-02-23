package ejercicio_3;

public class Cuentas {

	private CuentaCorriente[] cuenta;

	public Cuentas(int cuantas) {
		this.cuenta = new CuentaCorriente[cuantas];

	}

	public void añadirCuenta(CuentaCorriente cuenta) {
		this.cuenta[cuenta.getId()] = cuenta;
	}

	public void verCuenta() {

		for (int i = 0; i < cuenta.length; i++) {
			if (cuenta[i] != null) {
				System.out.println("________________________________________________");
				System.out.println(cuenta[i].getId());
				System.out.println(cuenta[i].getCodigo());
				System.out.println(cuenta[i].getTitular());
				System.out.println(cuenta[i].getSaldo());
			}
		}

	}

	public int[] ordenarCuentas2() {

		int aux;
		int orden[] = new int[cuenta.length];
		for (int i = 0; i < orden.length; i++) {
			orden[i] = i;
		}
		for (int i = 0; i < cuenta.length - 1; i++) {
			for (int j = i + 1; j < cuenta.length; j++) {
				if (cuenta[i] != null && cuenta[j] != null) {
					if (cuenta[i].getSaldo() < cuenta[j].getSaldo()) {
						aux = orden[i];
						orden[i] = orden[j];
						orden[j] = aux;
					}
				}
			}

		}
		return orden;
	}

	public void ordenarCuentas() {

		CuentaCorriente aux;
		for (int i = 0; i < cuenta.length - 1; i++) {
			for (int j = i + 1; j < cuenta.length; j++) {
				if (cuenta[i] != null && cuenta[j] != null) {
					if (cuenta[i].getSaldo() < cuenta[j].getSaldo()) {
						aux = cuenta[i];
						cuenta[i] = cuenta[j];
						cuenta[j] = aux;
					}
				}
			}

		}

	}

	public void verCuenta2() {
		System.out.println("________________________________________________");
		for (int i = 0; i < cuenta.length; i++) {
			System.out.println(cuenta[i]);

		}
	}
}
