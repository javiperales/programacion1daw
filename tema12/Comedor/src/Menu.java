import java.util.Arrays;
//Cada menú consta de dos platos
public class Menu {
	
	private Plato[] platos;

	public Menu() {
		
		platos = new Plato[2];
		
	}//constructor

	public Plato[] getPlatos() {
		return platos;
	}

	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}

	@Override
	public String toString() {
		return "Menu [platos=" + Arrays.toString(platos) + "]";
	}
	
	
	
	
	
}
