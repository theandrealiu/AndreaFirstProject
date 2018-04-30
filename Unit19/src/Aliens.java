import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;



public class Aliens extends SpaceDog{
Alien[][] manyAliens;
private int speed;
private Image image;
private Image image2;
public Alien c;
public int column = (int) (Math.random()*3);
public int rows = (int) (Math.random()*3);

public Aliens(){
	manyAliens= new Alien[4][4];
	int xPos=10;
	int yPos=10;
	try
	{
		image = ImageIO.read(new File("/Users/theandrealiu/Desktop/AP CSA/Unit19/src/alien.jpg"));
		image2 = ImageIO.read(new File("/Users/theandrealiu/Desktop/AP CSA/Unit19/src/Dog.png"));
	}
	catch(Exception e)
	{
		System.out.println("Cannot open alien file.");
	}
	for(int row=0;row<manyAliens.length;row++){
		for(int col=0; col<manyAliens[0].length; col++){
			setSpeed(5);
			manyAliens[row][col]=new Alien(xPos, yPos, speed);
			xPos+=100;
		}
		manyAliens[rows][column] = new SpaceDog(xPos,yPos,speed);
		xPos=10;
		yPos+=100;
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
	for(Alien[] row: manyAliens){
		for(Alien a: row){
		   	window.drawImage(image,a.getX(),a.getY(),80,80,null);
		}
	}
	
}
public Alien[][] returnAliens(){
	return manyAliens;
}
}