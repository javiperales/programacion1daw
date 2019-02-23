import java.util.Random;

public class Carta {
	private Plato plato[] = new Plato[6];
	private int norep[]=new int[6];

	Carta(Plato platos[]){
		Random azar = new Random();
		int aleatorio;
		for(int k=0;k<plato.length;k++){
			do{
				aleatorio=azar.nextInt(10);
			}while(!siExiste(aleatorio));
			this.plato[k]=platos[aleatorio];
			norep[k]=aleatorio;
		}
	}

	public boolean siExiste(int num){
		boolean resultado=true;
		for(int i=0;i<norep.length;i++){
			if(norep[i]==num){
				resultado=false; // existe y retornamos false
			}
		}
		return resultado;
	}

	public void verCarta(){
		for(int k=0;k<plato.length;k++){
			plato[k].muestraPlato(k);
		}
	}
	
	public void verPrimeros(){
		for(int k=0;k<3;k++){
			plato[k].muestraPlato(k);
		}
	}
	
	public void verSegundos(){
		for(int k=3;k<6;k++){
			plato[k].muestraPlato(k);
		}
	}

	public Plato[] getPlato() {
		return plato;
	}
	
	public Plato getPlatoIndex(int i) {
		return plato[i];
	}

	public void setPlato(Plato[] plato) {
		this.plato = plato;
	}

}