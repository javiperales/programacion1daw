
public class carta {
	private String nombre;
	private platos plato[] = new platos[6];
	
	public carta(){
		nombre="Restaurante GOKU";
	}//constructor
	
	
	//pasamos un objeto al metodo para copiar el contenido de un plato a otro
	public void meterPlatos(platos[] platos2){
		for(int i=0;i<plato.length;i++){
			plato[i]=platos2[i];						
		}//for

	}//meterplatos
	
	public void visualizar(){
		for(int i=0; i<plato.length; i++){
			Libreria.mostrarEnPantalla("plato "+i+plato[i].toString());
		}//for
	}
					
	
	public String visualizar2(){
		return "\t" + getNombre() + "\n" +
				"Plato 1: " + plato[0].toString()+
				"\n\nPlato 2: " + plato[1].toString()+
				"\n\nPlato 3: " + plato[2].toString()+
				"\n\nPlato 4: " + plato[3].toString()+
				"\n\nPlato 5: " + plato[4].toString()+
				"\n\nPlato 6: " + plato[5].toString();
		
	}

	private String getNombre() {
		
		return nombre;
	}

}
