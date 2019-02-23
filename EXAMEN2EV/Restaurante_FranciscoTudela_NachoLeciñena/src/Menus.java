
public class Menus {

	private Platos plato[]=new Platos[2];     
	private String bebida;
	private String postre;
	private double precio;
	
	Menus(Platos pla1,Platos pla2,String bebida,String postre){  //constructor en el que se asignan 2 platos una bebida y un postre y se calcula el precio de los platos
		this.plato[0]=pla1;
		this.plato[1]=pla2;
		this.bebida=bebida;
		this.postre=postre;
		this.precio=pla1.getPrecio()+pla2.getPrecio();
	}

	public double getPrecio() {
		return precio;
	}
	public void getMenu() {   //metodo para poder visualizar los platos del menu y sus precios
		
		int k;
		for(k=0;k<plato.length;k++){
			System.out.println("El menu tiene el plato: "+plato[k].getNombre()+" con el precio: "+plato[k].getPrecio()+" €");
			
		}
		System.out.println("Con el total de: "+getPrecio()+" €");
	}
	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}
	
	
}
