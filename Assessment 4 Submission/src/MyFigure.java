import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFigure extends JFrame
{
	private JButton invert = new JButton ("Invert");
	private JTextArea canvas = new JTextArea(Figure.BOUND,Figure.BOUND );
	private GUIFigure guif;
	
	
	MyFigure()
	{
		this.setLayout(new BorderLayout());
		this.add(invert, BorderLayout.NORTH);
		this.add(canvas, BorderLayout.CENTER);
		
		//just to set size
		this.setMinimumSize(new Dimension (200,200));
		this.setMaximumSize(new Dimension (200,200));
		this.setPreferredSize(new Dimension (200,200));
		
		guif = new GUIFigure();
		guif.setPred(new BiIntPredicate (){

			@Override
			public boolean test(int param1, int param2) {
				
				return param1 < param2;
			}
			
		});
		
		guif.setTextArea(canvas);
		
		invert.addActionListener(source -> guif.invert());
		
		this.setVisible(true);
		
	}
	
	
	
	public static void main (String [] args)
	{
		MyFigure f = new MyFigure();
	}
}
