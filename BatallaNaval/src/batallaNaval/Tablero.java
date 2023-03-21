package batallaNaval;
/**@author Benjamin Palacios, Valentina Saldias, Fernanda Zuñiga */
/** @version 21/03/23*/
public class Tablero {
	private String lado;
	private String[][] matriz;
	
	public void tableroVacio() {
		matriz = new String[10][10]; //DEBUG: largo de prueba
		lado = "10";
		
		String mar = "-";
		String miss = "~";
		String hit = "*";
		
		Utilidad.escribir("\n before"); //DEBUG
		
		for(int i = 0; i < Integer.parseInt(lado) ; i++) {
			for(int j = 0; j < Integer.parseInt(lado) ; j++) {
				matriz[i][j] = "-";
			}
		}
		Utilidad.escribir("\n after"); //DEBUG
	}
}
