import java.util.Comparator;
public class ordenaModelo  implements Comparator<vehiculo>{
	public int compare(vehiculo v1 , vehiculo v2){
		return v1.getModelo().compareTo(v2.getModelo());
	}

}
