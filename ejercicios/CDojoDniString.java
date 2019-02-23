import java.util.Scanner;

public class CDojoDniString {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final String LETRA_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
		final String DIGITOS_NUMERICOS = "0123456789";
		final String LETRA_NIE = "XYZ";

		String letraFinal=""; // letra dni introducido
		String cadenaCentral = "";
		char letraControl=' ', letraNIE = ' '; // letra de control y letra inicial del NIE

		String nifCorrecto = "";
		String nif;
		int numero = 0, indice, contadigitos; //número del dni
		boolean correcto;

		do {
			correcto=true;;
			do{
				System.out.println("¿DNI o NIE (9 caracteres)?");
				nif = teclado.nextLine();
			}while(nif.length() !=9 );

			//Los caracteres centrales tienen que ser dígitos numéricos

			contadigitos = 0;
			for(indice = 1; indice < 8; indice++){
				if(DIGITOS_NUMERICOS.indexOf(nif.charAt(indice)) != -1){
					contadigitos++;
				}
			}

			if(contadigitos!=7){
				correcto = false;
			}else{
				// El primer carácter solo puede ser X, Y, Z o un dígito numerico

				if(LETRA_NIE.indexOf(nif.charAt(0)) != -1){
					switch (LETRA_NIE.indexOf( nif.charAt(0) ) ){
					case 0:
						numero = Integer.parseInt(nif.substring(1, 8));
						break;
					case 1:
						numero = 10000000 + Integer.parseInt(nif.substring(1, 8));
						break;
					case 2:
						numero = 20000000 + Integer.parseInt(nif.substring(1, 8));
					}
				}else if(DIGITOS_NUMERICOS.indexOf(nif.charAt(0)) != -1){
					numero = Integer.parseInt(nif.substring(0, 8));
				}
			}
			if(nif.charAt(8) != LETRA_CONTROL.charAt(numero % 23)){
				correcto = false;
				System.out.println("DNI erróneo. Teclee de nuevo");
			}
		} while ( ! correcto );
		System.out.println("\nDNI correcto");
	}//main

}//class
//X9975003H Y1234567X Z1234567R Y0000023Z
//15123456J