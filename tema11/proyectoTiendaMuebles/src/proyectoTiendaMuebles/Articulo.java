package proyectoTiendaMuebles;

public class Articulo {
	private String descripcion;
	private static Integer siguiente=0;
	private Integer codigo;
	private Integer stocMin;
	private Integer stock;
	private Double pvp;
	private Integer acumuladoVentas;
	
	
	public Articulo(String descripcion, Integer stocMin, Integer stock,Double pvp) {
		siguiente++;
		codigo=siguiente;
		this.descripcion = descripcion;
		this.stocMin = stocMin;
		this.stock = stock;
		this.pvp = pvp;
		acumuladoVentas=0;
	}//constructor
	
	public Integer vender(Integer unidades){
		Integer unidadesVendidas;
		if(stock >= unidades){//si el stock es mayor a las unidades que quiero
			stock=stock-unidades;
			unidadesVendidas=unidades;
			
		}else{//si me piden mas unidades de las que tengo
			unidadesVendidas=stock;
			stock=0;	
			
		}
		acumuladoVentas=(int) (acumuladoVentas+(pvp*acumuladoVentas));
		return unidadesVendidas;
	}//vender
	

	
/*	public void comprar(Integer unidades){
		if(stockMax<unidades){
			stock=stock+unidades;
			
		}else{
			System.out.println("el almacen esta lleno, no puede entrar mas mercancia");
		}
		
	}*/
	
	/* public void visualizarStockmin(Articulo articulo[]){
	for(int i=0;i<articulo.length; i++ ){
		System.out.println(articulo[i].getStocMin());
	}
	
}*/
	public String visualizar() {
	return "Articulo [descripcion=" + descripcion + ", codigo=" + codigo + ", stocMin=" + stocMin + ", stock="
			+ stock + ", pvp=" + pvp + ", acumuladoVentas=" + acumuladoVentas + "]";
}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static Integer getSiguiente() {
		return siguiente;
	}
	public static void setSiguiente(Integer siguiente) {
		Articulo.siguiente = siguiente;
	}
	public Integer getStocMin() {
		return stocMin;
	}
	public void setStocMin(Integer stocMin) {
		this.stocMin = stocMin;
	}
	public Double getPvp() {
		return pvp;
	}
	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public Integer getStock() {
		return stock;
	}
	public Integer getAcumuladoVentas() {
		return acumuladoVentas;
	}
	
	
	
	
	

	
}//claass
