
public class Principal {

	public static void main(String[] args) {		

		Persona persona;
		Padre padre;
		Hijo hijo;
		Nieto nieto;
		
		persona=new Persona("nomPersona");
		padre=new Padre("nomPadre", "apePadre");
		hijo=new Hijo("nomHijo", "apeHijo", 27);
		nieto=new Nieto("nomNieto", "apeNieto", 14, "tenis");
		
		
		System.out.println("\nDATOS DE LA PERSONA" + persona.toString());
		
		System.out.println("\nDATOS DEL PADRE" + padre.toString());
		
		System.out.println("\nDATOS DEL HIJO" + hijo.toString());
		
		System.out.println("\nDATOS DEL NIETO" + nieto.toString());
		
	}//main

}//class
