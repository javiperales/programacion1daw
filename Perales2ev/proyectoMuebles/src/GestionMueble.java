

public class GestionMueble {

	public static void main(String[] args) {
		///////////////////////PRINCIPAL///////////////////////////////////////
		Mueble mueble[]=new Mueble[15];
		Almacen almacen[]= new Almacen[4];
		Integer opcion;
		CreaMueble(mueble);
		CreaAlmacen( almacen);
		//guardaMuebles (almacen,mueble);
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				verMuebles(mueble);
				break;
			case 2:
				verAlmacen(almacen);
				break;
			case 3:
				guardaMuebles (almacen,mueble);
				break;
			
			}//switch

		} while (opcion != 0);
		
		
	}//main

	public static void CreaMueble(Mueble mueble[]){
		mueble[0]= new Mueble(10,11,12," a ");
		mueble[1]= new Mueble(15,15,15," b ");
		mueble[2]= new Mueble(20,20,20," c ");
		mueble[3]= new Mueble(25,25,25," d ");
		mueble[4]= new Mueble(10,15,15," e ");
		mueble[5]= new Mueble(10,13,12," f ");
		mueble[6]= new Mueble(100,110,120," g ");
		mueble[7]= new Mueble(101,111,121," h ");
		mueble[8]= new Mueble(103,113,123," i ");
		mueble[9]= new Mueble(105,115,125," j " );
		mueble[10]= new Mueble(150,151,152," k ");
		mueble[11]= new Mueble(106,116,126," l ");
		mueble[12]= new Mueble(610,161,162," m ");
		mueble[13]= new Mueble(120,112,212," n ");
		mueble[14]= new Mueble(19,119,192," o ");
	}// creamos 15 objetos de tipo mueble con valores fijos
	
	public static void CreaAlmacen(Almacen[] almacen){
		almacen[0]= new Almacen("leroy merlin", "alcampo Utebo");
		almacen[1]= new Almacen("Brico Depot" ,"Carretera logroño");
		almacen[2]= new Almacen("Aki","avenida navarra");
		almacen[3]= new Almacen("Bauhaus", "carretera logroño nº2");
		
	}// creo 4 objetos de tipo almacen con sus valores fijos
	
	public static void verMuebles(Mueble[] mueble){
		for(int i=0; i<mueble.length;i++){
			mueble[i].mostrarMuebles();
		}//for	
	}//verMuebles
	
	public static void verAlmacen(Almacen[] almacen){
		for(int i=0; i<almacen.length;i++){
			almacen[i].MuestraAlmacen();
			
		}//for
	}//mostrar por pantalla datos del almacen
	
	
	public static void guardaMuebles(Almacen[] almacen, Mueble[] mueble){
		for(int i=0;i<2;i++){
			
			for(int k=0; k<4;k++){
				Leer.mostrarEnPantalla("en el almacen" +almacen[i]+" se guardan los " + mueble[k]);
			}	
		}//for
		for(int i=2;i<3;i++){
			
			for(int k=4; k<10;k++){
				Leer.mostrarEnPantalla("en el almacen" +almacen[i]+" se guardan los" + mueble[k]);
			}	
		}//for
for(int i=3;i<almacen.length;i++){
			
			for(int k=10; k<mueble.length;k++){
				Leer.mostrarEnPantalla("en el almacen" +almacen[i]+" se guardan los " + mueble[k]);
			}	
		}//for
		
	}
	
	public static Integer menu(){
		Integer opcion;
		Leer.mostrarEnPantalla("1.mostrar muebles");
		Leer.mostrarEnPantalla("2.mostrar almacenes");
		Leer.mostrarEnPantalla("3.mostrar los almacenes que guarda cada mueble");
		Leer.mostrarEnPantalla("0.Salir");
		opcion=Leer.pedirEntero("selecciona una opcion valida");
		return opcion;
	}//menu para pedir y mostrar por pantalla las opciones
}//class
