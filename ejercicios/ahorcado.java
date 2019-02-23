import java.util.*;
public class Ahorcado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String vecPalabras[] = {"mesa", "pseudocodigo", "lolo"};
		String letra, palabraMisteriosa;		
		char arrayPrueba[];
		int intentos, ind, aciertos;
		boolean acertada = false;


		palabraMisteriosa = vecPalabras[(int)(Math.random()*3)];
		arrayPrueba = new char[palabraMisteriosa.length()];
		//Rellenamos palabraPrueba con rayas
		for(ind = 0; ind < palabraMisteriosa.length(); ind++){
			arrayPrueba[ind] = '-';
		}
		//System.out.println(palabraMisteriosa);
		intentos = 0; aciertos = 0;
		while(intentos < 10 && acertada == false ){			
			intentos++;
			System.out.println("Intento: " + intentos);
			do{
				System.out.println("�Letra?");
				letra = teclado.nextLine();
			}while(letra.length() > 1);
			for(ind = 0; ind < palabraMisteriosa.length(); ind++){
				if(palabraMisteriosa.charAt(ind)==letra.charAt(0)){
					arrayPrueba[ind] = letra.charAt(0);
					aciertos++;
				}
				System.out.print(arrayPrueba[ind]);
			}//for
			System.out.println();
			if(aciertos == palabraMisteriosa.length()){
				acertada = true;
			}			
		}//while
		if(!acertada){
			System.out.println("Has agotado los intentos");
		}else{
			System.out.println("Enhorabuena. Has acertado");
		}
	}//main

}//class