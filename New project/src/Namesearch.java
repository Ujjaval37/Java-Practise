import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Namesearch {

	public static void main(String[] args) {
		
	       Scanner sc = new Scanner(System.in);
	       List<String> st = new ArrayList<>();
	       for(int i=0;i<=3;i++)
	       {
	    	   st.add(sc.next());
	    	   
	       }
               System.out.println("Enter the No......");
               String r = sc.next();
               System.out.println(st.indexOf(r));
	}

}
