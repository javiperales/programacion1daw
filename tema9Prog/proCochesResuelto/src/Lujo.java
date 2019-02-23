public class Lujo extends Coche {

	private Integer codigo;
	private static Integer siguiente = 10001;

	public Lujo(String matricula, String marca, String modelo, Fecha fechaFabricacion, Integer precioDiario) {
		super(matricula, marca, modelo, fechaFabricacion, precioDiario);
		codigo = siguiente;
		siguiente++;
	}

	public String visualizar() {
		return "Lujo [codigo=" + codigo + ", Matricula=" + getMatricula() + ", Marca=" + getMarca() + ", Modelo="
				+ getModelo() + ", FechaFabricacion=" + getFechaFabricacion() + ", PrecioDiario=" + getPrecioDiario()
				+ ", Disponible=" + getDisponible() + "]";
	}

}