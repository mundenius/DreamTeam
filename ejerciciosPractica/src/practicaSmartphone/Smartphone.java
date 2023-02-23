package practicaSmartphone;

public class Smartphone {
	private String marcaCel; 
	private Bateria bateria;
	private int cantChips;
	/** se delcara como un array porque pueden haber hasta dos chips por celular*/
	private Chip[] chips;

	public Smartphone() {
		bateria = new Bateria();
		/** se instancia el espacio para que quepa el arreglo de los chips*/
		chips = new Chip[2];
	}
	
	public Smartphone(String marcaCel, String marca, String mAh) {
		this.marcaCel = marcaCel;
		this.bateria = new Bateria(marca,mAh); 
		this.cantChips = 0;
		this.chips = new Chip[2];
	}

	/** SETTERS Y GETTERS DE LOS ATRIBUTOS */
	
	public void setMarcaCel(String marcaCel) {
		this.marcaCel = marcaCel; 
	}
	public String getMarcaCel() {
		return marcaCel; 
	}
	
	public void setBateria(Bateria bateria) {
		this.bateria = bateria; 
	}
	public Bateria getBateria() {
		return bateria; 
	}
	
	public void setCantChips(int cantChips) {
		this.cantChips = 0;
	}
	public int getCantChips() {
		return cantChips;
	}
	
//	public void setChip() {
//		this.chips = chips;
//	}
//	public Chip[] getChip() {
//		return chips;
//	}

	/** se declara la funcion mostrar(), muestra los datos de las clases relacinadas*/
	public void mostrar() {
		System.out.println("Marca Celular: " + marcaCel);
		bateria.mostrarBateria();
		System.out.println("Cantidad de Chips: " + cantChips);
		for (int i = 0; i < cantChips; i++) {
			chips[i].mostrarChip();
		}
	}
	/** se declara la funcion agregarChips, se crea un Chip llamado nuevoChip cuando se cumple la condicion*/
	public void agregarChips(Chip nuevoChip) {
		if (cantChips < 2) {
			chips[cantChips] = nuevoChip;
			cantChips++;
		}
	}
}

