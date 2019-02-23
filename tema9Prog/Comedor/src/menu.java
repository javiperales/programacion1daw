
public class menu {
	private platos primerPlato;
	private platos segundoPlato;
	private Float precioTotal;
	public menu(platos primerPlato, platos segundoPlato) {
		super();
		this.primerPlato = primerPlato;
		this.segundoPlato = segundoPlato;
		this.precioTotal = precioTotal;
	}//constructor
	
	//calculoPrecio el preciototal es un random del precio del primer plato mas el precio del segundo plato
	public void  calculoPrecio(){
		precioTotal=(float)(Math.round(primerPlato.getPrecio()+ segundoPlato.getPrecio()*100d)/100d);
	}//calculoprecio
	
	
	public platos getPrimerPlato() {
		return primerPlato;
	}
	public void setPrimerPlato(platos primerPlato) {
		this.primerPlato = primerPlato;
	}
	public platos getSegundoPlato() {
		return segundoPlato;
	}
	public void setSegundoPlato(platos segundoPlato) {
		this.segundoPlato = segundoPlato;
	}
	public Float getPrecio() {
		return precioTotal;
	}
	public void setPrecio(Float precio) {
		this.precioTotal = precioTotal;
	}
	
	public String visualizaMenu(){
		
		return "primer plato" +primerPlato.toString() + "segundo plato " + segundoPlato.toString() + "precio" + precioTotal +"€";
		
	}
	
	
	
	
	
	
	
	
}
