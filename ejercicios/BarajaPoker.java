
public class BarajaPoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []baraja={"2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥",
				 "2♦", "3♦", "4♦","5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♦",
				 "2♣", "3♣", "4♣","5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣",
				 "2♠", "3♠", "4♠","5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"};
		String cartaAux;
		
		int indice, contador, indice1, indice2;
		
		for(indice= 0; indice<52; indice++){
			if(indice % 13 == 0){
				System.out.println();
			}
			if(baraja[indice].substring(0,1).equals("1")){
				System.out.printf("%4s", baraja[indice]);
			}else{
				System.out.printf("%3s", baraja[indice]);
			}
		}
		
		//barajamos
		//cambiamos parejas de cartas al azar 50 veces
		for(contador = 1; contador <= 50; contador++){
			indice1 = (int)Math.floor(Math.random()*52); // numero al azar entre 0 y 51
			indice2 = (int)Math.floor(Math.random()*52);  // numero al azar entre 0 y 51
			cartaAux = baraja[indice1];
			baraja[indice1] = baraja[indice2];
			baraja[indice2] = cartaAux;
			System.out.println("\nCambiamos las posiciones de las cartas con indices " + indice1 + " y " + indice2);
			for(indice= 0; indice<52; indice++){
				if(indice % 13 == 0){
					System.out.println();
				}
				if(baraja[indice].substring(0,1).equals("1")){
					System.out.printf("%4s", baraja[indice]);
				}else{
					System.out.printf("%3s", baraja[indice]);
				}
			}//indice
		}//contador
		
		
	}//main

}//class
