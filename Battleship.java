//Team Kim-chi all the Wei
//Cardy Wei, Julie Kim
//Pd 8
//Final Project

import cs1.Keyboard;

public class Battleship{

	public static int[][] finalBoard;
	public static int rowhit;
	public static int columnhit;

	public static void createBoard(int[][] board){
        for(int column=0 ; column < board.length ; column++ ){
            for(int row=0 ; row < board[0].length ; row++ ){
                board[row][column]=-1;
            }
        }
        finalBoard=board;
    }

    public static void playField(int[][] board){
      	String retStr="\t";
      	for (int x=1; x<board.length+1; x++){
      		retStr+=x+"\t";
      	}
        System.out.println(retStr);
        System.out.println();
        
        for(int row=0 ; row < board[0].length ; row++ ){
            System.out.print((row+1)+"");
            for(int column=0 ; column < board.length ; column++ ){
                if(board[row][column]==-1 || board[row][column]==2){
                    System.out.print("\t"+"[]");
                }else if(board[row][column]==0){
                    System.out.print("\t"+"|");
                }else if(board[row][column]==1){
                    System.out.print("\t"+"X");
                }
            }
            System.out.println();
        }
    }

    public static void createShips(int ships){
        int x=0;
        while (x<ships){
        	int y=(int)(finalBoard[0].length*Math.random());
        	int z=(int)(finalBoard.length*Math.random());
        	if (finalBoard[y][z]!=2){
        		finalBoard[y][z]=2;
        	}
        	x++;
        }
    }

    public static void shoot(){
        
        System.out.print("Row: ");
        rowhit = Keyboard.readInt();
        rowhit--; 
        System.out.print("Column: ");
        columnhit = Keyboard.readInt();
        columnhit--;
    }
    
    public static boolean hit(){
        boolean hit=false;
    	if (finalBoard[rowhit][columnhit]==2){
    		System.out.println("Congratz, you hit a ship!\n");
    		finalBoard[rowhit][columnhit]=1;
            hit=true;
    	}
    	else{
    		System.out.print("You missed. Try Again!\n");
    		finalBoard[rowhit][columnhit]=0;
    	}
        return hit;
    }

    public static void main(String[] args) {
        System.out.print("Now Starting Battleship!");
        System.out.print("\nPlease enter desired settings");
        System.out.print("\nSize of playing field:");
        int x=Keyboard.readInt();
        int[][] board = new int[x][x];
        System.out.print("Number of enemy ships:");
        int ships = Keyboard.readInt();
        int attempts=0;
        int ships_hit=0;
        createBoard(board);
        createShips(ships); 
        System.out.println();
        while (ships_hit<ships){
            playField(board);
            shoot(); 
            if (hit()){
                ships_hit++;
            }
            attempts++;
        }
        playField(board);
        System.out.println("\nWinner! You hit " + ships + " ships in "+attempts+" attempts!");
    }
}
