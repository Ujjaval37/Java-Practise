import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Testequals {

	public static void main(String[] args) {
	
		
		/*List<String> l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");*/
		CalArea c = new CalArea();
		CalArea ca = new CalArea();
		//System.out.println(c.hashCode());
		//System.out.println(ca.hashCode());
		
		  Mydate date1 = new Mydate(2,3,2011);
		  Mydate date2 = new Mydate(2,3,2011);
		  date1 = date2;
		  System.out.println(date1.hashCode());
		  System.out.println(date2.hashCode());
		  if(date1==date2)
		  {
			  System.out.println("date is identical to date 2"); 
			  
		  }
		  else
			  
		  {
			  System.out.println("date is not identical to date 2");
		  }
		  
		   if(date1.equals(date2))
			  {
				  System.out.println("date 1 is equal to date 2");
			  }
		   
			  else
			  {
				  System.out.println("date 1 is not equal to date 2");
			  }
		 
	    }

	}


