import java.util.Scanner;
public class CDojoRomanos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i, millares, centenas, decenas, unidades;
		String numRomano;
		String unidadesNumRomano[] = {"", "I", "II", "III", "IV","V", "VI", "VII", "VIII", "IX"};
		String decenasNumRomano[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String centenasNumRomano[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String millaresNumRomano[] = {"","M","MM","MMM","IV"};

		System.out.println("Introduce un número entre 1 y 4999: (0:fin)");
		num = teclado.nextInt();
		while (num < 0 || num > 4999) {
			System.out.print("Introduce un número entre 1 y 4999: (0:fin)");
			num = teclado.nextInt();
		}

		while(num != 0){
			numRomano = "";
			//obtenemos cada cifra del número
			millares = num / 1000;
			centenas = (num % 1000) / 100;
			decenas = ((num % 1000) % 100) / 10;
			unidades = ((num % 1000) % 100) % 10;;

			numRomano = numRomano + millaresNumRomano[millares] + centenasNumRomano[centenas] + decenasNumRomano[decenas] + unidadesNumRomano[unidades];

			System.out.println(num + " en numeros romanos: ");
			
			if(millares == 4){// si los millares son 4 
				System.out.println("__");
			}
			
			System.out.println(numRomano);
			System.out.println("Introduce un número entre 1 y 4999: (0:fin)");
			num = teclado.nextInt();
			while (num < 0 || num > 4999) {
				System.out.print("Introduce un número entre 1 y 4999: (0:fin)");
				num = teclado.nextInt();
			}
		}
	}//main

}


