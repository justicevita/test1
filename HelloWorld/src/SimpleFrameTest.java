import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;


public class SimpleFrameTest {
	public static void main(String[] args)
	{
		EventQueue.invokeLater
		(
			new Runnable()
			{
				public void run()
				{
					simpleFrame frame=new simpleFrame();
					frame.setTitle("lala");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			
			}
				
		);
		
	}

}
class simpleFrame extends JFrame
{
	public simpleFrame()
	{
		setSize(100,100);
		setIconImage(new ImageIcon("java.jpg").getImage());
		add(new simpleComponent());
	}
	
	
}
class simpleComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{	
		Graphics2D g2=(Graphics2D) g;
		g2.setPaint(new Color(100,200,100));
		g2.drawString("shashabi", 50, 50);
	}
	public simpleComponent()
	{
	setSize(50,50);	
	}

}
