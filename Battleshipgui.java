//Team Kim-chi all the Wei
//Cardy Wei, Julie Kim
//Pd 8
//Final Project

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Battleshipgui extends JFrame implements ActionListener{

    public int[][] finalBoard;
    public int rowhit;
    public int columnhit;
    public int ships=5;

    public JButton[][] button;
    public GridLayout grid;

    public int attempts=0;

    public void createBoard(int[][] board){
        for(int column=0 ; column < board.length ; column++ ){
            for(int row=0 ; row < board[0].length ; row++ ){
                board[row][column]=-1;
            }
        }
        finalBoard=board;
        button=new JButton[finalBoard.length] [finalBoard.length];
		grid= new GridLayout(finalBoard.length,finalBoard.length );
    }

    public void playField(int[][] board){
		JFrame frame=new JFrame();
		JPanel panel = new JPanel();

		

		panel.setLayout(grid);
		panel.setSize(600, 600);

		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setTitle("Battleship");


		for (int x =0; x<board.length; x++){
		    for (int y =0; y<board[0].length; y++) {
			button[x][y]=new JButton("Button");
			button[x][y].addActionListener(this);
			panel.add(button[x][y]);

		    }
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);

    }

    public void createShips(int ships){
        int x=0;
        while (x<ships){
		    int y=(int)((finalBoard[0].length)*Math.random());
		    int z=(int)((finalBoard.length)*Math.random());
		    if (finalBoard[y][z]!=2){
				finalBoard[y][z]=2;
				x++;
		    }
        }
    }

    public void actionPerformed(ActionEvent event){

		for (int x=0; x<finalBoard.length;x++){
		    for (int y=0; y<finalBoard[0].length;y++){
				if (event.getSource()==button[x][y]){
				    if (finalBoard[x][y]==2){
						button[x][y].setText("Hit!");
						ships--;
						attempts++;
						if (ships==0){
							JFrame box=new JFrame();
							JOptionPane.showMessageDialog(box, "Winner! You destroyed all the ships in "+attempts+" attempts!");
						}
				    }
				    else{
						button[x][y].setText("Missed!");
						attempts++;
				    }
				}
		    }
		}
    }

    public int ships(){
		return ships;
	}

	public int attempts(){
		return attempts;
	}

    public static void main(String[] args) {
		Battleshipgui newgame= new Battleshipgui();
		JFrame box=new JFrame();
		JOptionPane.showMessageDialog(box, "This is the Battleship board game. You can choosed the size of your board and attempt to destroy the enemy's five hidden ships. Good Luck Commander! Press Ok to Continue.");
		int x = Integer.parseInt(JOptionPane.showInputDialog("Please input the board size."));
		int[][] board=new int [x][x];

		newgame.createBoard(board);
		newgame.createShips(newgame.ships()); 
		newgame.playField(board);
    }
}
