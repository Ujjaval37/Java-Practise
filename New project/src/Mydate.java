
public class Mydate {
	private int day;
	private int month;
	private int year;
	public Mydate(int d,int m,int y)
	{
		
		this.day=d;
		this.month=m;
		this.year=y;
	}
        
	public boolean equals(Object o)
	{
		boolean result = false;
		if((o!=null) && (o instanceof Mydate))
		{
			Mydate d = (Mydate)o;
			if((day==d.day) && (month == d.month) && (year == d.year))
       {
	     result = true;
       }
      }
		return result;
	}
	/*public int hashcode()
	{
		System.out.println("ss");
		return(day^month^year);
	} */
}