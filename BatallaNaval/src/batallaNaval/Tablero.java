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
		
		Utilidad.escribir("\n  ---- Bienvenido a Batalla Naval ---- \n"); //DEBUG
		
		/** Genera la matriz */
		for(int i = 0; i < Integer.parseInt(lado); i++) {
			for(int j = 0; j < Integer.parseInt(lado); j++) {
				matriz[i][j] = " - ";
			}
		}
		 /** Pinta la matriz */
		for (int i = 0; i < matriz.length; i++) {
			  for (int j = 0; j < matriz[i].length; j++) {
			    System.out.print(matriz[i][j] + "|");
			  }
			  System.out.println();
			}
//		Utilidad.escribir("\n after"); //DEBUG
	}
}
