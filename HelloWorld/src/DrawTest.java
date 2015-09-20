import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;
import javax.swing.*;
public class DrawTest {

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					JFrame frame=new ButtonFrame();
					frame.setTitle("Õº–Œ≤‚ ‘");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					JFrame frame1=new DrawFrame();
					frame1.setTitle("Õº–Œ≤‚ ‘");
					frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame1.setVisible(true);
				}
			}
							  );

	}

}
class DrawFrame extends JFrame{
	public DrawFrame()
	{
		add(new DrawComponent());
		setSize(100,200);
		setIconImage(new ImageIcon("java.jpg").getImage());
		this.getContentPane().setBackground(Color.YELLOW);
	};
}
class DrawComponent extends JComponent{
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	public void paintComponent(Graphics g)
	{	
		Font zi=new Font("SansSerif",Font.BOLD,14);
		g.setFont(zi);
		String a="shahaiggggggg";
		Graphics2D g2=(Graphics2D) g;
		FontRenderContext context=g2.getFontRenderContext();
		Rectangle2D bounds=zi.getStringBounds(a,context);
		double x=(getWidth()-bounds.getWidth())/212;
		double y=(getHeight()-bounds.getHeight())/2;
		double ascent=-bounds.getY();
		double baseY=y+ascent;
		g2.drawString(a, (int)x, (int)baseY);
		g2.setPaint(new Color(100,200,100));
		g2.draw(new Line2D.Double(x,baseY,x+bounds.getWidth(),baseY));
		Rectangle2D rect=new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
		g2.draw(rect);
	}
	public Dimension getPreferredSize(){return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);};
}

