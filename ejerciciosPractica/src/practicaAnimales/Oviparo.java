package practicaAnimales;

public class Oviparo extends Animal {
	private boolean esVertebrado ;
	private String medioTransporte;
	
	
	public Oviparo() {
		
	}
	
	
	public Oviparo(int numExtremidades, String especie, String tipoAlimentacion, boolean esVertebrado, String medioTransporte) {
		super(numExtremidades,especie,tipoAlimentacion);
		this.esVertebrado = esVertebrado;
		this.medioTransporte = medioTransporte;
	}
	
	
	/** @param ES VERTEBRADO */
	
	public void setEsVertebrado(boolean esVertebrado) {
		this.esVertebrado = esVertebrado;
	}
	
	public boolean getEsVertebrado() {
		return esVertebrado;
	}
	
	
	/** @param MEDIO TRANSPORTE */
	
	public void setMedioTransporte(String medioTransporte) {
		this.medioTransporte = medioTransporte;
	}
	
	public String getMedioTransporte() {
		return medioTransporte;
	}
	
	@Override
	
	public void mostrarDatos() {
		System.out.println("Numero de Extremidades: " + getNumExtremidades() + "\nEspecie: " + getEspecie() + "\nTipo de Alimentacion: " + getTipoAlimentacion() + "\nEs Vertebrado: " + esVertebrado + "\nMedio de Transporte: " + medioTransporte);
	}
	
	@Override
	public void esDomestico() {
		System.out.println("Sin contar los de granja, la mayoria no son domesticables.");
	}
}
