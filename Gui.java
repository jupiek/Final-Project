//GUI DEMO
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui extends JFrame implements ActionListener{

	
    JButton[][] button=new JButton[5][5];
    GridLayout grid= new GridLayout(5, 5);
    public int x;
    public int y;

    public void go(){
	JFrame frame=new JFrame();
	JPanel panel = new JPanel();

	panel.setLayout(grid);
	panel.setSize(800, 800);
	frame.add(panel);

	int[][] array= new int[5][5];
	for (x =0; x<array.length; x++){
	    for (y =0; y<array[0].length; y++) {
		button[x][y]=new JButton("Button");
		button[x][y].addActionListener(this);
		panel.add(button[x][y]);

	    }
	}

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800, 800);
	frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
	for( int x = 0; x < array.length; x ++ ) {
	    for( int y = 0; y < array[0].length; y ++ ) {
		if( event.getSource() == button[x][y] )
		    button[x][y].setText( "Clicked!" );	
	    }
	}
    }
	
    public static void main(String[] args){
	Gui gui=new Gui();
	gui.go();
    }
}
