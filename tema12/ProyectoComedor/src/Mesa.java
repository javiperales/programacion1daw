
public class Mesa {

	private Integer numMesa;
	private Menu[] menues = new Menu[2];
	
	public Mesa(Integer numMesa, Menu[] menues) {
		this.numMesa = numMesa;
		this.menues = menues;
	}//constructor
	public Integer getNumMesa() {
		return numMesa;
	}
	public void setNumMesa(Integer numMesa) {
		this.numMesa = numMesa;
	}
	public Menu[] getMenu() {
		return menues;
	}
	public void setMenu(Menu[] menues) {
		this.menues = menues;
	}
	
	
}
