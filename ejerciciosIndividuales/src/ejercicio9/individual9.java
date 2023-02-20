// By DreamTeam™
package ejercicio9;
import java.util.*;
public class individual9 {

	static Scanner sc = new Scanner (System.in); //se define el scanner para el ingreso de los numeros
	static int numeros = 0;
	static int cantNumeros = 1; //se define un contador
	static String capNumeros = ""; //se define el capturador de los numeros
	
	static ArrayList<Integer> paqueteNumeros = new ArrayList<Integer>(); //arraylist de los numeros, definido como integer
	
	
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		registroNumeros();
		displayNumeros(paqueteNumeros);
		numeroMin(paqueteNumeros, numeroMax(paqueteNumeros));
		promedioNumeros(paqueteNumeros);
		displayNumerosImpares();
	}
// funcion para registrar los numeros
	public static void registroNumeros() {
		while(true) {
			System.out.println("Ingrese el numero #" + cantNumeros);
			capNumeros = sc.nextLine();
			if (Integer.parseInt(capNumeros) == 0 && cantNumeros >= 3) {
				break;
			}
				
			else if (Integer.parseInt(capNumeros) == 0 && cantNumeros < 3) {
					System.out.println("Debe ingresar al menos 3 numeros.");
			}

			else {
				guardarNumeros();
			}
		}
	}
	//funcion para guardar el numero del capturador en la arraylist
	public static void guardarNumeros() {
		paqueteNumeros.add(Integer.parseInt(capNumeros));
		System.out.println("Se guardo correctamente el numero"); //DEBUG
		cantNumeros++;
	}
	// funcion para mostrar lo guardado en el arraylist
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
			System.out.println("Promedio de los Numeros ingresados es: " + promedio);
			return promedio;
		}
		
		// funcion para buscar el numero maximo
		public static int numeroMax(ArrayList<Integer>paqueteNumeros) { 
			int numeroMax = 0;
			for(int i = 0; i < paqueteNumeros.size();i++) {
				if(numeroMax <= paqueteNumeros.get(i)) {
					numeroMax = paqueteNumeros.get(i);	
				}
			}
			System.out.println("El número máximo fue: " + numeroMax);
			return numeroMax;
		}
		//funcion para buscar el numero minimo
		public static int numeroMin(ArrayList<Integer>paqueteNumeros, int numeroMax) {
			int numeroMin = Integer.MAX_VALUE;
			for(int i = 0; i < paqueteNumeros.size(); i++) {
				if(numeroMin >= paqueteNumeros.get(i)) {
					numeroMin = paqueteNumeros.get(i);
				}
			}
		
			System.out.println("El numero mínimo fue:  " + numeroMin);
			return numeroMin ;
		}
		// funcion para mostrar los numeros impares, el minimo, maximo y el promedio de éstos 
		public static void displayNumerosImpares() {	
			// loop para idetificar los numeros pares, y removerlos de la lista
			for (int i = 0; i < paqueteNumeros.size(); i++) {
				int elemento = paqueteNumeros.get(i);
				if (elemento % 2 == 0) {
					System.out.println(elemento + " es par");
					paqueteNumeros.remove(i);
					i--;
					cantNumeros--; // se resta 1 al contador para vez que se saque un numero par, para que el promedio se calcule correctamente
				}
				else if(elemento %2 != 0) {
					System.out.println(elemento + " es impar.");
				}
			}
			System.out.println("Los numeros impares son: " + paqueteNumeros);
			System.out.println(numeroMax(paqueteNumeros));
			System.out.println(numeroMin(paqueteNumeros, 0));
			
			//funcion interna para calcular el promedio de los numeros impares
			int numero = 0; 
			int promedio = 0; 
			for(int i = 0; i < paqueteNumeros.size();i++) {
				numero += paqueteNumeros.get(i);
			};
			promedio = numero / paqueteNumeros.size();
			System.out.println("Promedio de los Numeros Impares ingresados es: " + promedio);
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