
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class Libreria {



	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	///////////CREAR VALORES AL AZAR/////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	static public String letraAzar() {
		Random azar= new Random();

		String letraAzar[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","�","O","P","Q","R","S",
				"T","U","V","W","X","Y","Z"};

		return letraAzar[azar.nextInt(letraAzar.length)];
	}
	static public String muebleAzar() {
		Random azar= new Random();
		String mueble[]={"Mesa","Silla","Armario",
				"Escritorio ","Sof�","Reposa pie.","Estanteria","Perchero","Zapatero","Sill�n","Cama","Litera","Guarda platos"
				,"Guarda Vasos","Mesa de bar","Silla Gamer","Mesa 2","Cama Matrimonial"};
		return mueble[azar.nextInt(mueble.length)];
	}
	static public String muebleDescripcion() {
		Random azar= new Random();
		String mueble[]={"Es una mesa","Es una silla","Este es un armario",
				" Es un Escritorio ","Sof� muy comodo","Reposa pie para relajarte.","Estanteria para poner la tv","Perchero para su ropa"
				,"Zapatero muy barato","Sill�n muy bonito","Cama bonita y barata","Litera para 2 personas","Guarda platos de madera"
				,"Guarda Vasos de plastico","Mesa de bar con Ron incluido","Silla Gamer para los ni�os","Mesa 2 para comer en familia"
				,"Cama Matrimonial muy barata"};
		return mueble[azar.nextInt(mueble.length)];
	}
	static public String asignaturaAzar() {
		Random azar= new Random();
		String asig[]={"Entornos y desarrollo","Ingl�s","Programaci�n",
				"Sistemas Inform�ticos","Bases de Datos","FOL","Lenguaje de Marcas"};
		return asig[azar.nextInt(asig.length)];
	}
	static public String fechaNacimientoAzar() {
		Random azar= new Random();
		int dia,mes,a�o;
		String a�oAux="",aux="";
		String fecha="";
		dia=azar.nextInt(30)+1;
		mes=azar.nextInt(12)+1;
		a�o=azar.nextInt(enteroAzar( 1, 17));
		a�oAux+=a�o;
		if(a�oAux.length()==1){
			aux+="0"+a�oAux;
		}else{
			aux+=a�o;
		}
		fecha=dia+"-"+mes+"-"+"20"+aux;
		return fecha;
	}
	public static String ingredientesAzar(){
		Random azar= new Random();
		String ingre[]={"Huevo","Queso","Sal","Ajo","Limon","Cebolla","Or�gano",
				"Mantequilla","Pimiento verde","Tomate","Jam�n York","Mayonesa",
				"Lechuga","Patatas fritas","Ketchup","frambuesas","Queso de mascarpone","Az�car",
		"Chocolate"};
		return ingre[azar.nextInt(ingre.length)];
	}
	public static String postreAzar(){
		Random azar= new Random();
		String postre[]={"Tiramis�","Postre pavlova","Macarons","Torta negra del diablo"
				,"Flan","Cheesecake ","Brownies con helado","Gula Melaka","Isla flotante","Pastel de Bel�m"};
		return postre [azar.nextInt(postre.length)];
	}
	public static String bebidadAzar(){
		Random azar= new Random();
		String beb[]={"Coca Cola","Cerveza","Copa","Vino","Fanta","Caf�","Zumo de naranja","Zumo de pi�a","Agua",
				"Red bull","Burn","Chocolate","Caf� con leche"};
		return beb[azar.nextInt(beb.length)];
	}
	public static String nombrePlatosAzar(){
		Random azar= new Random();
		String platoAzar[]={"Paella","Pupusas","Sopa","Bocadillo","Pollo al horno","Ensalada de pasta",
				"Ensalada de garbanzos","Ensalada de lentejas","Pulpo","Mejillones al vapor","Gambas",
				"Pollo a la cerveza","Pollo al ajillo","Pechugas de pollo","Pollo en salsa","Lasa�a de carne",
				"Macarrones","Sopa de pescado","Sopa de marisco","Lentejas","Sopa castellana","Crema de puerros","Crema de calabacin",};
		return platoAzar[azar.nextInt(platoAzar.length)];
	}
	static public String nombreAzar() {
		Random azar= new Random();

		String nombreAzar[]={"Santiago","Sebasti�n","Diego","Thiago","Nicol�s","Samuel","Dario","Alejandro","Mateo",
				"�ngel","Mat�as","Gabriel","Tom�s","David","Emiliano","Andr�s","Joaqu�n","Carlos","Alexander","Adri�n","Lucas",
				"Sof�a","Camila","Valentina","Isabella","Valeria","Daniela","Mariana","Sara","Victoria","Gabriela","Ximena",
				"Andrea","Natalia","M�a","Martina","Luc�a","Samantha","Mar�a","Paula","Nicole"};

		return nombreAzar[azar.nextInt(nombreAzar.length)];
	}

	static public String apellidoAzar(){
		Random azar= new Random();

		String apellidoAzar[]={"Abad�a","Abarca","Abell�n","Abiego","Acorella","Baldovinos","Bandr�s","Cabra","Cajal","Calasanz",
				"Samper","Latorre", "Escolano", "Cebri�n", "Clemente", "Navarro","Garc�a","Hern�ndez","Mart�nez","L�pez",
				"P�rez","Fern�ndez","Ruiz","S�nchez","Rodr�guez","G�mez","Gonz�lez","Jim�nez","Cruz","Requena","Moreno","Reyes",
				"Morillas","Cortes","Ortiz","Romero","Medialdea","Exp�sito","Raya","Sierra","Membrilla","Casado","Amezcua","Mu�oz",
				"Santiago","Delgado","Moya","Serrano","Contreras","Hidalgo","Mesa","Pozo","Soria","Vera","Var�n","Parra"};

		return apellidoAzar[azar.nextInt(apellidoAzar.length)];
	}

	static public String marcaAzar(){
		Random azar= new Random();
		String marcaAzar[]={"Apple","Google","Coca-Cola","Microsoft","IBM","Toyota","Samsung","GE","McDonald�s","Amazon",
				"BMW","Mercedes-Benz","Disney","Intel","Cisco","Oracle","Nike","HP","Honda","Louis Vuitton","H&M","Gillette",
				"Facebook","Pepsi","American Express","SAP","IKEA","Pampers","UPS","Zara","Budweiser","eBay","J.P. Morgan",
				"Nescaf�","HSBC","Ford","Hyundai","Canon","Herm�s","Accenture","L�Or�al","Audi","Citi","Goldman Sachs",
				"Philips","AXA","Nissan","Gucci","Danone","Nestl�","Siemens","Allianz","Colgate","Porsche","Cartier",
				"Sony","3M","Morgan Stanley","Visa","Adidas","Thomson Reuters","Discovery","Panasonic","Tiffany & Co.",
				"Starbucks","Adobe","Prada","Santander","Xerox","Caterpillar","Burberry","Kia","KFC","MasterCard",
				"Johnson & Johnson","Shell","Harley-Davidson","DHL","Sprite","Lego","John Deere","Jack Daniel�s",
				"Chevrolet","FedEx","Land Rover","Huawei","Heineken","MTV","Ralph Lauren","Johnnie Walker","Corona",
				"Smirnoff","Kleenex","Hugo Boss","PayPal","Mini","Mo�t & Chandon","Lenovo"};
		return marcaAzar[azar.nextInt(marcaAzar.length)];
	}
	static public String libroAzar(){
		Random azar= new Random();
		String []libro={"�Y a ti qu� te pasa? Narrativa rom�ntica","Patria Narrativa espa�ola","Idiotizadas","El d�a que se perdi� el amor"
				+ "","El d�a que se perdi� la cordura","Ll�mame por tu nombre (Call Me by Your Name)","Memoria del comunismo Historia Universal - I Guerra Mundial y entreguerras",
				"Cuentos de buenas noches para ni�as rebeldes","Indomable. Diario de una chica en llamas","Beren y Luthien","Origen","Un andar solitario entre la gente"
				,"Las escapadas de Jamie Oliver","La torre","Bellas durmientes","Cuando sale la reclusa","Que nadie duerma","Invisible","La transparencia del tiempo",};
		return libro[azar.nextInt(libro.length)];
	}
	static public String pedirCadena(final String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String dato="";
		boolean error = true;
		while (error) {
			try {
				dato="";
				mostrarEnPantalla(texto);
				dato = dataIn.readLine();
				error=false;
			} catch (IOException e) {
				mostrarEnPantalla("Vuelve a introducir el dato, por favor: ");
				error = true;
			}
		}
		return dato;

	}
	static public String sexoAzar(){
		Random azar= new Random();
		String sexo[]={"Hombre","Mujer"};
		return sexo[azar.nextInt(sexo.length)];
	}
	static public String emailAzar(){
		Random azar= new Random();
		String [] email={"oscar94.oscar@hotmail.com","alumno@hotmail.com","profe13@hotmail.com","oscarPortillo@hotmail.com","tomAndJerry@hotmail.com",
				"alumnoProfe@hotmail.com","autorKLibro@hotmail.com","IES@hotmail.com","ies@gmail.com","alumnoies@gmail.com","profeies@gmail.com"};
		return email[azar.nextInt(email.length)];
	}
	static public String provinciaAzar(){
		Random azar= new Random();
		String provincia[]= {"Alava","Albacete","Alicante","Almer�a","Asturias","Avila","Badajoz","Barcelona","Burgos","C�ceres",
				"C�diz","Santander","Castell�n","Ciudad Real","C�rdoba","La Coru�a","Cuenca","Gerona","Granada","Guadalajara",
				"Guip�zcoa","Huelva","Huesca","Islas Baleares","Ja�n","Le�n","L�rida","Lugo","Madrid","M�laga","Murcia","Navarra",
				"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
				"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
		return provincia[azar.nextInt(provincia.length)];
	}

	static public String comunidadAzar(){
		Random azar= new Random();

		String comunidad[] = {"Andaluc�a", "Arag�n", "Canarias", "Cantabria", "Castilla y Le�n", "Castilla-La Mancha", "Catalu�a", "Ceuta",
				"Comunidad Valenciana", "Comunidad de Madrid", "Extremadura", "Galicia", "Islas Baleares", "La Rioja", "Melilla", "Navarra", 
				"Pa�s Vasco", "Principado de Asturias", "Regi�n de Murcia"};

		return comunidad[azar.nextInt(comunidad.length)];
	}

	static public String dniAzar(){
		Random azar= new Random();
		String dni;
		String letra[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int numero, calculo;
		numero=azar.nextInt((99999999-10000000)+1)+10000000;
		calculo=numero%23;
		dni=numero+letra[calculo];
		return dni;
	}

	static public boolean validaDni(String DNI){
		String dato = DNI;
		boolean estado=false;
		int num;
		String letra[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		num = Integer.parseInt(dato.substring(0, 8));
		if(dato.substring(8, 9).toUpperCase().compareTo(letra[num%23])==0){
			estado=true;
		}else{
			//System.out.println("DNI erroneo");
			estado=false;
		}
		return estado;
	}

	static public int enteroAzar(int desde, int hasta){
		Random azar= new Random();
		return azar.nextInt(hasta-desde+1)+desde;
	}

	static public double decimalAzar(int desde, int hasta){
		Random azar= new Random();
		return (azar.nextInt((int)((hasta-desde)*100+1))+desde*100) / 100.00;
	}

	static public String enfermedadAzar(){
		Random azar= new Random();

		String enfermedad[] = {"Absceso dental", "Accidente Cerebro Vascular (Ictus)", "Alcoholismo", 
				"Anemia de Fanconi", "Anemias","Anginas", "Anorexia nerviosa", "Apnea del Sue�o", 
				"Asma bronquial", "Aterosclerosis", "Bronquiectasias", "Bronquitis Cr�nica", 
				"Brucelosis", "Bulimia", "Calambres en los M�sculos", "C�lculos renales", 
				"Callos y Callosidades", "Cefaleas de Tensi�n", "Ci�tica", "C�lico de Ri��n", 
				"Colitis Ulcerosa", "Colon Irritable", "Coma Et�lico", "Congelaci�n", 
				"Degeneraci�n Macular del Ojo", "Depresi�n", "Deshidrataci�n", 
				"Desmayos y Mareos", "Diarrea Cl�nica", "Diarrea del Viajero", 
				"Dolor de Cabeza", "Dolor de Espalda", "Dolor de Garganta", "Dolor de O�do", 
				"Embarazo en la Adolescencia", "Enfermedad de Crohn", "Enfermedad de Parkinson", 
				"Estre�imiento", "Fisura anal", "Gangli�n", "Glositis", "Gota", "Gripe", "Hemat�mesis", 
				"Hemorroides", "Hernia Discal", "Hiperlipemias y colesterol Elevado  ", 
				"Hipertensi�n arterial", "Hipertensi�n intracraneal idiop�tica", "Hipocondria", "Hipotensi�n",
				"Hongos de la piel", "Hongos en las u�as", "Intoxicaci�n por Alcohol", "Juanetes", 
				"Laberintitis", "Labios Agrietados", "Laringitis", "Latigazo Cervical", "Lengua Geogr�fica", 
				"Mareo", "Mastoiditis", "Migra�a", "Obesidad", "Orinar por la noche", 
				"Par�lisis Facial de Bell", "Piel seca. Xerosis", "Reflujo Gastroesof�gico", "Resfriado", 
				"Ronquidos", "Rotura de T�mpano", "Sangrado Nasal", "Sangrado Rectal", "Sangre en el Esputo", 
				"Sangre en la Orina", "S�ndrome de Astenia Cr�nica", "S�ndrome de Piernas Inquietas", 
				"S�ndrome hep�tico renal", "S�ndrome nefr�tico", "Sinusitis", "Talasemia", 
				"Tendinitis. Bursitis", "Tic en el P�rpado", "Varices", "V�rtigo"};

		return enfermedad[azar.nextInt(enfermedad.length)];
	}

	static public String medicamentoAzar(){
		Random azar= new Random();

		String medicamento[] = {"Nolotil.", "Efferalgan.", "Gelocatil.", "Adiro 100.", "Augmentine.", 
				"Orfidal Wyeth.", "Neobrufen.", "Dianben.", "Antidiab�ticos orales.", "Termalgin.", 
				"Lexatin.", "Almax.", "Trankimazin.", "Flumil.", "Sintrom.", "Frenadol complex.", 
				"Aspirina adultos.", "Dalsy.", "Espidifen.", "Tranxilium.", "Omeprazol Ratiopharm.", 
				"Cardyl.", "Yasm�n.", "Seguril.", "Omeprazol Cinfamed.", "Flutox.", "Zarator.", "A.A.S.", 
				"Plantaben.", "Noctamid.", "Enantyum.", "Zaldiar.", "Daflon 500.", "Tromalyt.", 
				"Hidrosaluretil.", "Prevencor.", "Carduran Neo.", "Duphalac.", "Ibuprofeno Kern.", 
				"Myolastan.", "Adiro 300.", "Algidol.", "Mucosan.", "Voltar�n.", "Eutirox.", "Norvas.", 
				"Clamoxyl.", "Coropres.", "Paracetamol Kern.", "Serc.", "Idaptan.", "Lizipaina.", "Plavix.", 
				"Idalprem.", "Metformina Sandoz.", "Motilium.", "Ebastel.", "Actonel.", "Tardyferon.", 
				"Analgilasa.", "Levothroid.", "Metamizol Normon.", "Diazepan Prodes.", "Couldina.", 
				"Pantecta.", "Fortasec.", "Dogmatil.", "Fero-gradumet.", "Lorazepam Normon.", "Singulair.", 
				"Omeprazol Pensa.", "Zyloric.", "Amoxicilina Normon.", "Diane 35.", "Cozaar.", 
				"Ibuprofeno Cinfa.", "Aero-red.", "Aspirina C.", "Acfol.", "Co-Diov�n.", 
				"Lormetazepam Normon.", "Paracetamol Pharmagenus.", "Primperan.", 
				"Enalapril Ratiopharm efg.", "Xumadol.", "Aerius.", "Polaramine.", "Acovil.", "Zinnat.", 
				"Omeprazol Davur.", "Anagastra.", "Sutril.", "Antalgin.", "Fosamax.", "Furosemida Cinfa.", 
				"Tertensif Retard.", "Stilnox.", "Flatoril.", "Monurol.", "Airtal."};

		return medicamento[azar.nextInt(medicamento.length)];
	}




	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	//////////METODOS LEER POR TECLADO///////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////

	static public String pedirCadena(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";

		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;					
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			break;
		case -1://solo una vez
			boolean er = true;
			while (er) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					er=false;					
				} catch (IOException e) {
					System.out.println("Error dato mal introducido");
					er = false;
				}
			}

			break;


		}
		return dato;

	}

	static public int pedirEnteroValidar(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		int dato=0;
		switch(opcion){
		case 0://hasta que de dato correcto
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = Integer.parseInt(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Un fallo y fuera
			boolean er = true;
			while (er) {
				try {
					System.out.println(texto);
					dato = Integer.parseInt(dataIn.readLine());
					er=false;
				} catch (IOException e) {
					System.out.println("Dato no correcto");
					er = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					er=false;
				}
			}
			break;
		default :
			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while (err) {
					try {
						System.out.println(texto);
						dato = Integer.parseInt(dataIn.readLine());
						err=false;
						k=opcion-1;
					} catch (IOException e) {
						System.out.println("El dato introducido no es entero");
						err = false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					} catch(NumberFormatException e){
						System.out.println("El dato introducido no es entero");
						err=false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					}
				}
			}
		}
		return dato;

	}

	/*LONG*/
	static public Long pedirLongValidar(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		Long dato=0l;
		switch(opcion){
		case 0://hasta que de dato correcto
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = Long.parseLong(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Un fallo y fuera
			boolean er = true;
			while (er) {
				try {
					System.out.println(texto);
					dato = Long.parseLong(dataIn.readLine());
					er=false;
				} catch (IOException e) {
					System.out.println("Dato no correcto");
					er = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es entero");
					er=false;
				}
			}
			break;
		default :
			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while (err) {
					try {
						System.out.println(texto);
						dato = Long.parseLong(dataIn.readLine());
						err=false;
						k=opcion-1;
					} catch (IOException e) {
						System.out.println("El dato introducido no es entero");
						err = false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					} catch(NumberFormatException e){
						System.out.println("El dato introducido no es entero");
						err=false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					}
				}
			}
		}
		return dato;

	}
	static public void mostrarEnPantalla(String mensage){
		System.out.println(mensage);
	}

	static public int pedirEntero(final String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		int dato=0;
		boolean error = true;
		while (error) {
			try {
				mostrarEnPantalla(texto);
				dato = Integer.parseInt(dataIn.readLine());
				error=false;
			} catch (IOException e) {
				mostrarEnPantalla("Vuelve a introducir el dato, por favor");
				error = true;
			} catch(NumberFormatException e){
				mostrarEnPantalla("El dato introducido no es entero");
				mostrarEnPantalla("Vuelve a introducir el dato, por favor: ");
				error=true;
			}
		}
		return dato;

	}

	static public double decimal(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		double dato=0;

		switch(opcion){
		case 0://Repetir hasta que nos den un dato correcto
			boolean error = true;
			while (error) {			
				try {
					System.out.println(texto);
					dato = Double.parseDouble(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Solo permite introducir un dato y si no lo meten correctamente se cierra el programa
			boolean er = true;
			while(er){
				try {
					System.out.println(texto);
					dato = Double.parseDouble(dataIn.readLine());
					er=false;
				} catch (IOException e) {
					System.out.println("El dato introducido no es decimal ");
					er = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");				
					er=false;
				}
			}
			break;
		default:

			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while(err){
					try {
						System.out.println(texto);
						dato = Double.parseDouble(dataIn.readLine());
						err=false;
						k=opcion-1;
					} catch (IOException e) {
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						err = false;
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
					} catch(NumberFormatException e){
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						err=false;
						if(k==(opcion-2)){System.out.println("El dato introducido no es decimal. \nUltimo intento");}
					}
				}
			}
			break;
		}
		return dato;

	}
	static public float pedirFloat(int opcion, String texto) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		float dato=0;
		switch(opcion){
		case 0://Sigue hasta que nos den un dato correcto
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = Float.parseFloat(dataIn.readLine());
					error=false;
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error=true;
				}
			}
			break;
		case -1://Un fallo y fuera
			boolean erro = true;
			while (erro) {
				try {
					System.out.println(texto);
					dato = Float.parseFloat(dataIn.readLine());
					erro=false;
				} catch (IOException e) {
					System.out.println("El dato introducido no es decimal");
					//System.out.println("Vuelve a inroducir el dato, por favor: ");
					erro = false;
				} catch(NumberFormatException e){
					System.out.println("El dato introducido no es decimal");
					//System.out.println("Vuelve a inroducir el dato, por favor: ");
					erro=false;
				}
			}
			break;
		default:
			for(int k=0; k<opcion; k++ ){
				boolean err = true;
				while (err) {
					try {
						System.out.println(texto);
						dato = Float.parseFloat(dataIn.readLine());
						err=false;
					} catch (IOException e) {
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						if(k==(opcion-2)){System.out.println("Ultimo intento");}
						err = false;
					} catch(NumberFormatException e){
						if(k<(opcion-2)){System.out.println("El dato introducido no es decimal. \nVuelve a inroducir el dato, por favor: ");}
						if(k==(opcion-2)){System.out.println("Ultimo intento");}

						err=false;
					}
				}
			}
			break;
		}
		return dato;

	}


	static public String t_iban(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[a-zA-Z]{2}[0-9]{22}$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("IBAN V�lido");

				}else{
					System.out.println("IBAN No V�lido");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			Pattern patr = Pattern.compile("^[a-zA-Z]{2}[0-9]{22}$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("IBAN V�lido");

			}else{
				System.out.println("IBAN No V�lido");
				dato=null;
			}
			break;

		}
		return dato;
	}

	static public String t_identificacion(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[klmxyzKLMXYZ\\d]{1}[0-9]{7}[a-zA-Z&&[^iouIOU]]{1}$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("Documento identificaci�n V�lido");

				}else{
					System.out.println("Documento identificaci�n No V�lido");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			Pattern patr = Pattern.compile("^[klmxyzKLMXYZ\\d]?[0-9]{7}[a-zA-Z&&[^iouIOU]]{1}$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("Documento identificaci�n V�lido");

			}else{
				System.out.println("Documento identificaci�n No V�lido");
				dato=null;
			}
			break;

		}
		return dato;
	}

	static public String t_fecha(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[-](0?[1-9]|1[012])[-][\\d]{4}$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("Fecha V�lida");

				}else{
					System.out.println("Fecha No V�lida");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			// 
			Pattern patr = Pattern.compile("^ (0?[1-9]|[12][0-9]|3[01])[-](0?[1-9]|1[012])[-][\\d]{4}$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("Fecha V�lida");

			}else{
				System.out.println("Fecha No V�lida");
				dato=null;
			}
			break;

		}
		return dato;
	}

	static public String t_email(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					System.out.println("Correo V�lido");

				}else{
					System.out.println("Correo No V�lido");
					dato=null;
				}
			}while(dato==null);
			break;

		case -1://solo una vez
			boolean error = true;
			while (error) {
				try {
					System.out.println(texto);
					dato = dataIn.readLine();
					error=false;						
				} catch (IOException e) {
					System.out.println("Vuelve a inroducir el dato, por favor: ");
					error = true;
				}
			}
			Pattern patr = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			Matcher matc = patr.matcher(dato);
			if(matc.find()){
				System.out.println("Correo V�lido");

			}else{
				System.out.println("Correo No V�lido");
				dato=null;
			}
			break;

		}
		return dato;
	}

	static public String t_alfanumerico(int opcion, String texto) {		
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(
				System.in));
		String dato="";


		switch(opcion){
		case 0://mientras que cometan fallo que sigan introduciendo datos
			do{
				boolean error = true;
				while (error) {
					try {
						System.out.println(texto);
						dato = dataIn.readLine();
						error=false;						
					} catch (IOException e) {
						System.out.println("Vuelve a inroducir el dato, por favor: ");
						error = true;
					}
				}

				Pattern pat = Pattern.compile("^[A-Za-z0-9]*$");
				Matcher mat = pat.matcher(dato);
				if(mat.find()){
					//System.out.println("Contrase�a V�lida");

				}else{
					System.out.println("Contrase�a no V�lida");
					dato=null;
				}
			}while(dato==null);
			break;
		}
		return dato;
	}	



	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////METODOS GUARDAR OBJETO EN FICHERO///////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////

	public static void f_escribirFichero(Object objeto,String nombreFichero){
		ObjectOutputStream fich = null;
		try {            
			fich = new ObjectOutputStream(new FileOutputStream(nombreFichero+".dat"));                

			System.out.println("Guardamos la informacion en el fichero "+"\""+nombreFichero+".dat");
			fich.writeObject(objeto);                                
			fich.close();			
		} catch (IOException ex) {
			System.out.println("Error E/S: " + ex.getMessage());
		} finally {
			try {
				if (fich != null) {
					fich.close();

				}
			} catch (IOException ex) {
				System.out.println("Error al cerrar fichero: " + ex.getMessage());
			}
		}

	}//escribirFichero

	@SuppressWarnings("resource")
	public static Object f_leerFichero(String nombreFichero) {
		File fich = new File (nombreFichero+".dat");
		Object objeto = new Object();
		if(fich.exists()){
			ObjectInputStream fichLeer = null;
			//System.out.println("\nLos datos de los alumnos recuperados del fichero son: ");
			try {
				fichLeer = new ObjectInputStream(new FileInputStream(nombreFichero+".dat"));
				boolean hayaDatos = true;           
				fichLeer = new ObjectInputStream(new FileInputStream(nombreFichero+".dat"));
				//System.out.println("\nLos datos recuperados del fichero son: ");
				while (hayaDatos) {
					try {
						objeto = (Object) fichLeer.readObject();
						//System.out.println(objeto);

					} catch (EOFException e) {
						hayaDatos = false; //Salimos del bucle porque ya hemos recorrido el fichero entero
					}

				}
				//System.out.println("\n");
				//System.out.println("Fichero leido correctamente.");
			} catch (ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			} finally {
				try {
					fichLeer.close();
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}//finally
		}//if file exists
		return objeto;
	}//leerFichero



	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	////////MODIFICAR///////
	/////////////////////////////////////////////
	/////////////////////////////////////////////
	/////////////////////////////////////////////


	/*	public static void mostrarUsuarios(Object map){
		Iterator <Map.Entry<String,String>> it;
		it=map.entrySet().iterator();
		Map.Entry<String,String> mEntry;
		while(it.hasNext()){
			mEntry=it.next();
			String clave=mEntry.getKey();
			System.out.println(clave);
		}
	}*/

	public static void recorreTreeMap(TreeMap<Integer, String> mapa){ //cambiar tipo de dato del mapa que entra
		for(Integer i: mapa.keySet()){
			String valor = mapa.get(i);
			//hacer lo que sea con vada nodo aqu�
		}
	}





}//class