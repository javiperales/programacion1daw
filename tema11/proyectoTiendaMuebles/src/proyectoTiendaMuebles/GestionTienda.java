package proyectoTiendaMuebles;

public class GestionTienda {

	public static void main(String[] args) {
		///////////PRINCIPAL/////////////////////////////////////////////////////////////
		Tienda tienda;
		Articulo articulo[]= new Articulo[5];
		Integer ventaAcumulada=0;


	}//main


	public static Integer menu(){
		Integer opcion;

		opcion=Libreria.t_pedirEnteroValidar(0, "elija opcion");

		return opcion;
	}

	public static void crearArticulo(Articulo[] articulo){

		for (int i=0; i<articulo.length; i++){
			//String descripcion, Integer stocMin, Integer stock,Double pvp
			articulo[i]= new Articulo(Libreria.a_MuebleAzar(),Libreria.a_enteroAzar(0, 150),Libreria.a_enteroAzar(0, 1500),Libreria.a_decimalAzar(0,150));


		}

	}

	public static void ventaCliente(Articulo[] articulo){



	}

	public static void listarAcumuladoVentas(Articulo [] articulo){
		int i;
		Integer  totaltienda=0;
		for(i=0; i<articulo.length;i++){
			System.out.println("articulo: "+articulo[i].getDescripcion()+" -->" + articulo[i].getAcumuladoVentas());
			totaltienda=totaltienda+articulo[i].getAcumuladoVentas();

		}
		System.out.println("total de ventas acumuladas en la tienda: " +totaltienda);
	}//listarAcumuladoVentas
	
	public static void listarArticulos(Articulo[] articulo){
		for(int i=0; i<articulo.length; i++){
			articulo[i].visualizar();
		}
		
	}



}//class