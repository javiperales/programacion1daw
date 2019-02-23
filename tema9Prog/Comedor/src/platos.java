import java.util.Arrays;

public class platos {
	private Ingredientes[] ingredientes;
	private Float precio;
	private Integer conta=0;
	private Float cantidades[];
	
	public platos(){
		ingredientes = new Ingredientes[5];
		cantidades = new Float[5];
		precio=0f;
	}
	
	
	

	public Ingredientes[] getIngrediente() {
		return ingredientes;
	}

	public void setIngrediente(Ingredientes[] ingrediente) {
		this.ingredientes = ingrediente;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Float[] getCantidades() {
		return cantidades;
	}

	public void setCantidades(Float[] cantidades) {
		this.cantidades = cantidades;
	}

	@Override
	public String toString() {
		return "platos [ingrediente=" + Arrays.toString(ingredientes) + ", precio=" + precio + ", conta=" + conta
				+ ", cantidades=" + Arrays.toString(cantidades) + "]";
	}
	
	//metodo boolean con dos parametros de ingrdientes y cantidad si conta es igual a la longitud del vector devuelve falso
	//si no es por que no estalleno y podemos añadir ingredients y cantidad 
	//y devuelve verdadero
	public Boolean añadirIng(Ingredientes ingrediente, Float cantidad){
		if(conta==ingredientes.length){
			return false;			
		}else{
			ingredientes[conta]=ingrediente;
			cantidades[conta]=cantidad;
			conta++;
			return true;
		}
		
	}//añadir ingrediente
	
	public void calcularPvp(){
		for(int i=0; i<cantidades.length; i++){
			precio= precio +(ingredientes[i].getPrecioGramo()*cantidades[i]);
			//el precio sera ingredientes por gramo * cantidad
		}//for		
		precio  = (float) (Math.round(precio * 100d) / 100d);
	}//calculoPvp
		
		
}//class
