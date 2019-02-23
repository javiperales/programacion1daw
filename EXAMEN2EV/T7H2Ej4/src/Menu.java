
public class Menu {
	private Plato plato1;
	private Plato plato2;
	private static int servidos=0;
	private static int max_servidos=100;
	
	Menu(Plato p1, Plato p2){
		if(servidos<max_servidos){
			plato1=p1;
			plato2=p2;
			servidos++;
		}
	}

		public void verPlatos(int k){
			System.out.println("Menu "+(k+1));
			System.out.println("  "+plato1.getNombre()+" - "+plato1.getPrecio()+"€");
			System.out.println("  "+plato2.getNombre()+" - "+plato2.getPrecio()+"€");
		}
	
		public int verPrecio(){
			int precio=0;
			precio+=plato1.getPrecio();
			precio+=plato2.getPrecio();
			return precio;
		}

		public Plato getPlato1() {
			return plato1;
		}

		public void setPlato1(Plato plato1) {
			this.plato1 = plato1;
		}

		public Plato getPlato2() {
			return plato2;
		}

		public void setPlato2(Plato plato2) {
			this.plato2 = plato2;
		}

		public static int getServidos() {
			return servidos;
		}

		public static void setServidos(int servidos) {
			Menu.servidos = servidos;
		}

		public static int getMax_servidos() {
			return max_servidos;
		}

		public static void setMax_servidos(int max_servidos) {
			Menu.max_servidos = max_servidos;
		}
		
}
