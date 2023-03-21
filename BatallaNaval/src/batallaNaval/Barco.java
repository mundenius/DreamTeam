package batallaNaval;

public class Barco implements Interfaz{
	
	private int vida; 
	private int armadura;
	private int x,y;
	private String orientacionBarco;
	
	public Barco() {
	}
	
	public Barco(int vida, int armadura,  int x, int y, String orientacionBarco) {
		this.vida = vida;
		this.armadura = armadura;
		this.x = x;
		this.y = y;
		this.orientacionBarco = orientacionBarco;		
	}
	
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getOrientacionBarco() {
		return orientacionBarco;
	}

	public void setOrientacionBarco(String orientacionBarco) {
		this.orientacionBarco = orientacionBarco;
	}

	
	public void ponerHorizontal() {
	}
	
	public void ponerVertical() {
	}
	
	@Override
	public String toString() {
		return "Barco [vida=" + vida + ", armadura=" + armadura + ", x=" + x + ", y=" + y + ", orientacionBarco="
				+ orientacionBarco + "]";
	}

	@Override
	public void lanzarMisil() {
	}	
}
