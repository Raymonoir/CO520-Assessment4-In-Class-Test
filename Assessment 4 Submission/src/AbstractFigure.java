
public abstract class AbstractFigure 
{
	private BiIntPredicate pred = new BiIntPredicate ()
	{

		@Override
		public boolean test(int param1, int param2) {
			return false;
		}

	};
	
	private static int BOUND = 7;
	
	
	
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
						return !x.test(param1, param2);
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
	public abstract void printFigure();

}
