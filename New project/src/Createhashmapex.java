import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Createhashmapex {

	public static void main(String[] args)
	{
		
		Map<String,Integer>numbermapping = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			numbermapping.put(sc.next(),sc.nextInt());
		}
		   System.out.println(numbermapping);
		
	    sc.close();
		
		
		/*
		numbermapping.put("One",1);
		numbermapping.put("two",2);
		numbermapping.put("three",3);
		numbermapping.put(null , null);
		numbermapping.put("five",5);
		numbermapping.putIfAbsent("six",7);
		System.out.println(numbermapping);
		 */
	  } 
    }

