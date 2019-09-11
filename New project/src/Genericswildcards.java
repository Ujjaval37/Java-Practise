import java.util.Arrays;
import java.util.List;

public class Genericswildcards
{

	public static void main(String[] args)
	{
		List<Integer> list1= Arrays.asList(45,0,2,3);
		printSuperClass(list1);
		List<Number> list2 = Arrays.asList(4,5,6,7,8);
		printSuperClass(list2);
		List<Number> list3 = Arrays.asList(10,12,13,14,15);
		printSuperClass(list3);
		List<Integer> list4= Arrays.asList(55,1,6,9);
		printSuperClass(list4);
		
	
	}

	private static void printSuperClass(List<? super Integer> list) {
		// TODO Auto-generated method stub
		System.out.println(list);
	}
}