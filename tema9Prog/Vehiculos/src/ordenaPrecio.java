import java.util.Comparator;
public class ordenaPrecio  implements Comparator<vehiculo>{
	public int compare(vehiculo v1, vehiculo v2){
		return v1.getPrecio().intValue()-(v2.getPrecio().intValue());
	}

}
