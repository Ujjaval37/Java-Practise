
public class Abd 
	
	{
	
	int x = 10;
	static int y = 10;
	public Abd()
	{
	x++;
	
	System.out.println("x output is" + (x));
      y++;
	
	System.out.println("y output is" + (y++));
	}
	public static void main (String args[])
	{
		Abd a1 = new Abd();
		Abd a2 = new Abd();
		Abd a3 = new Abd();
		Abd a4 = new Abd();

 }
	
}