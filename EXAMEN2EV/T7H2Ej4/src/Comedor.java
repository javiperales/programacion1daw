import java.util.Random;
import java.util.Scanner;

public class Comedor {
	public static void main(String[] args) {
		Random azar = new Random();
		Scanner teclado = new Scanner(System.in);
		int opcion[]=new int[4],plato1,plato2;
		boolean salta=true;
//	Creamos platos
		Plato plato[] = new Plato[20];
		String nombre_plato[]={"Arroz","Espagueti","Garbanzos","Pechugas","Hamburguesa","Tofu","Lasaña","Patatas","Sopa","Bistec","Fideua","Sardinas","Rabo de toro","Entremeses","Ensalada césar","Tortilla de patata","Estofado","Brocoli","Merluza","Crema de calabaza"};
		for(int k=0;k<plato.length;k++){
			plato[k]=new Plato(nombre_plato[k],(azar.nextInt(4)+2));
		}
// Creamos carta (escogerá 6 de los 20 platos aleatoriamente)
		Carta carta = new Carta(plato);
//Creamos mesas restaurante (tiene 10 mesas)
		Mesa mesa[] = new Mesa[10];
// Iniciamos ejecucion
		do{
			//Menú principal
			System.out.println("1 - Ver Comedor");
			System.out.println("2 - Nuevo Cliente");
			System.out.println("3 - Ver menú del dia");
			System.out.println("0 - Salir");
			opcion[0]=teclado.nextInt();
			switch(opcion[0]){
			case 1:
				int w=0; //variable para comprobar si hay mesas ocupadas
				System.out.println("Elija la mesa de la que quiere ver las opciones");
				for(int e=0;e<mesa.length;e++){ //recorro las mesas buscando valores distintos de null
					if(mesa[e]!=null){ 
					w=e+1;
					}
				}
				if(w==0){ //aqui utilizo la variable w para decir que no hay mesas con clientes
					System.out.println("No hay mesas ocupadas");
				}else{
					for(int e=0;e<mesa.length;e++){ //imprimo las mesas que hay ocupadas en menú
						if(mesa[e]!=null){
							System.out.println(mesa[e].getN_mesa()+" - Mesa "+mesa[e].getN_mesa());
						w=e+1;
						}
					}
					System.out.println("0 - Atras");
					opcion[1]=teclado.nextInt(); //selección de mesa
					if(opcion[1]!=0){
						do{
							System.out.println("Opciones de mesa "+opcion[1]); // opciones de la mesa escogida
							System.out.println("1 - Ver menús de la mesa");
							System.out.println("2 - Ver cuenta");
							System.out.println("3 - Pagar");
							System.out.println("0 - Atrás");
							opcion[2]=teclado.nextInt(); // opcion escogida sobre la mesa
							switch(opcion[2]){ //distintas funciones de cada mesa
							case 1:
								mesa[(opcion[1]-1)].verMenus();
								break;
							case 2:
								mesa[(opcion[1]-1)].verCuenta();
								break;
							case 3:
								System.out.println("¿Qué cantidad de dinero entrega?");
								opcion[3]=teclado.nextInt();
								int vueltas;
								vueltas=mesa[(opcion[1]-1)].pagar(opcion[3]);	//aqui le paso por el constructor N ingredientes que quiero que tenga el plato
								if(vueltas>=0){
									System.out.println("Ha pagado correctamente.");
									System.out.println("Sus vueltas son "+vueltas+"€");
									System.out.println("Gracias por confiar en nosotros y esperamos verle pronto");
									mesa[(opcion[1]-1)]=null; //como se ha pagado correctamente, eliminamos la mesa (null)
									salta=false; //utilizamos la variable salta booleana para saltar el bloque menú de abajo y pasar directamente al menú de atrás
									opcion[1]=0; //ponemos opcion[1] en 0 automaticamente para saltar la iteración
								}
								break;
							}
							if(salta){ //Si no acabamos de borrar una mesa, mostramos las mesas de nuevo
								System.out.println("Elija la mesa de la que quiere ver las opciones");
								for(int e=0;e<mesa.length;e++){
									if(mesa[e]!=null){
										System.out.println(mesa[e].getN_mesa()+" - Mesa "+mesa[e].getN_mesa());
									w=e+1;
									}
								}
								System.out.println("0 - Atras");
								opcion[1]=teclado.nextInt();
							}else{
								salta=true; //colocamos la variable salta en true, despues de borrar una mesa
							}
							
						}while(opcion[1]!=0); //fin menú mesas
					}
					
				}
					System.out.println(); //separador
				break;
			case 2:
				//Nuevo cliente
				System.out.println("Bienvenido cliente al restaurante con más 'clase' de la ciudad");
				System.out.println("¿Cuántos comensales son?");
				opcion[0]=teclado.nextInt();
				mesa[Mesa.getMesas_ocupadas()]=new Mesa(opcion[0]); //asigno numero de mesa dependiendo de el nº de mesas ocupadas
			
				for(int k=0;k<opcion[0];k++){ //recorremos el bucle tantas veces como comensales
					System.out.println("¿Qué desea de primer plato el "+(k+1)+" comensal?");
					carta.verPrimeros();
					plato1=teclado.nextInt();
					System.out.println("¿Qué desea de segundo plato el "+(k+1)+" comensal?");
					carta.verSegundos();
					plato2=teclado.nextInt();
					mesa[(Mesa.getMesas_ocupadas()-1)].insertaMenu(k,carta.getPlatoIndex(plato1-1),carta.getPlatoIndex(plato2-1)); //añadimos el menu de cada comensal
				}
				System.out.println("¡De acuerdo! ¡Su comida se servirá enseguida!");
				break;
			case 3:
				carta.verCarta();
				System.out.println();
				System.out.println();
				break;
			}
		}while(opcion[0]!=0);
		System.out.println("Hasta luego! Vuelva pronto");
		teclado.close();
	}
}
