
public class ListaDePaises {
	private String[] nombres;
	private Integer cont;

	public ListaDePaises(Integer numMaxPaises){
		nombres = new String[numMaxPaises]; //creamos un objeto de tipo String como maximo tenra numMaxPaises
		cont=0;

	}//constructor

	public Boolean estaLLena(){
		if(cont==nombres.length){
			return true;//devuelve que esta lleno
		}else{
			return false; //sino devuelve que esta vacio
		}//else

	}//metodo estaLLena

	public Boolean anyadir(String nombre){
		Boolean correcto=false;
		if(!estaLLena()){//si es distinto de estallena podemos añadir
			if(buscarPais(nombre)==-1){//no existe el pais
				nombres[cont]=nombre;
				cont++;
				correcto=true;
			}

		}//if
		return correcto;
	}

	public Boolean borrar(String nombre){
		Boolean correcto=false;
		Integer posicionABorrar;
		posicionABorrar=buscarPais(nombre);
		if(posicionABorrar !=-1){ //existe
			for(int i=posicionABorrar; i<cont-1;i++){
				nombres[i]=nombres[i+1];
			}//for
			cont--;
			correcto= true;

		}//if
		return correcto;

	}//metodo borrar
	
	public Integer buscarPais(String nombre){
		Integer indicePais;
		Boolean encontrado = false;
		for(indicePais=0;indicePais<cont && !encontrado; indicePais++){
			if(nombres[indicePais].equals(nombre)){
				encontrado = true;
			}
		}
		if(!encontrado){
			indicePais=-1;
		}else{
			indicePais--;
			
		}
		return indicePais;
	}//buscarPais
	
	public void vaciarLista(){
		cont = 0;
	}
	
	public Integer numElementos(){
		return cont;
	}
	
	public Integer maxElementos(){
		return nombres.length;
	}
	
	public String mostrar(int posicion){
		String nombreQueBusco="";
		if(posicion < cont){
			nombreQueBusco=nombres[posicion];
		}
		return nombreQueBusco;
		
	}
	
}// ListaDePaises




















