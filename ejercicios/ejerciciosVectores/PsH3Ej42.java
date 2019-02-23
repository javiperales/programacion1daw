/*42.-Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus tres
representantes a lo largo de doce meses de sus cuatro productos, VENTAS [representante,
mes, producto]. Queremos proyectar el array tridimensional sobre uno de dos dimensiones que
represente el total de ventas, TOTAL [mes, producto], para lo cual sumamos las ventas de
cada producto de cada mes de todos los representantes. Imprimir ambos arrays*/

public class PsH3Ej42 {

	public static void main(String[] args) {
		int tablaVentas[][][] = new int[3][12][4];
		int totalPorMes[][] = new int[12][4];
		int rep, mes, prod, num, totalProd;
		
		for(rep = 0; rep < 3; rep++){
			System.out.printf("\n\nRepresentante: %d\n", (rep+1));
			System.out.print("Producto ");
			for(prod = 0; prod < 4; prod++){			
				System.out.printf("%5d", prod+1);
			}
			System.out.println("\n------------------------------");
			for(mes = 0; mes < 12; mes++){
				System.out.printf("\n  Mes %2d: ", mes+1 );
				for(prod = 0; prod < 4; prod++){
					//generamos valores de ventas entre 10 y 20 euros
					num = (int)(Math.random() * 11 + 10);
					tablaVentas[rep][mes][prod] = num;
					System.out.printf("%5d", tablaVentas[rep][mes][prod]);
				}//prod
			}//mes
		}//rep
		
		//llenamos la tabla totalPorMes
		
		for(mes = 0; mes < 12; mes++){ //para un mes fijo
			for(prod = 0; prod < 4; prod++){//para un determinado producto
				totalProd = 0; // calculamos el total vendido de ese producto
								// entre todos los representantes
				for(rep = 0; rep < 3; rep++){
					totalProd = totalProd + tablaVentas[rep][mes][prod];
				}//rep
				totalPorMes[mes][prod] = totalProd;
			}//prod
		}//mes
		
		System.out.println("\n\nTotal de ventas por mes");
		System.out.print("Producto ");
		for(prod = 0; prod < 4; prod++){			
			System.out.printf("%5d", prod+1);
		}
		System.out.println("\n------------------------------");
		for(mes = 0; mes < 12; mes++){ //para un mes fijo
			System.out.printf("\n  Mes %2d: ", mes+1 );
			for(prod = 0; prod < 4; prod++){//para un determinado producto			
					System.out.printf("%5d", totalPorMes[mes][prod]);
			}//prod
		}//mes
		
	}//main

}//class
