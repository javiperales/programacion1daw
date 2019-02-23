import java.util.*;

public class Platos {

	private String nombre;
	private String ingrediente[];
	private double precio;
	
	Platos(String nombre, int cuantos){    //constructor con dos parametros que genera platos con la cantidad de ingredientes que queramos seleccionados aleatoriamente 
		this.nombre=nombre;
		
		this.ingrediente= new String[cuantos];
		String alimentos[]={"patatas","huevos","pollo","lechuga","cerdo","tomate","arroz","queso"};
		Random azar=new Random();
		double p=0;
		for (int i =0;i<cuantos;i++){
			int a=azar.nextInt(7-0+1)+0;
			ingrediente[i]= alimentos[a];
		}
		p=azar.nextDouble()*60;
		this.precio=(Math.round(p* 100.0)/100.0);
		
		
	}
	
	public void getIngrediente() {          
		
		int k;
		for(k=0;k<ingrediente.length;k++){
			System.out.print(ingrediente[k]+",");
		}
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
