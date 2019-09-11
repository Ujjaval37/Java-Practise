import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
       
        System.out.println("Enter he row and column");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        String[][] city = new String[r][c];
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		city[i][j]=sc.next();
        	}
        }
        	for(int i=0;i<r;i++)
            {
            	for(int j=0;j<c;j++)
            	{
            		System.out.print(city[i][j]+"\t");
            	}
            	System.out.println();
            }
	  }
}

        
	

