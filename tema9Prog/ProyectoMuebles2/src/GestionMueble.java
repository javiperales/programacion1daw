
public class GestionMueble {

	public static void main(String[] args) {
		//////////////////principal////////////////////////////////////
		
		Mueble mueble[]= new Mueble[15];
		Almacen alma[]= new Almacen[4];
		int opc;
		crearMuebles(mueble);
		creaAlmacen(alma);
		
		
		do{
			menu();
			opc=Libreria.pedirEntero("dame una opcion");
			switch(opc){
			case 1:
				verMueble(mueble);
				break;
				
			case 2:
				verAlmacen(alma);
				break;
				
			case 3:
				creaInfoAlmacen(alma, mueble);
				verInfoAlma(alma);
				break;
			}
			
		}while(opc!=0);
		System.out.println("fin del programa");
	}//main
	
	public static void creaInfoAlmacen(Almacen alma[] , Mueble mueble[]){
		int numMuebles=0;
		for(int i=0; i<alma.length; i++){
			numMuebles=Libreria.enteroAzar(0, mueble.length);
			for(int k=0; k<numMuebles;k++){
				alma[i]= new Almacen(alma[i].getNombre(),mueble,alma[i].getDireccion());
			}
			
		}//for
	}//creaInfoAlmacen
	
	public static void creaAlmacen(Almacen alma[]){
	String nombreAlmacen[]={"leroy merlin", "bricoDepot","aki", "bauhaus" };
	
	String direccionAlma[]={"calle falsa n�123", "calle limite n�3", "avenida miguel servet n�72", "avenida buenos aires n�12", "calle el coso n�45"};
	for (int i=0; i<alma.length;i++){
		alma[i]= new Almacen(nombreAlmacen[i], direccionAlma[i]);
		
	}//for	
	}//creaAlmacen
	
	public static void verInfoAlma(Almacen alma[]){
		for(int i=0;i<alma.length;i++){
			System.out.println("=======================================");
			if(alma[i]!=null){//sin la posiicion no es null entra
				alma[i].mostrarAlmacen();
			}else{//si la posicion es null entra
				System.out.println("No hay informacion sobre este almacen");
			}
		}
	}
	
	public static void verAlmacen(Almacen alma[]){
		for(int i=0; i<alma.length; i++){
			if(alma[i]!=null){
				System.out.println(alma[i].muestraAlmacen());
			}else{
				System.out.println("no hay un almacen creado");
			}
			
		}
		
	}//verAlmacen
	
	public static void crearMuebles(Mueble mueble[]){
		String descripcionMueble[]={"mesilla noche", "silla salon","mesa comedor","escritorio","mesa salon","mueble television","mesa de bar","taburete",
				"silla de estudio","cuna bebe","mesa gaming","armario ropero","mesilla portatil","comoda","taquillon"};
		for(int i=0; i<mueble.length; i++){
			//mueble[i]= new Mueble(descripcionMueble[i], Libreria.enteroAzar(10, 20),Libreria.enteroAzar(15, 25),Libreria.enteroAzar(20, 25));
			mueble[i]=new Mueble(descripcionMueble[i],Libreria.enteroAzar(100, 120),Libreria.enteroAzar(70, 180),Libreria.enteroAzar(50, 90));//relleno el vector

		}//for
		
	}//crearMueble
	
	public static void verMueble(Mueble mueble[]){
		for (int i=0; i<mueble.length; i++){
			if(mueble[i]!=null){
			System.out.println(mueble[i].muestraMueble());
		}else{
			System.out.println("no hay muebles disponibles");
		}//else
		
	}//for
	}//verMueble
	
	public static void menu(){
		System.out.println(" 1 - Ver muebles.");
		System.out.println(" 2 - Ver los almacenes");
		System.out.println(" 3 - Iformacion de los amacenes.");
		System.out.println(" 0 - Salir.");
		
	}
		
		
	
	
	
	
}//class
