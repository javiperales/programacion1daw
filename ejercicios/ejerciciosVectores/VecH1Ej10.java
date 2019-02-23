import java.util.Scanner;
public class VecH1Ej10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int NUM_CARTAS = 40;
		int num;
		int contador = 0;
		char decision;
		String numero = "";
		String palo = "";
		int[] cartas = new int[NUM_CARTAS];
		for(int i=0;i<NUM_CARTAS;i++){
			cartas[i] = 0;
		}
		do{//Seleccionar que hacer
			System.out.println("Introduce S para sacar una carta, R para reiniciar la baraja y Q para salir");
			decision = scanner.next().charAt(0);

			if(decision == 's' || decision =='S'){
				//Sacar un numero aleatorio y comprobar que la carta no está repetida
				do{
					num = (int)Math.floor(Math.random()*(40));
				}while(cartas[num]==1);
				
				//num = contador; //Para comprobar que saca todas las cartas
				switch(num%10){
				case 0:
					numero = "el as";
					break;
				case 1:
					numero = "el dos";
					break;
				case 2:
					numero = "el tres";
					break;
				case 3:
					numero = "el cuatro";
					break;
				case 4:
					numero = "el cinco";
					break;
				case 5:
					numero = "el seis";
					break;
				case 6:
					numero = "el siete";
					break;
				case 7:
					numero = "la sota";
					break;
				case 8:
					numero = "el caballo";
					break;
				case 9:
					numero = "el rey";
					break;
				}//fin Switch
				switch(num/10){
				case 0:
					palo = "Oros";
					break;
				case 1:
					palo = "Copas";
					break;
				case 2:
					palo = "Espadas";
					break;
				case 3:
					palo = "Bastos";
					break;
				}
				contador += 1;
				cartas[num] = 1;
				System.out.println("Has sacado " + numero + " de " + palo);
				System.out.println("Has sacado " + contador+ " cartas");
			}//if
			if(decision == 'R' || decision == 'r' || contador == NUM_CARTAS){
				if(contador ==NUM_CARTAS){
					System.out.println("Has sacado todas las cartas, reiniciamos la baraja");
				}else{
					System.out.println("Reiniciando la baraja");
				}
				for(int i=0; i<NUM_CARTAS; i++){
					cartas[i] = 0;
				}
				contador = 0;
			}
		}while (decision != 'Q' && decision != 'q');
	}//main
}//class
