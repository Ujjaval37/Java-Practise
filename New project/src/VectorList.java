import java.util.ArrayList;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) 
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		System.out.println(v1.size());
		v1.remove(2);
		System.out.println(v1.size());
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println(l1.size());
		l1.add(22);
		l1.add(22);
		l1.add(22);
		l1.add(22);
		System.out.println(l1.size());
		
	

	}

}