import java.util.Scanner;
public class CDojoDni {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final String CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
		final String LETRA_NIE = "XYZ";

		String letraFinal=""; // letra dni introducido
		char letraControl=' ', letraNIE = ' '; // letra de control y letra inicial del NIE

		String nifCorrecto = "";

		int numero=0, op; //número del dni
		boolean correcto;

		do {
			correcto=true;
			do{
				System.out.println("¿Que documento va a dar?\n\t1- DNI\n\t2- NIE");
				op = teclado.nextInt();
			}while (op < 1 || op >2);

			if(op == 2){
				System.out.println("¿Primera letra del NIE?");
				teclado.nextLine(); // limpiamos el buffer del teclado
				letraNIE =  teclado.nextLine().charAt(0);
				if(LETRA_NIE.indexOf(letraNIE) ==-1 ){
					correcto = false;
				}else{
					System.out.print("Introduce el número del NIE: ");
					// leo el Número
					numero = teclado.nextInt();
					if (numero<1 || numero>9999999) {
						correcto = false;
					}else{
						switch (LETRA_NIE.indexOf(letraNIE)){
							case 1:
								numero = numero + 10000000;
								break;
							case 2:
								numero = numero + 20000000;
						}
					}
				}
			}else{
				letraNIE = ' ';
				System.out.print("Introduce el número del DNI: ");
				// leo el Número
				numero = teclado.nextInt();
				if (numero<1 || numero>99999999) {
					correcto = false;
				}
			}// hasta aquí hemos pedido letra de NIE y numero
			// o numero de DNI


			if(correcto){
				// leo la letra de control
				do{
					System.out.print("Introduce la letra de control: ");
					teclado.nextLine(); // limpiamos el buffer del teclado
					letraFinal = teclado.nextLine().toUpperCase();
				}while(letraFinal.length() > 1);
				letraControl = letraFinal.charAt(0);
				// Compruebo que carácter de control es correcto
				if(letraControl != CONTROL.charAt(numero % 23)){
					correcto = false;
					System.out.println("DNI erróneo: " + letraNIE + String.valueOf(numero) + letraFinal + " Teclee de nuevo");
				}else{
					nifCorrecto = letraNIE + String.valueOf(numero) + letraFinal;
				}

			}else{
				System.out.println("DNI erróneo: Teclee de nuevo");
			}

		} while ( ! correcto );
		System.out.printf("\nDNI correcto: %c%08d%c", letraNIE, numero, letraControl);
	}//main

}//class

//  X9975003H Y1234567X Z1234567R Y0000023Z
//  15123456J
