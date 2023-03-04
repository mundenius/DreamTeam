package practicaAnimales;

public class Viviparo extends Animal{
	private boolean esMamifero;
	private String pelaje; 
	
	public Viviparo() {
		super();
	}
	
	public Viviparo(int numExtremidades, String especie, String tipoAlimentacion, boolean esMamifero, String pelaje) {
		super(numExtremidades,especie, tipoAlimentacion);
		this.esMamifero = esMamifero;
		this.pelaje = pelaje;
	}
	
	/** @param ES MAMIFERO*/
	
	public void setEsMamifero(boolean esMamifero) {
		this.esMamifero = esMamifero;
	}
	
	public boolean getEsMamifero() {
		return esMamifero;
	}
	
	/** @param PELAJE */
	
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	
	public String getPelaje() {
		return pelaje;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Numero de Extremidades: " + getNumExtremidades() + "\nEspecie: " + getEspecie() + "\nTipo de Alimentacion: " + getTipoAlimentacion() + "\nEs mamifero: " + esMamifero + "\nTipo de pelaje: " + pelaje);
	}
	
	@Override
	
	public void esDomestico() {
		System.out.println("La mayoria son domesticables");
	}
}
