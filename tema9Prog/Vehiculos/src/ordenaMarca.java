import java.util.Comparator;
public class ordenaMarca implements Comparator<vehiculo>{
	public int  compare(vehiculo v1 , vehiculo v2) {
		return v1.getMarca().compareTo(v2.getMarca());
	}
	
	
	
	
}//class
