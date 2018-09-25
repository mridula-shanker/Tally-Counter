/**
 * 
 * @author mshanker22
 *
 */
public class TallyCounter 
{
	//feilds
	private int count;
	
	//constructers
	public TallyCounter()
	
	{
		count= 0;
	}

	public TallyCounter(int a)
	{
		count= a;
	}
	//methods
	
	public void click()
	{
		count++; //count = count + 1
				//count+ = 1
		
	
	}
	
	public int getCount()
	
	{
		return count;
	}

	public void unclick()
	{
		count--;
	}


	public void reset()
	
	{
		count=0;
	}

}

