import java.awt.*;
import java.applet.*;


public class AppletBasics extends Applet	
//Every applet must be inherit from the base class Applet

{
	int x1=70,y1=70;
	int x2=60,y2=60;
	int x3=50,y3=50;
		
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		//fillRect(int x,int y , int width, int height
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(Color.blue);
		//Fill Oval(int x,int y, int width, int height);
		g.fillOval(x1,y1,30,30);
		
		g.setColor(Color.black);
		g.fillOval(x2,y2,30,30);


		g.setColor(Color.yellow);
		g.fillOval(x3,y3,30,30);

		for(int i=0;i<20;i++)
		{
			x1++;  	// values will be in increment
			y1++;
			x2++;
			y3++;
			
			
			repaint();	//It is used to called paint method

			try
			{
				Thread.sleep(20);

			}
			catch(Exception e)
			{

			}
		}		

	}
}







/*
<applet code="AppletBasics" width=500 height=500>
</applet>
*/