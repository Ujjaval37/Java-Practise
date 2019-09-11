
public class CalArea {
	public void area(int l,int b)
	{
		System.out.println("area of rang.. is "+ (l*b));
	}
	public void area(double h,double b)
	{
		System.out.println("area of tra.. is"+ (0.5*h*b));
	}
	public void Area(double r)
	{
		System.out.println("area of circle"+ (3.14*r*r));
	}
	public static void main (String args[])
	{
		CalArea a1 = new CalArea();
		a1.area(1,2);
		a1.area(4,2.66);
		a1.Area(4.1);
	}
	
}
