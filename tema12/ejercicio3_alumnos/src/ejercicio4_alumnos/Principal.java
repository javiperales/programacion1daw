package ejercicio4_alumnos;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		/////////////PRINCIPAL///////////////////////////
		String nombre[]={"javi","antonio","pilar","laura","jose","carlos","lidia","yaiza","rosa","raul"};
		String apellido[]={"perales","martinez","marco","robles","peña","vidal","gerico","sanchez","capape","lolo"};
		Random alea= new Random();
		ArrayList<Alumnos> alumnos= new ArrayList<Alumnos>();
		TreeMap<Integer, ArrayList<Alumnos>> mapa1= new TreeMap<Integer, ArrayList<Alumnos>>();
		TreeMap<Integer, ArrayList<Alumnos>> mapa2= new TreeMap<Integer, ArrayList<Alumnos>>();
		TreeMap<Integer, ArrayList<Alumnos>> mapa3= new TreeMap<Integer, ArrayList<Alumnos>>();
		Object mapas[]={mapa1, mapa2, mapa3};
		
		for(int i=0;i<50;i++){
			alumnos.add(new Alumnos(nombre[alea.nextInt(nombre.length)],apellido[alea.nextInt(apellido.length)], alea.nextInt(101), alea.nextInt(101), alea.nextInt(101)));
		}
		
		
		for(int i=0;i<3;i++){////////////RECORREMOS LAS 3 EVALUACIONES Y METEMOS LOS DATOS
			TreeMap<Integer, ArrayList<Alumnos>> evaluacion=(TreeMap<Integer, ArrayList<Alumnos>>)mapas[i];
			for(Alumnos alu:alumnos){
				if(evaluacion.containsKey(alu.getNotas()[i])){////COMPRUEBO SI EL VALOR EXISTE YA QUE SI NO SE HA CREADO NOS DARA ERROR
					evaluacion.get(alu.getNotas()[i]).add(alu);
				}else{////EN CASO DE QUE NO EXISTA CREAMOS EL ARRAYLIST Y SE LO METEMOS CON LA CLAVE
					ArrayList<Alumnos> temp=new ArrayList<Alumnos>();
					temp.add(alu);
					evaluacion.put(alu.getNotas()[i], temp);
				}
			}
			
			}//FOR
		
		for(int i=0;i<3;i++){////////////RECORREMOS LAS 3 EVALUACIONES Y METEMOS LOS DATOS
			TreeMap<Integer, ArrayList<Alumnos>> evaluacion=(TreeMap<Integer, ArrayList<Alumnos>>)mapas[i];
			System.out.println("-------------------------------------------------");
		System.out.println((i+1)+"º evaluacion");
			for(Integer clave:evaluacion.keySet()){
				System.out.println("alumnos con nota "+clave);
				
				for(Alumnos alu: evaluacion.get(clave)){
						System.out.println(alu.getNombre()+" "+alu.getApellido());
					}
				
			}
		}
	/*	int notas, nota1,nota2,nota3;
		Alumnos alu=null;
		ArrayList<Alumnos> Alumnos= new ArrayList<Alumnos>();
		TreeMap<Integer,ArrayList<Alumnos>>evaluacion1 = new  TreeMap<Integer,ArrayList<Alumnos>>();
		TreeMap<Integer,ArrayList<Alumnos>>evaluacion2 = new  TreeMap<Integer,ArrayList<Alumnos>>();
		TreeMap<Integer,ArrayList<Alumnos>>evaluacion3 = new  TreeMap<Integer,ArrayList<Alumnos>>();
		for(int i=1; i<=50;i++){
			notas=alea.nextInt(101);
			String nombreAlea=nombre[alea.nextInt(nombre.length)];
			String apellidoAlea=nombre[alea.nextInt(apellido.length)];		
			alu=new Alumnos(nombreAlea,apellidoAlea,notas,notas,notas);
			Alumnos.add(alu);	
			
		}//for
		
		for(Integer nota:evaluacion1.keySet()){
			notas=alea.nextInt();
			
		}//for
*/
	}//main

}//class
