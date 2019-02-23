package ejer34pseudo;
import java.util.*;
public class Ejer34pseudo {

	public static void main(String[] args) {
		int tabla[][][] = new int[3][4][5];
		int k,j,o,cont;
		for(k=0;k<3;k++){
			cont=1;
			for(j=0;j<4;j++){
				for(o=0;o<5;o++){
					tabla[k][j][o]=cont;
					cont++;
				}//o
			}//j
			
		}//k
		

	}//main

}//class
