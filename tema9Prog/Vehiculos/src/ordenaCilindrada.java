import java.util.Comparator;
public class ordenaCilindrada implements Comparator<vehiculo> {
	public int compare(vehiculo v1 , vehiculo v2){
		return v1.getCilindrada().intValue() - (v2.getCilindrada().intValue());
	}
	

}
