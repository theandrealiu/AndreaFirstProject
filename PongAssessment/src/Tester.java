import javax.swing.JFrame;
import java.awt.Component;

public class Tester extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 500;

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);
		
		getContentPane().add(new BlockTestTwo());		
		
		//uncomment when you are ready to test the Ball
		getContentPane().add(new BallTestTwo());		
		
		//PaddleTestTwo padTest = new PaddleTestTwo();
		//((Component)padTest).setFocusable(true);			
		//getContentPane().add(padTest);
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();
		run.repaint();
	}
}