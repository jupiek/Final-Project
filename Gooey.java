import javax.swing.*;

public class Gooey extends JFrame {

    public Gooey() {
	setDefaultCloseOperation( EXIT_ON_CLOSE );
	setSize( 800, 800 );
	setTitle( "Battleship" );
	setVisible( true );
    }

    public static void main( String[] args ) {

	Gooey Battleship = new Gooey();
	JPanel panel = new JPanel();
	JButton button = new JButton( "Click" );
	panel.add( button );
	Battleship.add(panel);

    }
    
}
