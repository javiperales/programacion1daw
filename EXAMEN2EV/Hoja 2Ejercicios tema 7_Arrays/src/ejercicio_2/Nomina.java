package ejercicio_2;

public class Nomina {
	private int id;
	private double salario;
	private double extraTurno;
	private double extraAntiguedad;
	private double extraTiulacion;
	private double retencion;
	private double totalADI;
	private double total;

	public Nomina() {
	}

	public Nomina(Trabajadores trabajador) {
		double titulo[] = { 250, 500, 1000, 1250, 1500 };
		id = trabajador.getId();
		salario = 425;
		if (trabajador.getTurno() == 'N') {
			extraTurno = 100;
		}
		extraAntiguedad = 75 * trabajador.getAntiguedad();

		extraTiulacion = titulo[trabajador.getTitulacion()];

		totalADI = (salario + extraTurno + extraAntiguedad + extraTiulacion);

		if (trabajador.getEstadoCivil() == 'C') {
			retencion = 10.0 / 100;
		} else
			retencion = 12.0 / 100;

		total = totalADI - (totalADI * retencion);
	}

	public void verTrabajador(int id) {
		System.out.println("id: " + id + " salario " + salario + "\n" + "extra turno nocturno: " + extraTurno + "\n"
				+ "extra antiguedad: " + extraAntiguedad + "\n" + "extra por titulo: " + extraTiulacion + "\n"
				+ "total antes de impuestos " + totalADI + "\n" + "retencion " + retencion + " " + totalADI * retencion
				+ "\n" + "total liquido " + total + "\n");

	}

	public double getTotalADI() {
		return totalADI;
	}

	
	

}//
