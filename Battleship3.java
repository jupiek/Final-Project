//Team Kim-chi all the Wei
//Cardy Wei, Julie Kim
//Pd 8
//Final Project

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Battleship3 extends JFrame implements ActionListener{

    public int[][] finalBoard;

    public JButton[][] button;
    public GridLayout grid;

    public int attempts=0;

    public int carrier=5;
    public int destroyer=4;
    public int submarine=3;
    public int patrol=2;
    public int cruiser=6;

    public int carriersize=5;
    public int destroyersize=4;
    public int submarinesize=3;
    public int patrolsize=2;
    public int cruisersize=4;

    public int totalships=18;

    public String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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
	JPanel panel2= new JPanel();
	JPanel panel3= new JPanel();
	JPanel panel4=new JPanel();
	JPanel panel5=new JPanel();

	GridLayout grid2=new GridLayout(1, board.length);
	GridLayout grid3=new GridLayout(board.length, 1);

	panel.setLayout(grid);
	panel2.setLayout(grid2);
	panel3.setLayout(grid3);
	panel4.setLayout(grid2);
	panel5.setLayout(grid3);

	frame.setTitle("Battleship");

	panel2.add(new JPanel());
	panel4.add(new JPanel());

	for (int x =0; x<board.length; x++){
	    for (int y =0; y<board[0].length; y++) {
		button[x][y]=new JButton();
		button[x][y].addActionListener(this);
		panel.add(button[x][y]);
	    }
	    panel2.add(new JLabel(Integer.toString(x+1)));
	    panel3.add(new JLabel("  "+letters.substring(x, x+1)+"  "));
	    panel4.add(new JLabel(Integer.toString(x+1)));
	    panel5.add(new JLabel("  "+letters.substring(x,x+1)+"  "));
	}

	frame.getContentPane().add(BorderLayout.CENTER, panel);
	frame.getContentPane().add(BorderLayout.NORTH, panel2);
	frame.getContentPane().add(BorderLayout.WEST, panel3);
	frame.getContentPane().add(BorderLayout.SOUTH, panel4);
	frame.getContentPane().add(BorderLayout.EAST, panel5);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800, 800);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    }

    public int carrier(){return carriersize;}
    public int cruiser(){return cruisersize;}
    public int destroyer(){return destroyersize;}
    public int submarine(){return submarinesize;}
    public int patrol(){return patrolsize;}

    public int carrierNo(){return carrier;}
    public int cruiserNo(){return cruiser;}
    public int destroyerNo(){return destroyer;}
    public int submarineNo(){return submarine;}
    public int patrolNo(){return patrol;}

    public void buildship(int shipsize, int ship){
	int direction=(int)(2*Math.random());
		
	int size=0;
	if (direction==0){
	    int y=(int)(((finalBoard[0].length)-shipsize)*Math.random());
	    int z=(int)(((finalBoard.length))*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=ship;}
	    while (size<shipsize){
		if (finalBoard[y+1][z]==-1){
		    finalBoard[y][z]=ship;
		    y++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==ship){
				finalBoard[a][b]=-1;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length)-shipsize)*Math.random());
		    z=(int)(((finalBoard.length))*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=ship;}
		}
	    }
	}
	else{
	    int y=(int)(((finalBoard[0].length))*Math.random());
	    int z=(int)(((finalBoard.length)-shipsize)*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=ship;}
	    while (size<shipsize){
		if (finalBoard[y][z+1]==-1){
		    finalBoard[y][z]=ship;
		    z++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==ship){
				finalBoard[a][b]=-1;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length))*Math.random());
		    z=(int)(((finalBoard.length)-shipsize)*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=ship;}
		}
	    }
	}
    }

    public void actionPerformed(ActionEvent event){
	for (int x=0; x<finalBoard.length;x++){
	    for (int y=0; y<finalBoard[0].length;y++){
		if (event.getSource()==button[x][y]){
		    if (finalBoard[x][y]==5){
			button[x][y].setText("Hit Carrier!");
			button[x][y].setBackground(Color.RED);
			finalBoard[x][y]=-2;
			carriersize--;
			attempts++;
			totalships--;
			if (carriersize==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You destroyed the enemy's Carrier!");
			}
			if (totalships==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You win! You destroyed all enemy ships in "+attempts+" attempts.");
			}
		    }
		    else if (finalBoard[x][y]==6){
			button[x][y].setText("Hit Cruiser!");
			button[x][y].setBackground(Color.RED);
			finalBoard[x][y]=-2;
			cruisersize--;
			attempts++;
			totalships--;
			if (cruisersize==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You destroyed the enemy's Cruiser!");
			}
			if (totalships==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You win! You destroyed all enemy ships in "+attempts+" attempts.");
			}
		    }
		    else if (finalBoard[x][y]==4){
			button[x][y].setText("Hit Destroyer!");
			button[x][y].setBackground(Color.RED);
			finalBoard[x][y]=-2;
			destroyersize--;
			attempts++;
			totalships--;
			if (destroyersize==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You destroyed the enemy's Destroyer!");
			}
			if (totalships==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You win! You destroyed all enemy ships in "+attempts+" attempts.");
			}
		    }
		    else if (finalBoard[x][y]==3){
			button[x][y].setText("Hit Submarine!");
			button[x][y].setBackground(Color.RED);
			finalBoard[x][y]=-2;
			submarinesize--;
			attempts++;
			totalships--;
			if (submarinesize==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You destroyed the enemy's Submarine!");
			}
			if (totalships==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You win! You destroyed all enemy ships in "+attempts+" attempts.");
			}
		    }
		    else if (finalBoard[x][y]==2){
			button[x][y].setText("Hit Patrol Boat!");
			button[x][y].setBackground(Color.RED);
			finalBoard[x][y]=-2;
			patrolsize--;
			attempts++;
			totalships--;
			if (patrolsize==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You destroyed the enemy's Patrol Boat!");
			}
			if (totalships==0){
			    JFrame box=new JFrame();
			    JOptionPane.showMessageDialog(box, "You win! You destroyed all enemy ships in "+attempts+" attempts.");
			}
		    }
		    else if(finalBoard[x][y]==-2){
			JFrame box=new JFrame();
			JOptionPane.showMessageDialog(box, "You already attacked this area.");
		    }
		    else{
			button[x][y].setText("Missed!");
			button[x][y].setBackground(Color.BLUE);
			button[x][y].setForeground(Color.WHITE);
			attempts++;
			finalBoard[x][y]=-2;
		    }	
		}	
	    }
	}	
    }

    public static void main(String[] args) {
	int x;
	Battleship3 newgame= new Battleship3();
	JFrame box=new JFrame();
	JOptionPane.showMessageDialog(box, "This is the Battleship board game. Choose the size of your board and destroy the enemy. Good Luck Commander! Press Ok to Continue.");
	x = Integer.parseInt(JOptionPane.showInputDialog("Please input the board size."));
	while (x<7 || x>26){
	    JOptionPane.showMessageDialog(box, "Please input a size between 10 and 26.");
	    x = Integer.parseInt(JOptionPane.showInputDialog("Please input the board size."));
	}
	int[][] board=new int [x][x];

	newgame.createBoard(board);
	newgame.buildship(newgame.carrier(), newgame.carrierNo());
	newgame.buildship(newgame.cruiser(), newgame.cruiserNo());
	newgame.buildship(newgame.destroyer(), newgame.destroyerNo());
	newgame.buildship(newgame.submarine(), newgame.submarineNo());
	newgame.buildship(newgame.patrol(), newgame.patrolNo());
	newgame.playField(board);
    }
}
