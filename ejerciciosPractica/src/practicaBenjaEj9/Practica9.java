package practicaBenjaEj9;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica9 {

	static ArrayList<Integer> lista = new ArrayList<Integer>();
	static String capturador = "";
	static int numeros = 0;
	static int promedio = 0;
	static int numeroMax = 0;
	static int numeroMin = Integer.MAX_VALUE;
	static Scanner sc = new Scanner(System.in);
	static int contador = 1;

	public static void main(String[] args) {

		registrarNum();
		mostrarNum();
		promedio(lista);
		numMax();
		numMin();
		numImpares();
	}

	public static void registrarNum() {

		while (true) {
			System.out.println("Ingrese su numero: ");
			capturador = sc.nextLine();

			if (Integer.parseInt(capturador) == 0 && contador >= 3) {
				break;
			} else if (Integer.parseInt(capturador) == 0 && contador < 3) {
				System.out.println("Ingrese 3 valores o mas. ");
			} else {
				guardarNum();

			}
		}

	}

	public static void guardarNum() {
		lista.add(Integer.parseInt(capturador));
		System.out.println("Se ha registrado correctamente el numero. ");
		contador++;

	}

	public static void mostrarNum() {
		System.out.println(lista);
	}

	public static int promedio(ArrayList<Integer> lista) {
//loop sumatoria de los valores de la lista
		for (int i = 0; i < lista.size(); i++) {
			numeros += lista.get(i);
		}
		promedio = numeros / lista.size();
		System.out.println("El promedio de los valores es: " + promedio);
		return promedio;
	}

	public static void numMax() {
		for (int i = 0; i < lista.size(); i++) {
			if (numeroMax <= lista.get(i)) {
				numeroMax = lista.get(i);
			}
		}
		System.out.println("El numero mayor es: " + numeroMax);
	}

	public static void numMin() {
		for (int i = 0; i < lista.size(); i++) {
			if (numeroMin >= lista.get(i)) {
				numeroMin = lista.get(i);
			}
		}
		System.out.println("El numero menor es: " + numeroMin);
	}

	public static void numImpares() {
		int promedio1 = 0;
		int numeros1 = 0;
		for (int i = 0; i < lista.size(); i++) {
			int elemento = lista.get(i);
			if (elemento % 2 == 0) {
				System.out.println(elemento + " es par");
				lista.remove(i);
				i--;
			} else if (elemento % 2 != 0) {
				System.out.println(elemento + " es impar");
			}

		}
		System.out.println(lista);

		for (int i = 0; i < lista.size(); i++) {
			numeros1 += lista.get(i);
		}
		promedio1 = numeros1 / lista.size();
		System.out.println("El promedio de los valores es: " + promedio1);
		numMax();
		numMin();
	}

}
