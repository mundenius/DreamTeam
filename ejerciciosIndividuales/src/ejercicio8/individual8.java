package ejercicio8;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class individual8 {
	
	static String exitStudent = "SALIR";
	static String nombres = "";
	static String notas = "";
	static int contador = 1;
	
	// se nombra al objeto scanner
	static Scanner sc = new Scanner (System.in);
	
	// Arraylists para guardar los datos
	static ArrayList<String> nombreAlumnos = new ArrayList<String>(); 
	static ArrayList<Double> notaAlumnos = new ArrayList <Double>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agregarNombre();		//aqui se llama la primera funcion que es agregar el nombre de los estudiantes
		mostrarDatos(nombreAlumnos, notaAlumnos); //una vez se agregan todos los nombres, se ejecuta esta funcion que muestra todos los datos
		promedioNotas(notaAlumnos); // esta funcion saca el promedio de las notas del arraylist
		double notaMinyMax = mostrarNotaMin(nombreAlumnos, notaAlumnos, mostrarNotaMax(nombreAlumnos, notaAlumnos)); 
		//se crea un objeto que llama las funciones de nota minima y maxima, y las busca dentro de los arraylist declarados
		System.out.println(notaMinyMax); // se muestra en consola el objeto creado anteriormente
	}
	
	// funcion para agregar los nombres
	public static void agregarNombre() {
		do {  
			System.out.println("Ingrese nombre del Alumno " + contador + "	Escriba SALIR para terminar");
			nombres = sc.nextLine();
			if (nombres == null) {
				System.out.println("No puede estar vacio");
				System.exit(0);
			} 
			else if (nombres.length() == 0) {
				System.out.println("No puede estar vacío");
			} 
			else if (nombres.equals(exitStudent) && nombreAlumnos.size()<1 ){ //aqui se verifica que exista al menos 1 estudiante registrado
				System.out.println("Debe ingresar al menos 1 alumno");					
			}
			else if (nombres.equals("SALIR")) { // se verifica que se escriba SALIR y manda directo a la funcion mostrar datos
				mostrarDatos(nombreAlumnos, notaAlumnos);
			}
			else {	// al no cumplirse las otras condiciones, se pasa a la funcion de agregar notas del alumno recien ingresado
				agregarNotas(); 
			}
		}
		while(nombres.trim().length()==0 || nombres == null || nombreAlumnos.size()<1 || !nombres.equals("SALIR"));
		
}
	//funcion para agregar las notas
	public static void agregarNotas() {
		do {	
			System.out.println("Ingrese nota: " + "(" + nombres + ")");
			notas = sc.nextLine(); 
			if (Double.parseDouble(notas) < 1) {
				System.out.println("No puede valer 0");
			}
			else if (notas == "") {
				System.out.println("No puede estar vacio");
			} 
			else if (notas.length() == 0) {
				System.out.println("No puede estar vacío");
			}
			else if (!notas.matches("^[1-7]$")) {	// se verifica que sea una nota valida
				System.out.println("Ingrese un valor entre 1 y 7");
			}
			else {	// se guardan los datos en el arraylist si todo esta correcto
				guardarDatos();
		}
		}
			while(notas.length() == 0);
			
		// funcion para guardar los datos que se ingresan en las funciones anteriores
	}
	public static void guardarDatos() {
		nombreAlumnos.add(nombres);
		notaAlumnos.add(Double.parseDouble(notas));
		contador++;
	}
	
	//funcion para mostrar los datos recolectados
	public static void mostrarDatos (ArrayList<String>nombreAlumnos, ArrayList<Double>notaAlumnos) {
		System.out.println(nombreAlumnos);
		System.out.println(notaAlumnos);
		for(int i = 0; i < nombreAlumnos.size(); i++) {
			System.out.println("Nombre Alumno #"+(i+1) + ": " + nombreAlumnos.get(i) + " Nota: " + notaAlumnos.get(i));
		}
	}
	
	//funcion para calcular el promedio
	static double nota = 0;
	static double promedio = 0;
	public static void promedioNotas(ArrayList<Double>notaAlumnos) {
		for(int i = 0; i < notaAlumnos.size();i++) {
			nota += notaAlumnos.get(i);
		}
		promedio = nota / notaAlumnos.size();
		System.out.println("Promedio de Notas: " + promedio);
	}
	
	// funcion para buscar la nota maxima y el nombre del alumno
	private static double mostrarNotaMax(ArrayList<String>nombreAlumnos, ArrayList<Double>notaAlumnos) { 
		double notaMax = 0;
		String nombreMax = "";
		for(int i = 0; i < nombreAlumnos.size();i++) {
			if(notaMax <= notaAlumnos.get(i)) {
				notaMax = notaAlumnos.get(i);
				nombreMax = nombreAlumnos.get(i);
			}
		}
		System.out.println(nombreMax + " Obtuvo la máxima calificación con: " + notaMax);
		return notaMax;
	}
	//funcion para buscar la nota minima y el nombre del alumno
	private static double mostrarNotaMin(ArrayList<String>nombreAlumnos, ArrayList<Double>notaAlumnos, double notaMax) {
		double notaMin = 0;
		String nombreMin = "";
		for(int i = 0; i < nombreAlumnos.size(); i++) {
			if(notaMax >= notaAlumnos.get(i)) {
				notaMin = notaAlumnos.get(i);
				nombreMin = nombreAlumnos.get(i);
			}
		}
		
		System.out.println("" + nombreMin + " obtuvo la calificación mínima de: " + notaMin);
		return notaMin ;
	}
}
	// coded by DreamTeam