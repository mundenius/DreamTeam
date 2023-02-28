package practicaAnimales;

public class Animal implements Domesticos {
	private int numExtremidades;
	private String especie; 
	private String tipoAlimentacion; 
	
	public Animal() {
		
	}
	
	public Animal(int numExtremidades, String especie, String tipoAlimentacion) {
		this.numExtremidades = numExtremidades; 
		this.especie = especie; 
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	/** @param Numero Extremidades */
	public void setNumExtremidades(int numExtremidades) {
		this.numExtremidades = numExtremidades;
	}
	
	public int getNumExtremidades() {
		return numExtremidades;
	}
	
	/** @param ESPECIE */
	
	public void setEspecie(String especie) { 
		this.especie = especie;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	/** @param TIPO ALIMENATACION  */ 
	
	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}
	
	/** METODO MOSTRAR DATOS */
	
	public void mostrarDatos() {
		System.out.println("Numero de Extremidades: " + numExtremidades + "\nEspecie: " + especie + "\nTipo de Alimentacion: " + tipoAlimentacion);
	}
	
	@Override

	public void esDomestico() {
	}
}