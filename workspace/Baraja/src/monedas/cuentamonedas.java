package monedas;
import java.util.*;
public class cuentamonedas {

	public static void main(String[] args) {
		double m1cent=0, m2cent=0, m5cent=0, m10cent=0, m20cent=0, m50cent=0, m1e=0, m2e=0, total=0;
		int billetes;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("monedas de 1cent");
		m1cent= teclado.nextInt();
		m1cent=m1cent*0.01;
		System.out.println("monedas de 2cent");
		m2cent= teclado.nextInt();
		m2cent=m2cent*0.02;
		System.out.println("monedas de 5cent");
		m5cent= teclado.nextInt();
		m5cent=m5cent*0.05;
		System.out.println("monedas de 10cent");
		m10cent= teclado.nextInt();
		m10cent=m10cent*0.10;
		System.out.println("monedas de 20cent");
		m20cent= teclado.nextInt();
		m20cent=m20cent*0.20;
		System.out.println("monedas de 50cent");
		m50cent= teclado.nextInt();
		m50cent=m50cent*0.50;
		System.out.println("monedas de 1euros");
		m1e= teclado.nextInt();
		m1e=m1e*1;
		System.out.println("monedas de 2 euros");
		m2e= teclado.nextInt();
		m2e=m2e*2;;
		
		total=m1cent+m2cent+m5cent+m10cent+m20cent+m50cent+m1e+m2e;
		System.out.println("cantidad de billetes");
		billetes=teclado.nextInt();
		total=m1cent+m2cent+m5cent+m10cent+m20cent+m50cent+m1e+m2e+billetes;
		System.out.println("total dinero "+ total);
		

	}

}
