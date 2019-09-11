import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreatHashSet {

	public static void main(String[] args) {
		java.util.List<Integer> numberdivisible5 = new ArrayList<>();
		numberdivisible5.add(5);
		numberdivisible5.add(10);
		numberdivisible5.add(15);
		numberdivisible5.add(20);
		numberdivisible5.add(25);
		numberdivisible5.add(30);

 List<Integer>numberdivisible3 = new ArrayList<>();
        numberdivisible3.add(3);
        numberdivisible3.add(9);
        numberdivisible3.add(12);
        numberdivisible3.add(15);
        numberdivisible3.add(18);
        numberdivisible5.addAll(numberdivisible3);  
        Set<Integer> numberdivisible31 = new HashSet<>(numberdivisible5);
        System.out.println(numberdivisible31);   
   }
}


