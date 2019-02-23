
public class Mesa {
	private Menu menu[];
	private static int mesas_ocupadas=0;
	private int n_mesa=0;
	private int n_menus;

	Mesa(int n_menus){

		menu=new Menu[n_menus];
		this.n_mesa=mesas_ocupadas+1;
		Mesa.mesas_ocupadas++;
	}

	public int pagar(int entregado){
		int total=0,vueltas=0;
		for(int k=0;k<menu.length;k++){
			total+=menu[k].verPrecio();
		}
		if(entregado>total){vueltas=entregado-total;}
		else{System.out.println("Dinero insuficiente");}
		return vueltas;
	}

	public void verMenus(){
		for(int k=0;k<menu.length;k++){
			menu[k].verPlatos(k);
		}
	}

	public void verCuenta(){
		System.out.println();
		System.out.println("Cuenta de la mesa "+n_mesa);
		this.verMenus();
		int total=0;
		for(int k=0;k<menu.length;k++){
			total+=menu[k].verPrecio();
		}
		System.out.println("TOTAL: "+total+"€");
	}
	
	public void insertaMenu(int k,Plato p1, Plato p2){
		menu[k]=new Menu(p1,p2);
	}
	
	public Menu[] getMenus() {
		return menu;
	}

	public void setMenus(Menu[] menus) {
		this.menu = menus;
	}

	public static int getMesas_ocupadas() {
		return mesas_ocupadas;
	}

	public static void setMesas_ocupadas(int mesas_ocupadas) {
		Mesa.mesas_ocupadas = mesas_ocupadas;
	}

	public int getN_mesa() {
		return n_mesa;
	}

	public void setN_mesa(int n_mesa) {
		this.n_mesa = n_mesa;
	}

	public int getN_menus() {
		return n_menus;
	}

	public void setN_menus(int n_menus) {
		this.n_menus = n_menus;
	}

	
	
	
	
	
	
}
