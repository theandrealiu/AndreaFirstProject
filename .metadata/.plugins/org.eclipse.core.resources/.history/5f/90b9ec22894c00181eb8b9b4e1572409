import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	private int score;
	
	private ArrayList<Alien> aliens;
	private ArrayList<SpaceDog> dogs;
	private ArrayList<Ammo> shots;
	//private ArrayList<Ammo> shots2;

	private Random r;
	private Aliens squad;
	private boolean[] keys;
	private BufferedImage back;
	private SpaceDogs pup;

	public OuterSpace()
	{
		setBackground(Color.black);
		score=0;
		keys = new boolean[5];
		r=new Random();
		//instantiate other stuff
		ship=new Ship(300,400,3);
		aliens=new ArrayList<Alien>();
		shots=new ArrayList<Ammo>();
		//shots2=new ArrayList<Ammo>();
		dogs = new ArrayList<SpaceDog>();

		aliens.add(new Alien(100,100,3));
		aliens.add(new Alien(200,100,3));
		squad=new Aliens();
		dogs.add(new SpaceDog(150,100,10));
		pup=new SpaceDogs();
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;

		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		squad.draw(graphToBack);
		pup.draw(graphToBack);
		for(Ammo s: shots){
			s.draw(graphToBack);
		}
		
		boolean  first=true;
		int click=0;
		for(Alien[] row: squad.returnAliens()){
			for(Alien a: row){
			   	a.move("LEFT");
			}

		}
		
		for(SpaceDog[] rows: pup.returnDogs()){
			for(SpaceDog c: rows){
			   	c.move("RIGHT");
			}

		}
		
		for(Alien a: aliens){
			a.move("LEFT");
		}
		
		for(SpaceDog c: dogs){
			c.move("LEFT");
		}
		
		first=false;
		if(ship.getX()+10>0){
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		}
		if(ship.getX()<700){
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		}
		if(ship.getY()>0){
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		}
		if(ship.getY()<440){
		if(keys[3] == true)
		{
			ship.move("DOWN");

		}
		}
		
		if(keys[4] == true)
		{
			shots.add(new Ammo(ship.getX(),ship.getY(),5));
			keys[4]=false;

		}
		
		for(Alien a: aliens){
			if(a.getX()<0 || a.getX()>750){
				a.setSpeed(-a.getSpeed());
			}			
			
		}
		for(Alien[] row: squad.returnAliens()){
			for(Alien a: row){
				if(a.getX()<0 || a.getX()>750){
					a.setSpeed(-a.getSpeed());
				}			
				}

		}
		
		for(SpaceDog c: dogs){
			if(c.getX()<0 || c.getX()>750){
				c.setSpeed(-c.getSpeed());
			}
		
		for(SpaceDog[] rows: pup.returnDogs()){
			for(SpaceDog c1: rows){
				if(c1.getX()<0 || c1.getX()>750){
					c1.setSpeed(-c1.getSpeed());
				}			
				}

		}
		for(Ammo s: shots){
			if(s.getY()<-10){
				s.setSpeed(0);
			}
		}
		
		for(Ammo s: shots){
			for(SpaceDog c1: dogs){
				if(s.getY()==c1.getY()+80 && (s.getX()>=c1.getX() && s.getX()<c1.getX()+80)){
					c1.setPos(-100, -100);
				}
			}
		}
		
		for(Ammo s: shots){
			for(SpaceDog[] rows: pup.returnDogs()){
				for(SpaceDog c1: rows){
					if((s.getY()<=c1.getY()+80 && s.getY()>=c1.getY()+50)&& (s.getX()>=c1.getX()-40 && s.getX()<c1.getX()+50)){
						s.setPos(-100, -100);
						c1.setPos(-100, -100);
						score = 0;
					}
					}
			}
		}
		
		for(Ammo s: shots){
			for(Alien a: aliens){
				if(s.getY()==a.getY()+80 && (s.getX()>=a.getX() && s.getX()<a.getX()+80)){
					a.setPos(-100, -100);
				}
			}
		}
		
		for(Ammo s: shots){
			for(Alien[] row: squad.returnAliens()){
				for(Alien a: row){
					if((s.getY()<=a.getY()+80 && s.getY()>=a.getY()+50)&& (s.getX()>=a.getX()-40 && s.getX()<a.getX()+50)){
						s.setPos(-100, -100);
						a.setPos(-100, -100);
						score++;
					}
					}

			}
		}
		
		/*if(r.nextInt(1000000)%100==0){
;
			for(Alien[] row: squad.returnAliens()){
				for(Alien a: row){
					if(r.nextInt(5)==0){
					shots2.add(new Ammo(a.getX(),a.getY(),-2));
					}
				}
			}

		}
		
		
		for(Ammo s: shots2){
			if(s.getY()+20>=ship.getY() && s.getY()<=ship.getY()+80){
				if(ship.getX()-25<s.getX() && ship.getX()+30>s.getX()){
					s.setPos(-100, -100);
					ship.setPos(360,500);
					score-=1;
				}
			}
		}*/
		//experimental collide
		/*if( getX() + getWidth()>= temp.getX()-getXSpeed()){
			if(getY()>=temp.getY() && getY()<=temp.getY()+temp.getHeight()){
				if( ball.getX() >= rightWall.getX()- Math.abs(ball.getXSpeed())){
					
				}			}
			if(getY() +getHeight() >= temp.getY() && getY()+getHeight()<=temp.getY()+temp.getHeight()){
				if( ball.getX() >= rightWall.getX()- Math.abs(ball.getXSpeed())){
					
				}			}
			}
		}
		*/

		//experimental collide

		graphToBack.drawString("Points: "+score, 300, 500);
		if(score == 16){
			graphToBack.drawString("YOU WIN", 300, 550);
		}
		if(score == 0){
			graphToBack.drawString("YOU KILLED THE DOG! YOU LOSE", 300, 550);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		}
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}