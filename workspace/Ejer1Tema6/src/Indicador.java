
public class Indicador {
	private int nivel;
	private int velocidad;
	private int tacometro;
	
	Indicador(){
		nivel = 0;
		velocidad=0;
		tacometro=0;
	}//constructor

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getTacometro() {
		return tacometro;
	}

	public void setTacometro(int tacometro) {
		this.tacometro = tacometro;
	}
	
	
	
}//class
