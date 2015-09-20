import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonFrame extends JFrame
{
	private JPanel buttonPanel;
	private static final int WIDTH=300;
	private static final int height=300;
	
	public ButtonFrame()
	{	
		setSize(WIDTH,height);
		JButton yellowButton=new JButton("»ÆÉ«");
		JButton blueButton=new JButton("lanÉ«");
		JButton redButton=new JButton("hong");
		buttonPanel=new JPanel();
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		add(buttonPanel);
		wondows a=new wondows();
		ColorAction yellowAction=new ColorAction(Color.yellow);
		ColorAction blueAction=new ColorAction(Color.blue);
		ColorAction redAction=new ColorAction(Color.red);
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
		addWindowListener(a);
		
	}
	private class ColorAction implements ActionListener
	{
		private Color backgroundColor;
		public ColorAction(Color c)
		{
			backgroundColor=c;
		}
		public void actionPerformed(ActionEvent event)
		{	
			buttonPanel.setBackground(backgroundColor);
			
		}
	}
	private class wondows extends WindowAdapter
	{
		public void windowOpened(WindowEvent e)
		{
			buttonPanel.setBackground(Color.black);
			
		}
	}
}
