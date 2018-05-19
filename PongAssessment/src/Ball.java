import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y){
		super(x, y);
		setXSpeed(3);
		setYSpeed(1);
	}
	public Ball(int x, int y, int w, int h){
		super(x, y, w, h);
		setXSpeed(3);
		setYSpeed(1);
	}
	public Ball(int x, int y, int w, int h, Color col){
		super(x, y, w, h, col);
		setXSpeed(3);
		setYSpeed(1);
	}
	public Ball(int x, int y, int w, int h, Color col, int xS, int yS){
		super(x, y, w, h, col);
		setXSpeed(xS);
		setYSpeed(yS);
	}
   //add the set methods
	public void setXSpeed(int xS){
		xSpeed = xS;
	}
	public void setYSpeed(int yS){
		ySpeed = yS;
	}
	public void moveAndDraw(Graphics window)
	{
   	//draw a white ball at old ball location
		Color temp = getColor();
		draw(window, Color.WHITE);
		setX(getX()+xSpeed);
		//setY
		setY(getY()+ySpeed);
		//draw the ball at its new location
		draw(window, temp);
	}
   
	public boolean equals(Object obj)
	{
		Ball ob = (Ball) obj;
		return super.equals(ob) &&
				xSpeed == ob.xSpeed &&
				ySpeed == ob.ySpeed;
	}   

   //add the get methods
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}
   //add a toString() method
	public String toString(){
		return super.toString() + " " + getXSpeed() + " " + getYSpeed();
	}
	
	public boolean didCollideLeft(Object obj){
		Block ob = (Block) obj;
		if (getX() > ob.getX() && getX() <= ob.getX() + ob.getWidth() && (getY() >= ob.getY() && getY() + getHeight() <= ob.getY() + ob.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideRight(Object obj){
		Block ob = (Block)obj;
		if (getX() < ob.getX() && getX() + getWidth() >= ob.getX() && (getY() >= ob.getY() && getY() + getHeight() <= ob.getY()+ob.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block ob = (Block)obj;
		if (getY()+getHeight() >= ob.getY() && getY() < ob.getY()+ob.getHeight() && (getX()>=ob.getX() && getX()+getWidth()<=ob.getX()+ob.getWidth())){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj){
		Block ob = (Block)obj;
		if (getY() <= ob.getY()+ob.getHeight() && getY()+getHeight() > ob.getY() && (getX()>=ob.getX() && getX()+getWidth()<=ob.getX()+ob.getWidth())){
			return true;
		}
		return false;
	}
}