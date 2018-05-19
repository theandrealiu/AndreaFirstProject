import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private List<Block> blocks = new ArrayList<Block>();
	private BufferedImage back;
	private Wall top, bottom, left, right;
	private int level = 1;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(380, 265, 10, 10, Color.GRAY, 3, 1);
		
		paddle = new Paddle(375, 250, 40, 40, 3);
		keys = new boolean[4];
		
		top = new Wall(0, 0, 800, 10, Color.RED);
		bottom = new Wall(0, 544, 800, 10, Color.RED);
		left = new Wall(0, 10, 10, 541, Color.RED);
		right = new Wall(775, 10, 10, 541, Color.RED);
		for (int i = 60; i < right.getX() - 40; i += 40) {
			blocks.add(new Block(i, 20, 30, 10));
			blocks.add(new Block(i, 520, 30, 10));
			blocks.add(new Block(i, 40, 30, 10));
			blocks.add(new Block(i, 500, 30, 10));
		}
		for (int i = 20; i < bottom.getY() - 20; i += 40) {
			blocks.add(new Block(20, i, 10, 30));
			blocks.add(new Block(40, i, 10, 30));
			blocks.add(new Block(760, i, 10, 30));
			blocks.add(new Block(740, i, 10, 30));		
		}
		


    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		for (Block block : blocks) {
			block.draw(graphToBack);
		}
		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		top.draw(graphToBack);
		bottom.draw(graphToBack);
		left.draw(graphToBack);
		right.draw(graphToBack);

		graphToBack.setColor(Color.RED);
		graphToBack.drawString("Level " + level, 300, 80);
		

		if (ball.didCollideTop(top) || ball.didCollideBottom(bottom)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.didCollideLeft(left) || ball.didCollideRight(right)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if (ball.didCollideBottom(paddle) || ball.didCollideTop(paddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.didCollideLeft(paddle) || ball.didCollideRight(paddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		try {
			for (Block block : blocks) {
				if (ball.didCollideBottom(block) || ball.didCollideTop(block)) {
					block.setColor(Color.WHITE);
					block.draw(graphToBack);
					blocks.remove(block);
					ball.setYSpeed(-ball.getYSpeed());
				}
				if (ball.didCollideRight(block) || ball.didCollideLeft(block)) {
					block.setColor(Color.WHITE);
					block.draw(graphToBack);
					blocks.remove(block);
					ball.setXSpeed(-ball.getXSpeed());
				}
			}
		} catch(Exception e) {}
		if(keys[0] == true && paddle.getY() > 10) {
			paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true && paddle.getY() < 503) {
			paddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true && paddle.getX() < 734) {
			paddle.moveRightAndDraw(graphToBack);
		}
		if(keys[3] == true && paddle.getX() > 10) {
			paddle.moveLeftAndDraw(graphToBack);
		}
		
		if (blocks.size() == 0) {
			for (int i = 60; i < right.getX() - 40; i += 40) {
				blocks.add(new Block(i, 20, 30, 10));
				blocks.add(new Block(i, 520, 30, 10));
				blocks.add(new Block(i, 40, 30, 10));
				blocks.add(new Block(i, 500, 30, 10));
			}
			for (int i = 20; i < bottom.getY() - 20; i += 40) {
				blocks.add(new Block(20, i, 10, 30));
				blocks.add(new Block(40, i, 10, 30));
				blocks.add(new Block(760, i, 10, 30));
				blocks.add(new Block(740, i, 10, 30));		
			}
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Level " + level, 300, 80);
			level++;
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("Level " + level, 300, 80);
			ball.setX(380);
			ball.setY(265);
			paddle.setX(375);
			paddle.setY(250);
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}

    public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=true; break;
			case 'K' : keys[1]=true; break;
			case 'L' : keys[2]=true; break;
			case 'J' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=false; break;
			case 'K' : keys[1]=false; break;
			case 'L' : keys[2]=false; break;
			case 'J' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}