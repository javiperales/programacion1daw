
public class comedor {

	public static void main(String[] args) {
		/////////////principal//////////////////////////////////////////////
		menu[] menu1 =new menu[20];
		platos[] platos = new platos[6];
		Ingredientes[] ingrediente = new Ingredientes[15];
		mesa[] mesas = new mesa[100];
		carta carta = new carta();
		crearIngredientes(ingrediente);
		creaPlatos(platos, ingrediente);
		generarCarta(carta,platos);
		mostrarCarta(carta);
		generarMenus(platos,menu1);
		mostrarMenus(menu1);
		generarMesas(platos,menu1,mesas);
		consultarMesas(mesas);
		
		

	}//main
	
	public static void crearIngredientes(Ingredientes[] ingredientes) {
		String[] ingredientes1 = { "Pepinillo", "Patata", "Picante", "Zanahoria", "Cebolla", "Calabaza", "Mayonesa",
				"Ajo", "Perejil", "Judias", "Albahaca", "Lentejas", "Lechuga", "Huevo duro", "Espinacas", "Brocoli" };
		Float[] ingredientes1Precio = { 0.10f, 0.15f, 0.20f, 0.14f, 0.25f, 0.10f, 0.30f, 0.17f, 0.40f, 0.22f, 0.30f,
				0.12f, 0.10f, 0.23f, 0.14f, 0.20f };

		for (int i = 0; i < ingredientes1.length; i++) {
			ingredientes[i] = new Ingredientes(ingredientes1[i], ingredientes1Precio[i]);
		}
	}
	/*public void crearIngredientes(){
	
		String ingredientes[]=null;
		for(int i=0; i<ingredientes.length;i++){
			ingredientes[i]=Libreria.ingredientesAzar();
		}
		
		Float precioCantidad[]=null;
		
		for(int i=0; i<precioCantidad.length;i++){
			precioCantidad[i]=Libreria.FloatAzar(0.1f, 1);
		}
			
	}//creaIngrediente*/
	
	public static void creaPlatos(platos[] platos,Ingredientes[] ingredientes ){
		for(int i=0;i<6;i++){
			String[] vectorComprobacion = new String[ingredientes.length];	
			platos[i]=new platos();
			int numero=0;
			for(int k=0; k<4;k++){
				Boolean comprobar=false;
				numero = (int) (Math.random() * ingredientes.length); //
				
				do{
					if(vectorComprobacion[numero]==null){
						vectorComprobacion[numero]="S";
						comprobar=true;
					}else{
						numero=(int)(Math.random()* ingredientes.length);
						comprobar=false;						
					}
					
				}while(!comprobar);
				platos[i].añadirIng(ingredientes[numero],  (float) (Math.random() * (200 - 40) + 40));
								
			}//for
			platos[i].calcularPvp();
		}
		
	}//creatPlatos
	
	public static void generarCarta(carta carta, platos[] platos){
		carta.meterPlatos(platos);
		
	}//generarCarta
	
	public static void mostrarCarta(carta carta){
		Libreria.mostrarEnPantalla(carta.visualizar2());
		
		}
	
	public static void generarMenus(platos platos[], menu menus[]){
		for(int i=0; i<menus.length;i++){
			int plato1, plato2;
			plato1= (int) (Math.random() * platos.length);
			
			do{
				plato2=(int) (Math.random() * platos.length);
				
			}while(plato1==plato2);
			menus[i]= new menu(platos[plato1], platos[plato2]);
			
		}//for
		
		
	}//generarMenus
	
	public static void mostrarMenus(menu menus[]){
		Libreria.mostrarEnPantalla("\n\n\t\t\t\t\t>>>>MENUS<<<<");
		
		for(int i=0; i<menus.length;i++){
			Libreria.mostrarEnPantalla("menu "+(i+1));
			Libreria.mostrarEnPantalla(menus[i].visualizaMenu()+"\n");
			
			
		}//for
		
	}//mostrarMenus
	
	public static void generarMesas(platos platos[], menu menus[], mesa mesas[]){
		Libreria.mostrarEnPantalla("\n\n\t****Eleccion de menus**");
		boolean salir=false;
		for(int i=0; i<100 && !salir; i++){
			Float importe;
			
			int numComensales=(int) (Math.random() * (4 - 1) + 1);
			menu guardaMenus[] = new menu[numComensales];
			String continuar="";
			Libreria.mostrarEnPantalla("\nMesa "+(i+1));
			Libreria.mostrarEnPantalla("la mesa consta de " + numComensales + "comensales");
			
			for(int k=0; k<numComensales;k++){
				int menu=0;
				do{
					menu=Libreria.pedirEntero("manu de la persona " +(k+1)+ " de la mesa "+ (i+1));
					
				}while(numComensales>20  || menu <=0);
				guardaMenus[k]=menus[menu-1];
				
			}
			
			mesas[i]= new mesa(guardaMenus);// guardo la mesa con sus menus en la posicion i , indice de mesas
			
			Libreria.mostrarEnPantalla("el total a pagar de la mesa "+ (i+1)+ " es " + mesas[i].getPrecio()+ " €");
			importe =Libreria.pedirFloat(0, "cuanto te ha pagado el cliente");
			while(importe<mesas[i].getPrecio()){
				importe=Libreria.pedirFloat(0, "te ha dado de menos");
			}//while
			
			continuar=Libreria.pedirCadena("correcto, le tienes que devolver "+(Math.round((importe - mesas[i].getPrecio()) * 100d) / 100d) + "€");
			if(continuar.equalsIgnoreCase("salir")){
				salir=true;
			}//if
			
		}//primerFor
		
		
	}//generarMesas
	
		
	public static void consultarMesas(mesa mesas[]){
		Boolean salir=false;
		do{			
			String continuar="";
			int pedirMesa=0;
			pedirMesa=Libreria.pedirEntero("mesa que quieres mostrar");
			if(mesas[pedirMesa-1]==null){
				Libreria.mostrarEnPantalla("no existe la mesa");
				
			}else{
				Libreria.mostrarEnPantalla("la mesa "+ pedirMesa + "tomo lo siguiente");
				mesas[pedirMesa-1].visualizarMesa();
			}//else
			continuar=Libreria.pedirCadena("pulsa ENTER para consultar otra mesa o Escribe SALIR para finalizar");
			if(continuar.equalsIgnoreCase("SALIR")){
				salir=true;
			}
			
		}while(!salir);
		
	}
		
	
	
	
	

}//class
