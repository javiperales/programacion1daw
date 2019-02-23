package examen;
import java.util.*;
public class ejercicio {

	public static void main(String[] args) {

		int numeros,op_mil=0, op_cen=0, op_dec=0,op_uni=0;
		String mil="",cen="",dec="",uni="", palitos= "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero de 1 a 4999");
		numeros = teclado.nextInt();
		while(numeros<1 || numeros>4999){
			System.out.println("Dame un numero de 1 a 4999");
			numeros = teclado.nextInt();
		}
		op_mil=numeros/1000;
		op_cen=(numeros-(op_mil*1000))/100;
		op_dec=(numeros- (op_mil*1000 + op_cen*100))/10;
		op_uni=numeros-(op_mil*1000 + op_cen*100 + op_dec*10 );
		switch(op_mil){
			case 1:mil="M"; 
				break;
			case 2:mil="MM"; 
				break;
			case 3:mil="MMM"; 
				break;     
			case 4:mil="IV"; 
				palitos ="__";
			break;
		}//switch miles
		switch(op_cen){
			case 1:cen="C"; 
				break;
			case 2:cen="CC"; 
				break;
			case 3:cen="CCC"; 
				break;     
			case 4:cen="XC";
				break;
			case 5:cen="D"; 
				break;
			case 6:cen="DC"; 
				break;
			case 7:cen="DCC"; 
				break;     
			case 8:cen="DCCC";
				break;
			case 9:cen="CM"; 
				break;     
			case 0:cen="";
				break;
		}//switch centenas
		switch(op_dec){
			case 1:dec="X"; 
				break;
			case 2:dec="XX"; 
				break;
			case 3:dec="XXX"; 
				break;     
			case 4:dec="XL";
				break;
			case 5:dec="L"; 
				break;
			case 6:dec="LX"; 
				break;
			case 7:dec="LXX"; 
				break;     
			case 8:dec="LXXX";
				break;
			case 9:dec="XC"; 
				break;     
			case 0:dec="";
				break;
		}//switch decenas
		switch(op_uni){
			case 1:uni="I"; 
				break;
			case 2:uni="II"; 
				break;
			case 3:uni="III"; 
				break;     
			case 4:uni="IV";
				break;
			case 5:uni="V"; 
				break;
			case 6:uni="VI"; 
				break;
			case 7:uni="VII"; 
				break;     
			case 8:uni="VIII";
				break;
			case 9:uni="IX"; 
				break;     
			case 0:uni="";
				break;
		}//switch unidades
			System.out.println(palitos);
			System.out.println(mil+cen+dec+uni);
	}//main		
}//class