package practicaSmartphone;

/** Se define la clase y sus atributos*/
public class Bateria {
	private String marca; 
	private String mAh;

	/** metodo constructor vacio*/
	public Bateria() {
		
	}
	/** metodo constructor con los atributos como parametros*/
	public Bateria(String marca, String mAh) {
		this.marca = marca; 
		this.mAh = mAh;
		
	}
	
	/** @param MARCA */
	
	public void setMarca(String marca) {	/** SETTER marca*/
		this.marca = marca; 
	}
	
	public String getMarca(){ /** GETTER marca */
		return marca; 
	}
	
	/** @param AMPERAJE */
	public void setmAh(String mAh) {	/** SETTER mAh , se debe poner el datatype porque sino en el main no te deja agregar datos*/
		this.mAh = mAh;
	}
	
	public String getmAh() { /** GETTER mAh*/
		return mAh;
	}
	
	public void mostrarBateria() {
		System.out.println("Modelo Bateria: " + marca);
		System.out.println("Amperaje: " + mAh);
	}
}
