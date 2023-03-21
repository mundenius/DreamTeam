package batallaNaval;

public class Buque extends Barco{
	
	private String nombre;
	
	public Buque () {
	}
	
	public Buque (int vida, int armadura, int x, int y, String orientacionBarco, String nombre) {
		super(vida, armadura, x, y, orientacionBarco);
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Buque [nombre=" + nombre + "]";
	}
}
