import java.util.Arrays;

public class pila {
	private Integer  [] pila;
	private Integer cima;
	
	
	
	public pila() {
		
		pila = new Integer [500];
		cima = 0;
		
	}
	
	public Boolean estaLlena(){
		
		if(cima==500){
			return true;
		}else{
			return false;
		}	
	}//estaLlena
	
	public Boolean estaVacia(){
		if(cima==0){
			return true;
		}else{
			return false;
		}
		
	}

	public void add(Integer numero){ //se le pasa por parametro el numero que queremos apilar 
		if (!estaLlena()){
		pila[cima]=numero;
		cima++;
		}
		
		
	}//apilar

	public Integer Pop(){ //se si aplica a un objeto de la clase pila no hay que pasarle parametro
		
		cima--;
		return pila[cima];
		
	}//desapilar
	
	public  void copiar(pila destino){
		//Arrays.copyOf(pila,destino);
		destino.pila = Arrays.copyOf(this.pila, this.pila.length);//copiar un vector en otro
		destino.cima=this.cima;
	}//copiar
	
	public void borrar(){
		cima=0;
	}//borrar
	
	public void invertir(){
		Integer aux[] = new Integer[500];// nuevo vector
		int indAux,i;
		for( i =cima-1,indAux=0; i>=0; i--, indAux++){
			aux[indAux]= pila[i];
		}//for
		
		pila=aux;//la primera variable apuntara a la segunda variable
		
	}
	public void invertirPocoElegante(){
		Integer indizq=0, indder=cima-1, aux;
		
		while(indder>=0){
			aux=pila[indizq];
			pila[indder]=pila[indizq];
			pila[indizq]=aux;
			indizq++;
			indder--;
		}
			
		
	}//invertirpocoelegante

	public Integer[] getPila() {
		return pila;
	}

	public void setPila(Integer[] pila) {
		this.pila = pila;
	}

	public Integer getCima() {
		return cima;
	}

	public void setCima(Integer cima) {
		this.cima = cima;
	}
	
	
	
	
	
	
}//pila
