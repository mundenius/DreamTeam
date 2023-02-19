package ejercicio9;
import java.util.*;
public class individual9 {

	static Scanner sc = new Scanner (System.in);
	static int numeros = 0;
	static int cantNumeros = 1; 
	static String capNumeros = "";
	
	static ArrayList<Integer> paqueteNumeros = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		registroNumeros();
		displayNumeros(paqueteNumeros);
		promedioNumeros(paqueteNumeros);
		displayNumerosImpares();
	}

	public static void registroNumeros() {
		while(true) {
			System.out.println("Ingrese el numero #" + cantNumeros);
			String capNumeros = sc.nextLine();
			if (capNumeros == "0" && cantNumeros >= 3) {
				break;
			}
			else {
				guardarNumeros();
			}
		}
	}
//		do {
//			System.out.println("Ingrese un numero: ");
//			if (capNumeros == 0 ) {
//				break; 
//			}
//			else {
//				guardarNumeros(); 
//			}
//		}
//		while (capNumeros != 0 || cantNumeros >= 3);
//	}
	
	public static void guardarNumeros() {
		paqueteNumeros.add(Integer.parseInt(capNumeros));
		cantNumeros++;
		System.out.println("Se guardo correctamente el numero");
	}
	
	public static void displayNumeros(ArrayList<Integer>paqueteNumeros) {
		System.out.println(paqueteNumeros);
		for(int i = 0; i < paqueteNumeros.size(); i++) {
			System.out.println("#"+(i+1) + " = " + paqueteNumeros.get(i));
		}
	}
	
	//funcion para calcular el promedio
		static int numero = 0;
		static int promedio = 0;
		public static int promedioNumeros(ArrayList<Integer>paqueteNumeros) {
			for(int i = 0; i < paqueteNumeros.size();i++) {
				numero += paqueteNumeros.get(i);
			}
			promedio = numero / paqueteNumeros.size();
			System.out.println("Promedio de los Numeros ingresados: " + promedio);
			return promedio;
		}
		
		// funcion para buscar la nota maxima
		private static int numeroMax(ArrayList<Integer>paqueteNumeros) { 
			int numeroMax = 0;
			for(int i = 0; i < paqueteNumeros.size();i++) {
				if(numeroMax <= paqueteNumeros.get(i)) {
					numeroMax = paqueteNumeros.get(i);	
				}
			}
			System.out.println("El número máximo fue: " + numeroMax);
			return numeroMax;
		}
		//funcion para buscar la nota minima y el nombre del alumno
		private static double numeroMin(ArrayList<Integer>paqueteNumeros, int numeroMax) {
			int notaMin = 0;
			for(int i = 0; i < paqueteNumeros.size(); i++) {
				if(numeroMax >= paqueteNumeros.get(i)) {
					notaMin = paqueteNumeros.get(i);
				}
			}
		
			System.out.println("El numero mínimo fue:  " + notaMin);
			return notaMin ;
		}
		
		public static void displayNumerosImpares() {
			for (int i = 0; i < paqueteNumeros.size(); i++) {
				int elemento = paqueteNumeros.get(i);
				
				if (elemento % 2 == 0) {
					System.out.println(elemento + " es par");
					paqueteNumeros.remove(i);
					i--;
				}
				else if(elemento %2 != 0) {
					System.out.println(elemento + " es impar.");
				}
			}
			System.out.println("Los numeros impares son: " + paqueteNumeros);
			System.out.println(numeroMax(paqueteNumeros));
			System.out.println(numeroMin(paqueteNumeros, 0));
			System.out.println(promedioNumeros(paqueteNumeros));
		}
		
	}
			
//			for (int i = 0; i < paqueteNumeros.size(); i++)	{
//				int elemento = paqueteNumeros.get(i);
//
//            if (elemento % 2 == 0) {
//                System.out.println(elemento + " es par");
//                paqueteNumeros.remove(i);
//                i--;
//            }
//            else if(elemento % 2 != 0)	{
//                System.out.println(elemento + " es impar");
//                
//            }
	
//	if elemento resto 2 es par
//	elemento /2 != 0 => impar
//	
//}