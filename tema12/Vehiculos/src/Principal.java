import java.util.TreeSet;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Principal {

	public static void main(String[] args) {
		///////////PRINCIPAL//////////////////////////
		TreeSet<Vehiculo> setVehiculos = new TreeSet<Vehiculo>();
		ArrayList<Vehiculo> listaVehiculos  = new ArrayList<Vehiculo>();
		Vehiculo[] misVehiculos = new Vehiculo[5];
		misVehiculos[0] = new Coche("3053fbw",5,5);
		misVehiculos[1] = new Coche("9140cch",5,5);
		misVehiculos[2] = new Moto("9127kdg",2,125);
		misVehiculos[3] = new Moto("7869gvn",2,250);
		misVehiculos[4] = new Moto("9526jdd",5,600);
		Fichero ficheroEscribir= new Fichero("documento.txt","I");
		Fichero ficheroLeer= new Fichero("documento.txt","O");


		rellenarSet(setVehiculos, misVehiculos);
		verSet(setVehiculos);
		System.out.println("//////////set//////////////");
		rellenarLista(listaVehiculos,misVehiculos);
		verLista(listaVehiculos);
		System.out.println("//////////list//////////////");
		quitarSet(setVehiculos, misVehiculos);
		verSet(setVehiculos);
		//String archivo="archivo";
	//	String paco="samataopaco";
		//escribirFichero(setVehiculos,archivo);
		//escribirFichero(listaVehiculos,paco);
		ficheroEscribir.escribir(setVehiculos);
		System.out.println(ficheroLeer.leerSet());
	}//main

	public static void rellenarLista(ArrayList<Vehiculo> listaVehiculos, Vehiculo[] misVehiculos){
		for(int i=0; i<misVehiculos.length;i++){
			listaVehiculos.add(misVehiculos[i]);
		}//for

	}//rellenarLista

	public static void verLista(ArrayList<Vehiculo> listaVehiculos){
		for (Vehiculo vehiculo : listaVehiculos) {
			System.out.println(vehiculo.PonerMarcha());
			if (vehiculo instanceof Coche){
				((Coche) vehiculo).hacerTrompo();
			}else if (vehiculo instanceof Moto){
				((Moto) vehiculo).hacerCaballito();
			}
		}//for
	}//verLista


	

	
	public static void verSet(TreeSet<Vehiculo> setVehiculos) {
		for (Vehiculo vehiculo : setVehiculos) {
			System.out.println(vehiculo.PonerMarcha());
			System.out.println(vehiculo.toString());
		}
	}

	public static void rellenarSet(TreeSet<Vehiculo> setVehiculos, Vehiculo[] misVehiculos) {
		for(int i=0; i<misVehiculos.length;i++){
			setVehiculos.add(misVehiculos[i]);	
		}//for

	}//rellenarSet


	public static void quitarSet(TreeSet<Vehiculo> setVehiculos, Vehiculo[] misVehiculos){
		Iterator <Vehiculo> it;
		it=setVehiculos.iterator();
		String matricula;
		matricula=Libreria.t_pedirCadena(0, "matricula que quieres eliminar");
		while(it.hasNext()){
			if (it.next().getMatricula().equals(matricula)){
				it.remove();				
			}
		}//while

	}//quitarSet

	public static void quitarList(ArrayList<Vehiculo> listaVehiculos, Vehiculo[] misVehiculos){
		Iterator <Vehiculo> it;
		it=listaVehiculos.iterator();
		String matricula;
		matricula=Libreria.t_pedirCadena(0, "matricula que quieres eliminar");
		while(it.hasNext()){
			if (it.next().getMatricula().equals(matricula)){
				it.remove();				
			}
		}//while

	}//quitarSet


	public static void escribirFichero(Object Vehiculo,String archivo){
		ObjectOutputStream fich = null;
		try {            
			fich = new ObjectOutputStream(new FileOutputStream(archivo+".txt"));                

			System.out.println("Guardamos la informacion en el fichero "+"\""+archivo+".txt");
			fich.writeObject(Vehiculo);                                
			fich.close();			
		} catch (IOException ex) {
			System.out.println("Error E/S: " + ex.getMessage());
		} finally {
			try {
				if (fich != null) {
					fich.close();
					
				}
			} catch (IOException ex) {
				System.out.println("Error al cerrar fichero: " + ex.getMessage());
			}
		}
		
	}//escribirFichero

	
	
	
}//class
