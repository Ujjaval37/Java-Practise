package Exception;


 class  Testcustom extends Exception {
	 Testcustom(String s)
	{
		super(s);
	}
	
 }
	 public class Invalidage 
	{
	static void validate(int age)throws Testcustom{
			if(age<18)
				throw new Testcustom("not valid");
			else
				System.out.println("you can vote");
		}


		public static void main(String[] args)
		{
			try 
			{
				 validate(20);

			} 
			catch(Exception m)
			{System.out.println("Exception occured"+m);}
		
			System.out.println("Welcome to customer exception");
		}
	       
	}
