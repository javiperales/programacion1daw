import java.util.Arrays;

public class Mesa {

	private Integer numMesa;
	private Menu[] menues;
	
	public Mesa(Integer numMesa ) {
		this.numMesa = numMesa;
		menues = new Menu[6];
		
	}//constructor
	public Integer getNumMesa() {
		return numMesa;
	}
	public void setNumMesa(Integer numMesa) {
		this.numMesa = numMesa;
	}
	public Menu[] getMenues() {
		return menues;
	}
	public void setMenues(Menu[] menues) {
		this.menues = menues;
	}
	@Override
	public String toString() {
		return "Mesa [numMesa=" + numMesa + ", menues=" + Arrays.toString(menues) + "]";
	}
	
	
}
