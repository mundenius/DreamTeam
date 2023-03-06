package battleShipDificultades;

import java.util.Scanner;
import java.util.Scanner;

public class ActionGame {
	BattleShip gameboard1 = new BattleShip();
	Scanner input = new Scanner(System.in);
	
	public void startGame(){
		
		gameboard1.difficultyInfo();
		gameboard1.createShipArray();
		gameboard1.fillBoard();
		gameboard1.positionShips();
		gameboard1.outputGame();
		gameboard1.endGame();
	}
	
	
}