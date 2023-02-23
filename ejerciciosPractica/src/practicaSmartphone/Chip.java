package practicaSmartphone;

public class Chip {
	/** se definen los atributos de la clase*/
	private String empresa;
	private int numero; 
	
	/** metodo constructor vacio*/
	public Chip() {
		
	}
	
	/** metodo constructor con los atributos como parametros */
	public Chip(String empresa, int numero) {
		this.empresa = empresa ; 
		this.numero = numero; 
	}
	
	public void setEmpresa(String empresa) {	/** SETTER empresa */
		this.empresa = empresa;
	}
	
	public String getEmpresa() { /** GETTER empresa */
		return empresa; 
	}
	
	public void setNumero(int numero) {	/** SETTER numero */
		this.numero = numero; 
	}
	public int getNumero() { /** GETTER numero */
		return numero; 
	}
	
	public void mostrarChip() {
		System.out.println("Empresa Chip: " + empresa);
		System.out.println("Numero de Chip: " + numero);
	}
}
