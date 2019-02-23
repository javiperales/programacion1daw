import java.util.*;
public class PricipalReloj {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Calendario calendario;
		calendario = new Calendario();
	
	//System.out.println(calendario.getHora()+":"+calendario.getMinutos()*10+":"+calendario.getSegundos());
	
		System.out.println();

		if(calendario.getHora()<10){
			System.out.println("0"+calendario.getHora());
		}//if
		
		if(calendario.getMinutos()<10){
			System.out.println(calendario.getHora()+":"+"0"+calendario.getMinutos()+":"+calendario.getSegundos());
			
		}
		
		
		System.out.println(calendario.getHora()+":"+calendario.getMinutos()+":"+calendario.getSegundos());
		
	
				
		calendario.setHora(14);
		calendario.setMinutos(6);
		calendario.setSegundos(6);
		System.out.println("hora nueva");
		if(calendario.getMinutos()<10 || calendario.getMinutos()<10){
			System.out.println(calendario.getHora()+":"+"0"+calendario.getMinutos()+":"+"0"+calendario.getSegundos());
		}
		
		
	}//main		

}//class
