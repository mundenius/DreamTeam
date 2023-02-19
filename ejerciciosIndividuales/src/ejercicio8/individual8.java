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
	static ArrayList<Integer> notaAlumnos = new ArrayList <Integer>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agregarNombre();
		mostrarDatos(nombreAlumnos, notaAlumnos); 
		promedioNotas(notaAlumnos);
		int notaMinyMax = mostrarNotaMin(nombreAlumnos, notaAlumnos, mostrarNotaMax(nombreAlumnos, notaAlumnos));
		System.out.println(notaMinyMax);
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
			else if (nombres == "SALIR" && nombreAlumnos.size()<1 ){
				System.out.println("Debe ingresar al menos 1 alumno");					
			}
			else if (nombres.equals("SALIR")) {
				mostrarDatos(nombreAlumnos, notaAlumnos);
			}
			else {
				agregarNotas();
			}
		}
		while(nombres.trim().length()==0 || nombres == null || nombreAlumnos.size()<1 || !nombres.equals("SALIR"));
		
}
	//funcion para agregar las notas
	public static void agregarNotas() {
		do {	
			System.out.println("Ingrese nota: ");
			notas = sc.nextLine(); 
			if (Integer.parseInt(notas) < 1) {
				System.out.println("No puede valer 0");
			}
			else if (notas == "") {
				System.out.println("No puede estar vacio");
			} 
			else if (notas.length() == 0) {
				System.out.println("No puede estar vacío");
			}
			else if (!notas.matches("^[1-7]$")) {
				System.out.println("Ingrese un valor entre 1 y 7");
			}
			else {
				guardarDatos();
		}
		}
			while(notas.length() == 0);
			
	}
	public static void guardarDatos() {
		nombreAlumnos.add(nombres);
		notaAlumnos.add(Integer.parseInt(notas));
		contador++;
	}
	
	//funcion para mostrar los datos recolectados
	public static void mostrarDatos (ArrayList<String>nombreAlumnos, ArrayList<Integer>notaAlumnos) {
		System.out.println(nombreAlumnos);
		System.out.println(notaAlumnos);
		for(int i = 0; i < nombreAlumnos.size(); i++) {
			System.out.println("Nombre Alumno #"+(i+1) + ": " + nombreAlumnos.get(i) + " Nota: " + notaAlumnos.get(i));
		}
	}
	
	//funcion para calcular el promedio
	static int nota = 0;
	static double promedio = 0;
	public static void promedioNotas(ArrayList<Integer>notaAlumnos) {
		for(int i = 0; i < notaAlumnos.size();i++) {
			nota += notaAlumnos.get(i);
		}
		promedio = nota / notaAlumnos.size();
		System.out.println("Promedio de Notas: " + promedio);
	}
	
	// funcion para buscar la nota maxima y el nombre del alumno
	private static int mostrarNotaMax(ArrayList<String>nombreAlumnos, ArrayList<Integer>notaAlumnos) { 
		int notaMax = 0;
		String nombreMax = "";
		for(int i = 0; i < nombreAlumnos.size();i++) {
			if(notaMax <= notaAlumnos.get(i)) {
				notaMax = notaAlumnos.get(i);
				nombreMax = nombreAlumnos.get(i);
			}
		}
		System.out.println(nombreMax + " Obtuvo máxima calificación con: " + notaMax);
		return notaMax;
	}
	//funcion para buscar la nota minima y el nombre del alumno
	private static int mostrarNotaMin(ArrayList<String>nombreAlumnos, ArrayList<Integer>notaAlumnos, int notaMax) {
		int notaMin = 0;
		String nombreMin = "";
		for(int i = 0; i < nombreAlumnos.size(); i++) {
			if(notaMax >= notaAlumnos.get(i)) {
				notaMin = notaAlumnos.get(i);
				nombreMin = nombreAlumnos.get(i);
			}
		}
		
		System.out.println("" + nombreMin + " obtuvo la calificaión mínima de: " + notaMin);
		return notaMin;
	}
}
	