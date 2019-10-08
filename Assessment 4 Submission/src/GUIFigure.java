import javax.swing.JTextArea;

public class GUIFigure extends AbstractFigure
{
	
	private JTextArea area;

	@Override
	public void printFigure()
	{
		this.area.setText(super.toString());
		
		
	}
	
	
	public void setTextArea (JTextArea a) 
	{
		this.area = a;
	}
	
	@Override
	public void invert()
	{
		super.invert();
		printFigure();
		
	}

	
}
