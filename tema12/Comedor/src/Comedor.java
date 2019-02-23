import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Comedor {

	public static void main(String[] args) {
		/////////////principal//////


		TreeSet<Ingrediente> setIngredientes = new TreeSet<Ingrediente>();
		ArrayList<Plato> listaPlatos = new ArrayList<Plato>();
		Mesa[] mesas= new Mesa[10];
		Plato[] carta = new Plato[6];
		Menu[] menues= null;
		
		creaListaPlatos(listaPlatos);
		//System.out.println(listaPlatos.get(Libreria.a_enteroAzar(0, 15)));
		carta = creaCarta(listaPlatos);
		System.out.println(listaPlatos);
		//mesas = creaMesas( carta , menues ,listaPlatos);
		creaMesas( carta , mesas);
		
		
	}//main
	
	public static TreeSet<Ingrediente> creaIngredientes(TreeSet<Ingrediente> setIngredientes){
		 String ingredienteAzar=Libreria.a_ingredientesAzar();
		 Integer precioAzar=Libreria.a_enteroAzar(1, 5)+1;
		Ingrediente ingredientes;
		ingredientes = new Ingrediente(ingredienteAzar,precioAzar);
		
		for(int i=0; i<Libreria.a_ingredientesAzar().length();i++){
		setIngredientes.add(ingredientes);
		}
		return setIngredientes;
	}//creaIngredientes
	
	public static void creaListaPlatos(ArrayList<Plato> listaPlatos){
		Plato miPlato;
		String nombrePlato;
		Ingrediente ingrediente;
		for(int i=0; i<15; i++){
			// Integer precioAzar=Libreria.a_enteroAzar(1, 5);
			Integer precioGramo=Libreria.a_enteroAzar(10, 250);
			Integer cantidad=Libreria.a_enteroAzar(1, 3);
			Integer precioPlato=precioGramo*cantidad/100;
				nombrePlato=Libreria.a_ingredientesAzar()+" con "+Libreria.a_ingredientesAzar();
			miPlato = new Plato(nombrePlato,precioPlato+1);
			listaPlatos.add(miPlato);		
			
		}
		return ;
		
	}
	
	public static Plato[] creaCarta(ArrayList<Plato> listaPlatos){
		Plato[] carta = new Plato [6];
		for(int i=0; i<6;i++){
			carta[i]=listaPlatos.get(Libreria.a_enteroAzar(0, listaPlatos.size()-1));
		}//for
							
		return carta;
	}//creaCarta
	
	public static void creaMesas(Plato[] carta ,Mesa[] mesas){
		
		int numMesas =Libreria.a_enteroAzar(1, 10);	
		for(int i=0;i<numMesas;i++){ // numero de mesas
			
			mesas[i] = new Mesa(i+1);
				int comensales =Libreria.a_enteroAzar(1, 6);
				Menu[] menues = new Menu[comensales];
				System.out.println(" en la mesa " +i+ " hay "+comensales + "\nla carta es \n");
				verCarta(carta);
					for(int k=0; k<comensales;k++){ 
						creaMenu(menues,carta);
					}
					mesas[i].setMenues(menues);
			//pedir menu de cada cliente. maximo 6
					verPlato(mesas,menues);		
					
		}
		return;
	}//creaMesas
	
	public static  Menu[] creaMenu(Menu[] menues ,Plato[] carta){
		Plato[] platosDeunCliente= new Plato[2];
		int numAlea;
			for(int i=0; i<menues.length;i++){
				menues[i]= new Menu();
					for(int k=0; k<platosDeunCliente.length;k++){
						
						numAlea=Libreria.a_enteroAzar(0, carta.length-1);
						platosDeunCliente[k]=carta[numAlea];
					}//ultimoFor
					menues[i].setPlatos(platosDeunCliente);
			}//primerFor
			
		return menues;
	}//creaMenu
	
	public static void verCarta(Plato [] carta){
		System.out.println(" Porque lo pide Arturo:\n" + Arrays.toString(carta));
		for(int i=0; i<carta.length;i++){
			System.out.println(carta[i].getNombre()+".........."+ carta[i].getPrecio());
		}
		
	}//verCarta
	
	public static void verPlato( Mesa[] mesas,Menu[] menues){
		Plato[] platosDeCliente = new Plato[2];
		int  i, k, o, pago;
		int suma=0;
			for( i=0; i<1 && mesas!=null;i++){
				for(k= 0; k<menues.length && menues!=null ;k++){
					//menues[k].getPlatos();
					platosDeCliente = menues[k].getPlatos();
					
					for( o = 0; o < 2; o++){
						 suma=suma+platosDeCliente[o].getPrecio();
						 
						 System.out.println(platosDeCliente[o].toString());
						
					}
					
					
				}
				
				System.out.println("la factura de la mesa " +mesas[i].getNumMesa()+" es " +suma);	
				pago=Libreria.t_pedirEnteroValidar(0, "la cuenta es " +suma);
				if(suma>pago){
					System.out.println("te falta de pagar " +(suma-pago));
				}else if(pago>suma){
					System.out.println("las vueltas son " +(pago-suma));
					
				}else{
					System.out.println("adios buenas tardes");
				}
				
				
			}
		
	}//verPlato
	


}//class
