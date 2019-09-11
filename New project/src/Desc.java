import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Desc {

	public static void main(String[] args) {
		
		SortedSet<String>fruits = new TreeSet<>(Comparator.reverseOrder());
		
		/*
		SortedSet<String>fruits new Desc<>(new Comparator<String>())
		{
			@Override
			public int compare(String s1,String s2)
			{
				return s2.compareTo(s1);
			}
			
		}

	}
	    */
		fruits.add("bnana");
		fruits.add("apple");
		fruits.add("mango");
		System.out.println("fruits :" + fruits);
	}

}
