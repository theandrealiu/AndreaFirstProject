//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(1500,1500);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      Robot robot = new Robot();
      robot.head(window);
      robot.upperBody(window);
      robot.lowerBody(window);
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 200, 200, 100);


		//add more code here
      window.setColor(Color.RED);
      window.fillOval(350, 225, 25, 25);
      window.fillOval(440, 225, 25, 25);
      window.setColor(Color.PINK);
      window.fillOval(395, 250, 13, 10);
      window.setColor(Color.BLACK);
      window.fillRect(360, 270, 80, 10);
				
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.BLUE);
	   
	   window.fillRect(350, 300, 100, 200);
	   

		//add more code here
	   window.setColor(Color.BLACK);
	   window.drawLine(350, 370, 250, 250);
	   window.drawLine(450, 370, 550, 250);
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.GREEN);
	   
	   window.fillRect(300, 400, 200, 200);

		//add more code here
	   window.setColor(Color.BLACK);
	   window.fillRect(350, 400, 20, 200);
	   window.fillRect(430, 400, 20, 200);
	   window.drawLine(300, 600, 250, 700);
	   window.drawLine(500, 600, 550, 700);
	  

   }
   
   
  
}