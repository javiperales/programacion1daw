import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Indicador indicador;
		int nivel;
		indicador =  new Indicador();
		
		System.out.println("indicador de nivel" + indicador.getNivel());
		System.out.println("indicador de velocidad " + indicador.getVelocidad());
		System.out.println("indicador de tacometros " + indicador.getTacometro());
		
		indicador.setNivel(150);
		indicador.setVelocidad(200);
		indicador.setTacometro(50);
		
		System.out.println("indicador de nivel, velocidad y tacometro " +indicador.getNivel()+" "+indicador.getVelocidad()+" "+indicador.getTacometro());
		
		System.out.println("indicador de nivel? ");
		nivel=teclado.nextInt();
		indicador.setNivel(nivel);
		System.out.println("indicador de velocidad? ");
		nivel=teclado.nextInt();
		indicador.setVelocidad(nivel);
		System.out.println("indicador de tacometro? ");
		nivel=teclado.nextInt();
		indicador.setTacometro(nivel);
		
		System.out.println("has cambiado los valores");
		System.out.println("valor de nivel " + indicador.getNivel());
		System.out.println("valor de velocidad " + indicador.getVelocidad());
		System.out.println("valor de tacometro " + indicador.getTacometro());
		
		
			
		
	}

}
