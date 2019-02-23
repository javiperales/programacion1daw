
public class colaDinamica implements dinamizable{

	private Integer cola[];
	private Integer frente;

	colaDinamica(Integer tamanioMax) {
		cola = new Integer[tamanioMax];
		frente = 0;
	}
	public void add(Integer elemento){ // apilar un elemento
		if(frente==cola.length){  
			System.out.println("La pila esta llena.");
		}else{
			cola[frente] = elemento;
			frente++;
		}
	}

	public Integer delete(){ // desapilar un elemento
		if(frente == 0) {
			System.out.println("Pila vac�a.");
			return 0;
		}
		else {
			frente--;
			return cola[frente];
		}
	}
}
