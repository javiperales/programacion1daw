package ejer33pseudo;
import java.util.*;
public class Ejer33pseudo {

	public static void main(String[] args) {
		String nombres[]= {"javi", "ivan","violeta","david","diogo","lolo","teresa","yaiza","esther","daniel",
				"sonia","alfredo","maria","andrea","jesus","juancar","misterjager","raquel","cristina","lidia","carmen","elrubios","tyrion"};
		int indice,aleatorio;
		for(indice=0;indice<20;indice++){
			aleatorio=(int)(Math.floor(Math.random()*22));
			nombres[indice]=nombres[aleatorio];	
			}//for
		
			for(indice=0;indice<20;indice++){
				System.out.println(nombres[indice]);
			}
	
	
	
	}//main

	}//class


