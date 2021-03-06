import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;


public class SpaceDog extends Alien {
	/**
	 * Creates a Space Dog that, if shot, will make the player lose the game. 
	 * Space dog floats around the screen
	 * If the dog gets hit, the user loses the game.   
	 * <p>
	 * This method will add a dog into the midst of the aliens, and should the user
	 * hit the dog, they lose.  
	 *
	 * @param  name the location of the image
	 * @return      the image at the specified URL
	 * @see         Image
	 */
	private int speed;
	private Image image;

	public SpaceDog()
	{
		this(0,0,0);
	}

	public SpaceDog(int x, int y)
	{
		this(x,y,0);
	}
	
	public SpaceDog(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("/Users/theandrealiu/Desktop/AP CSA/Unit19/src/Dog.png"));
		}
		catch(Exception e)
		{
			System.out.println("Cannot open dog file.");
		}
	}
	public void setSpeed(int s)
	{
	   speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),10,10,null);
	}

	public String toString()
	{
		return super.toString()+","+getSpeed();
	}
}
