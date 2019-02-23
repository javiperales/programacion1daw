import java.util.*;
public class ListarNumerosEnOrden {

	public static void main(String[] args) {
		TreeSet<Integer> conjunto = new TreeSet<Integer>();
		int num=0;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("dame un numero, para finalizar pulsa -9999");
			num=teclado.nextInt();
			if(num!=-9999){
				conjunto.add(num);
			}
			
		}while(num!=-9999);
		
		System.out.println(conjunto);
		System.out.println("ordenacion por orden numerico ascendente");
	}

}
