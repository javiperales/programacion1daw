
public class mesa {
	private Integer numMesa;
	private menu menus[];
	private Float precioTotal=0f;
	
	public mesa( menu[] menus) {
		super();		
		this.menus = menus;
		
		calculoPrecio();
	}//constructor

	private void calculoPrecio(){
		for(int i=0; i<menus.length;i++){
			precioTotal=precioTotal+menus[i].getPrecio();
		}//for
	}
	
	
	public Integer getNumMesa() {
		return numMesa;
	}

	public void setNumMesa(Integer numMesa) {
		this.numMesa = numMesa;
	}

	public menu[] getMenus() {
		return menus;
	}

	public void setMenus(menu[] menus) {
		this.menus = menus;
	}

	public Float getPrecio() {
		return precioTotal;
	}

	public void setPrecioMesa(Float precioMesa) {
		this.precioTotal = precioTotal;
	}
	
	
	public void visualizarMesa(){
		for(int i=0; i<menus.length;i++){
			Libreria.mostrarEnPantalla("menu de la persona "+(i+1));
			Libreria.mostrarEnPantalla(menus[i].visualizaMenu());
		}
	}
	
	
	
}
