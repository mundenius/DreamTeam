package batallaNaval;
import java.util.Scanner;

public class Utilidad {
	public static String escribir(String mensaje) {
		System.out.print(mensaje);
		return mensaje;
	}
	
	public static String ingresar(String mensaje) {
		Scanner sc = new Scanner(System.in);		
		Utilidad.escribir(mensaje);
		String capturador = sc.nextLine();
		return capturador; 
	}
}
