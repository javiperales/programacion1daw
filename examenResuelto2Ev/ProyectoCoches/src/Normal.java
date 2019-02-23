public class Normal extends Coche {

	/***
	 * @author Diogo Pinto
	 ***/

	private String parking;

	public Normal(String matricula, String marca, String modelo, Fecha fechaFabricacion, Integer precioDiario,
			String parking) {
		super(matricula, marca, modelo, fechaFabricacion, precioDiario);
		this.parking = parking;
	}

	public String visualizar() {
		return "Normal [parking=" + parking + ", Matricula=" + getMatricula() + ", Marca=" + getMarca() + ", Modelo="
				+ getModelo() + ", FechaFabricacion=" + getFechaFabricacion() + ", PrecioDiario=" + getPrecioDiario()
				+ ", Disponible=" + getDisponible() + "]";
	}

}