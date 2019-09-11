import java.util.ArrayList;
import java.util.List;

public class Createarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<Integer> firstnumber = new ArrayList();
               firstnumber.add(2);
               firstnumber.add(3);
               firstnumber.add(4);
               firstnumber.add(5);
               firstnumber.add(6);
               firstnumber.add(7);
        List<Integer>firstnumber1  = new ArrayList<>(firstnumber);
        List<Integer> lastfivenumber = new ArrayList<>();
               lastfivenumber.add(8);
               lastfivenumber.add(9);
               lastfivenumber.add(10);
               lastfivenumber.add(11);
               lastfivenumber.add(12);
         firstnumber1.addAll(lastfivenumber);      
         System.out.println(firstnumber1);   
	}

}


