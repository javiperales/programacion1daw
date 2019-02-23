
public class ListaDePaises {
	private String[] nombres;
	private Integer contador; // numero de paises en la lista

	public ListaDePaises(Integer numMaxPaises) {
		nombres = new String[numMaxPaises];
		contador = 0;
	}

	public Boolean estaLlena(){
		if (contador == nombres.length){
			return true;
		}else{
			return false;
		}
	}
	
	public Boolean anyadir(String nombre) {
		Boolean correcto = false;
		if(!estaLlena()){//podemos añadir
			if (buscarPais(nombre) == -1) {// no existe
				nombres[contador] = nombre;
				contador++;
				correcto = true;
			}
		}
		return correcto;
	}

	public Boolean borrar(String nombre) {
		Boolean correcto = false;
		Integer posicionABorrar;
		posicionABorrar = buscarPais(nombre);
		if (posicionABorrar != -1) {// existe
			for(int i = posicionABorrar ; i < contador-1; i++){
				nombres[i] = nombres[i+1];
			}
			contador--;
			correcto = true;
		}

		return correcto;
	}

	public Integer buscarPais(String nombre) {
		Integer indicePais;
		Boolean encontrado = false;
		for (indicePais = 0; indicePais < contador && !encontrado; indicePais++) {
			if (nombres[indicePais].equals(nombre)) {
				encontrado = true;
			}
		}
		if (!encontrado) {
			indicePais = -1;
		}else{
			indicePais--;
		}
		return indicePais;
	}
	
	public void vaciarLista(){
		contador = 0;
	}
	
	public String mostrar(int posicion){
		String nombreQueBusco=null;
		if(posicion < contador){
			nombreQueBusco = nombres[posicion];
		}
		return nombreQueBusco;
	}
	
	public Integer numElementos(){
		return contador;
	}
}// ListaDePaises




















