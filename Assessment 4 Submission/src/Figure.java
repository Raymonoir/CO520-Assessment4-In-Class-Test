
public class Figure extends AbstractFigure
{
	
	//Could remove most methods as provided by superclass however not requested to "clean up" by specification
	
	private BiIntPredicate pred = new BiIntPredicate ()
	{

		@Override
		public boolean test(int param1, int param2) {
			return false;
		}

	};
	
	public static int BOUND = 7;
	
	
	
	public BiIntPredicate getPred()
	{
		return this.pred;
	}
	
	public void setPred(BiIntPredicate b)
	{
		this.pred = b;
	}
	
	public static BiIntPredicate negate (BiIntPredicate x)
	{
		return new BiIntPredicate ()
				{

					@Override
					public boolean test(int param1, int param2) {
						return !(x.test(param1, param2));
					}
			
				};
	}
	
	public void invert()
	{
		this.pred = negate(this.pred);
	}
	
	
	public String toString () 
	{
		String returnStr = "";
		
		for (int i=1; i<=BOUND; i++) 
		{
			
			for (int j=1; j<=BOUND; j++) 
			{
				if (this.pred.test(i,j))
					{
					returnStr += "*";
			
					}
			else 
				{
					returnStr += " ";
				}
			}
			returnStr += "\n";
			}
		
		return returnStr;
		
	}
	
	
	public void printFigure()
	{
		System.out.println(this.toString());
		
	}
	
	
	public static void main (String [] args)
	{
		Figure f = new Figure();
		//f.invert();
		f.printFigure();
	}
	
	
}
