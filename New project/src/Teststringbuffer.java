public class Teststringbuffer 
{

	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("this is string buffer");
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer(50);
		sb2.append(50);
		System.out.println(sb2);	
	}
}
