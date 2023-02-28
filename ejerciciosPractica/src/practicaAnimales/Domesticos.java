package practicaAnimales;

public interface Domesticos {
	public void esDomestico();
	
	default void mostrarDatos() {
		System.out.println("Falta especificar si es Oviparo o Viviparo");
	}
}
