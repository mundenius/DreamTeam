package battleShip;
import java.util.*;

public class BattleShips {
    public static int numRows = 15;
    public static int numCols = 15;
    public static int computerShips;
    public static String[][] grid = new String[numRows][numCols];
    public static int[][] missedGuesses = new int[numRows][numCols];

    public static void main(String[] args){
        System.out.println("**** Bienvenido al BATTLESHIP ****");
        System.out.println("Ahora el oceano esta vacio\n");

        //crear mapa en blanco
        createOceanMap();

        //la maquina genera barcos de forma random
        deployComputerShips();

        //parte el juego dejando lanzar huevos
        do {
            Battle();
        }while(BattleShips.computerShips != 0);

    }

    public static void createOceanMap(){
        //Seccion de arriba del mapa
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
                System.out.print(i);
        System.out.println();

        //Seccion del medio del mapa
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "  ";
                if (j == 0)
                    System.out.print(i + "|" + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        //seccion de abajo del mapa
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }

      public static void deployComputerShips(){
        System.out.println("\nComputer is deploying ships");
        //se asignan lugares random a los barcos
        BattleShips.computerShips = 5;
        for (int i = 1; i <= BattleShips.computerShips; ) {
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);

            if((x >= 0 && x < numRows) && (y >= 0 && y < numCols) && (grid[x][y] == "  "))
            {
                grid[x][y] =   "x";
                System.out.println(i + ". ship DEPLOYED");
                i++;
            }
        }
        printOceanMap();
    }

    public static void Battle(){
        playerTurn();
        printOceanMap();

        System.out.println("Computer ships: " + BattleShips.computerShips);
        System.out.println();
    }

    public static void playerTurn(){
        System.out.println("\nEs tu turno de lanzar huevos");
        int x = -1, y = -1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa la coordenada X: ");
            x = input.nextInt();
            System.out.print("Ingresa la coordenada Y: ");
            y = input.nextInt();

            if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols)) //valid guess
            {
                if (grid[x][y] == "x") //if computer ship is already there; computer loses ship
                {
                    System.out.println("Boom! Le achutaste a un barco");
                    grid[x][y] = "!"; //Hit mark
                    --BattleShips.computerShips;
                }
                }
                else if (grid[x][y] == " ") {
                    System.out.println("Sorry, no golpeaste nada");
                    grid[x][y] = "-";
                }
                else if ((x < 0 || x >= numRows) || (y < 0 || y >= numCols))  //invalid guess
                	System.out.println("No puedes poner coordenadas que no se encuentran dentro del tablero");
            }
        while((x < 0 || x >= numRows) || (y < 0 || y >= numCols));  //keep re-prompting till valid guess
    }

    public static void printOceanMap(){
        System.out.println();
        //primera seccion del mapa con los carros
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

        // seccion del medio del mapa con los carros
        for(int x = 0; x < grid.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < grid[x].length; y++){
                System.out.print(grid[x][y]);
            }

            System.out.println("|" + x);
        }

        // seccion de abajo del mapa con los carros
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }
}