/*33.-Crear un array unidimensional de 20 elementos con nombres de personas. Visualizar los
elementos de la lista debiendo ir cada uno en una fila distinta.*/
public class PsH3Ej33 {

	public static void main(String[] args) {
		String vecMuchosNombres[] = {"Ana", "Jose", "Rafa", "Luis", "Adela", "Raul", "German",
				"Eric", "Agustin", "Antonio", "Carla", "Jaime", "Diego", "Jesus", "Abel", "David",
				"Pilar", "Carmen", "Teresa", "Lolo", "Perico"};
		String arrayNombres[] = new String[20];
		
		int indice, indiceAzar;
		indice = 0;
		for( ; indice < 20; indice++){
			indiceAzar = (int)Math.floor(Math.random()*21);
			arrayNombres[indice]  = vecMuchosNombres[indiceAzar];
		}
		
		for( indice = 0; indice < 20; indice++){
			System.out.println(arrayNombres[indice]);
		}

	}//main

}//class
