import java.util.Random;

public class Plato {
	private String ingrediente[]={"Cebolla","Pimiento","Salsa barbacoa","Mahonesa","Tomate","Chorizo","Limón","Zanahoria","Bonito","Queso rayado","Mantequilla","Bacon","Jamon cocido","Leche","Nata","Ajo","Anchoa","Setas","Vino blanco","Espinaca"};
	private String nombre;
	private Ingredientes ingredientes[];
	private int precio;
	private int norep[];

	
	Plato(String nombre,int nIngredientes){
		Random azar=new Random();
		ingredientes=new Ingredientes[nIngredientes];
		norep=new int[nIngredientes];
		this.nombre=nombre;
		this.precio=azar.nextInt(6)+4;
		int aleatorio;
		for(int k=0;k<nIngredientes;k++){
			do{
				aleatorio=azar.nextInt(20);
			}while(!siExiste(aleatorio));
			ingredientes[k]=new Ingredientes(ingrediente[aleatorio]);
			norep[k]=aleatorio;
		}	
	}

	public boolean siExiste(int num){
		boolean resultado=true;
		for(int i=0;i<norep.length;i++){
			if(norep[i]==num){
				resultado=false; // existe y retornamos false
			}
		}
		return resultado;
	}

	public void muestraPlato(int i){
		System.out.println();
		System.out.println((i+1)+" - "+nombre);
		System.out.print("   Ingredientes: ");
		this.muestraIngredientes();
	}
	
	public void muestraIngredientes(){

		for(int k=0;k<ingredientes.length;k++){
			System.out.print(ingredientes[k].getNombre()+",");
		}
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ingredientes[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingredientes[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
