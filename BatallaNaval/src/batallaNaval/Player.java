package batallaNaval;
/**@author Benjamin Palacios, Valentina Saldias, Fernanda Zuñiga */
/** @version 21/03/23*/
public class Player {
	private int cantMisiles; 
	private int puntos;
	private int cantPortaaviones;
	private int cantBuques;
	private int cantSubmarinos;
	private int cantLanchas;
	private int cantMotos;
	
	public Player() {
		
	}
	
	public Player(int cantMisiles, int puntos, int cantPortaaviones, int cantBuques, int cantSubmarinos, int cantLanchas, int cantMotos) {
		this.cantMisiles = cantMisiles; 
		this.puntos = puntos;
		this.cantPortaaviones = cantPortaaviones;
		this.cantBuques = cantBuques;
		this.cantLanchas = cantLanchas;
		this.cantMotos = cantMotos;
	}
	
	/** @param  Cantidad de Misiles */
	public void setCantMisiles(int cantMisiles) {
		this.cantMisiles = cantMisiles; 
	}
	
	public int getCantMisiles() {
		return cantMisiles;
	}
	
	/** @param  Puntaje*/
	public void setPuntos(int puntos) {
		this.puntos = puntos; 
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	/** @param  Cantidad de Portaaviones*/
	public void setCantPortaaviones(int cantPv) {
		this.cantPortaaviones = cantPv;
	}
	
	public int getCantPortaaviones() {
		return cantPortaaviones;
	}
	
	/** @param  Cantidad de Buques*/
	public void setCantBuques(int cantB) {
		this.cantBuques = cantB;
	}
	public int getCantBuques() {
		return cantBuques;
	}
	
	/** @param  Cantidad Submarinos*/
	public void setCantSubmarinos(int cantS) {
		this.cantSubmarinos = cantS;
	}
	public int getCantSubmarinos() {
		return cantSubmarinos;
	}
	
	/** @param  Cantidad Lanchas*/
	public void setCantLanchas(int cantL) {
		this.cantLanchas = cantL;
	}
	public int getCantLanchas() {
		return cantLanchas;
	}
	
	/** @param  Cantidad de Motos de Agua*/
	public void setCantMotos(int cantM) {
		this.cantMotos = cantM;
	}
	public int getCantMotos() {
		return cantMotos;
	}
	
	public void generarMar() {
		
	}
}