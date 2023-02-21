package ejercicio10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajadores trabajador1 = new Trabajadores("Alejandro", "Pizarro", "12234456-7", 98765432, 33);
		Trabajadores trabajador2 = new Trabajadores("Maria", "Flores", "13675209-5", 87623409, 40);
		Trabajadores trabajador3 = new Trabajadores("Camilo", "Ponce", "19614734-3", 92012825, 25);
		Trabajadores trabajador4 = new Trabajadores("Douglas", "Reid", "19035923-5", 93847346, 25);
		System.out.println(trabajador1.toString() + trabajador2.toString() + trabajador3.toString() + trabajador4.toString());
	}

}
