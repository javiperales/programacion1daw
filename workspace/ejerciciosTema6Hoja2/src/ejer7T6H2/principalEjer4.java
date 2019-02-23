package ejer7T6H2;
import java.util.*;
public class principalEjer4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num=0, conta=0;
	System.out.println("introduce numero mayor que 0");
	num=teclado.nextInt();
	Metodos.numerosPrimos(num, conta);

	}

}
