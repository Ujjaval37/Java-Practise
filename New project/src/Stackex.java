import java.util.Stack;

public class Stackex {

	   
	public static void main(String[] args) {
		  Stack s1 = new Stack();
		  s1.push(12);
		  s1.push(14);
		  s1.push(16);
		  s1.push(18);
		  s1.push(20);
		  s1.push(22);
		  System.out.println("bfr rmvng" + s1);
		  s1.pop();
		  System.out.println("afrt rmvng" + s1);  

	}

}
