import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:\t");
		int r = sc.nextInt();
		for(int i=1;i<6;i++)
		{
			for(int j=6;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;i++)
			{
				System.out.println(j+ " ");
			}
			
			System.out.println();
		 }	
	  }
   }
