
public class paises {
	private String [] nombres;
	private Integer numMaxPaises;
	private Integer contador;

	public paises(Integer numMaxPaises){
		nombres= new String[numMaxPaises];
		contador = 0;
	}

	public Boolean estaLlena(){
		if(contador==nombres.length){
			return true;
		}else{
			return false;
		}
	}//estallena


	public Boolean añadir(String nombre){
		Boolean correcto = false;
		if(!estaLlena()){
			if(buscarPais(nombre)==-1){
				nombres[contador] = nombre;
				contador++;
				correcto=true;
			}
		}
			return correcto;
	}
	
	public void vaciarLista(){
		contador =0;
	}//vaciarlista
	
	public String mostrar(int posicion){
		String nombreBuscar = null;
		Integer indicepais;
		if(posicion < contador){
			nombreBuscar= nombres[posicion];
		}
		
		return nombreBuscar;	
	}//mostrar
	
	public Integer numeroDeElementos(){
		
		
		return contador;
	}
	

}//class
