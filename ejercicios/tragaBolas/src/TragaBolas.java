
public class TragaBolas {

	private String color;
	private int bolasComidas;
	private int maxBolas;

	public TragaBolas(String color, int maxBolas) {
		if ((color.equalsIgnoreCase("verde") || color.equalsIgnoreCase("rojo")) 
				|| color.equalsIgnoreCase("amarillo")) {

			this.color = color;

		}else{// si el color no es correcto asignamos azul
			this.color ="azul";
		}
		if(maxBolas<=0){
			this.maxBolas = 20;
		}else{
			this.maxBolas = maxBolas;
		}
		this.bolasComidas = 0;
	}// constructor

	public TragaBolas (){} //constructor vacio

	public void visualizar() { 
		
		System.out.println("El color es " + this.color + "Las bolas máximas son " + this.maxBolas + "se ha comido "
				+ this.bolasComidas);
	}// visualizar

	public void comer() {
		if (this.bolasComidas < this.maxBolas) {
			this.bolasComidas = this.bolasComidas + 1;
			System.out.println("He comido una bola");
		}
	}// comer

	public void trotar() {
		if (this.bolasComidas >= 1) {
			this.bolasComidas = this.bolasComidas - 1;
			System.out.println("Estoy trotando");
		}
	}// trotar

	public void dormir() {
		if (this.bolasComidas == this.maxBolas) {
			System.out.println("Tripa llena. ZZZZ");
			this.bolasComidas = this.bolasComidas / 2;
		} else {
			System.out.println("No quiero dormir");
		}
	}// dormir

}//
