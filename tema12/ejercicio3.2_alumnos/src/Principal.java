import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		//////////////principal////////////////////////////////////////////
		String nombre[]={"javi","antonio","pilar","laura","jose","carlos","lidia","yaiza","rosa","raul"};
		String apellido[]={"perales","martinez","marco","robles","peña","vidal","gerico","sanchez","capape","lolo"};
		Random alea= new Random();
		ArrayList<Alumnos>alumnos= new ArrayList<Alumnos>();
		TreeMap<Integer, ArrayList<Alumnos>> evaluacion1= new TreeMap<Integer, ArrayList<Alumnos>>();
		TreeMap<Integer, ArrayList<Alumnos>> evaluacion2= new TreeMap<Integer, ArrayList<Alumnos>>();
		TreeMap<Integer, ArrayList<Alumnos>> evaluacion3= new TreeMap<Integer, ArrayList<Alumnos>>();
		Alumnos alu=null;
		for(int i=1; i<=50;i++){	
			alu= new Alumnos(nombre[alea.nextInt(nombre.length)],apellido[alea.nextInt(apellido.length)],alea.nextInt(101),alea.nextInt(101),alea.nextInt(101));
			alumnos.add(alu);
			
		}//creacion de 50 alumnos y los meto en el arrayList
		
		
		for(Alumnos aluy:alumnos){
			if(evaluacion1.containsKey(aluy.getNota1())){
			///	evaluacion1.get(aluy.getNota1()).add(aluy);
				ArrayList<Alumnos>temp=evaluacion1.get(aluy.getNota1());
				temp.add(aluy);
			}else{//si la nota no existe , lo metemos en un arraList nuevo que creo
				ArrayList<Alumnos>temp= new ArrayList<Alumnos>();
				temp.add(aluy);
				evaluacion1.put(aluy.getNota1(), temp);
			}//else
			
			
		}//foreach
		
		
		for(Alumnos aluy:alumnos){
			if(alumnos.contains(aluy.getNota2())){
				ArrayList<Alumnos> temp=evaluacion2.get(aluy.getNota2());
				temp.add(aluy);				
			}else{
				ArrayList<Alumnos>temp = new ArrayList<Alumnos>();
				temp.add(aluy);
				evaluacion2.put(aluy.getNota2(), temp);
			}//else
			
			
		}//for
		
		for(Alumnos aluy:alumnos){
			if(alumnos.contains(aluy.getNota3())){
				ArrayList<Alumnos> temp=evaluacion3.get(aluy.getNota3());
				temp.add(aluy);
				evaluacion3.put(aluy.getNota3(), temp);
			}
		}
		
		for(Integer clave:evaluacion1.keySet()){
			
			
			System.out.println("---------------------");
			System.out.println("1ºevaluacion");
			System.out.println("alumnos con nota "+clave);
			for(Alumnos nombresAlu: evaluacion1.get(clave)){
				System.out.println(nombresAlu.getNombre()+" "+nombresAlu.getApellido());
				
			}
		}
		
		for(Integer clave:evaluacion2.keySet()){
			System.out.println("---------------------");
			System.out.println("alumnos con nota "+clave);
			for(Alumnos nombresAlu: evaluacion2.get(clave)){
				System.out.println(nombresAlu.getNombre()+" "+nombresAlu.getApellido());
			}
		}
		for(Integer clave:evaluacion3.keySet()){
			System.out.println("---------------------");
			System.out.println("alumnos con nota "+clave);
			for(Alumnos nombresAlu: evaluacion3.get(clave)){
				System.out.println(nombresAlu.getNombre()+" "+nombresAlu.getApellido());
			}
		}

	}//main

}//class
