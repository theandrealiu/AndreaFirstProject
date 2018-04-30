import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
public class AlienAmmo extends MovingThing {
	/**
	 * Allows aliens to shoot back at the ship. If the ship gets hit, the user dies.  
	 * <p>
	 * This method will add a dog into the midst of the aliens, and should the user
	 * hit the dog, they lose.  
	 *
	 * @param  name the location of the image
	 * @return      the image at the specified URL
	 * @see         Image
	 */
	private int speed;
	public AlienAmmo()
	{
		this(0,0,0);
	}

	public AlienAmmo(int x, int y)
	{
		this(x,y,0);	
	}

	public AlienAmmo(int x, int y, int s)
	{
		super(x,y);
		setSpeed(s);
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
		window.setColor(Color.RED);
		window.fillRect(getX()+40,getY(),10,10);
		move("DOWN");	
}

	public String toString()
	{
		return "";
	}
	
}
