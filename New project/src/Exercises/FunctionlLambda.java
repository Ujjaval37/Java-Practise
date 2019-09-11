package Exercises;

import java.util.function.Function;

public class FunctionlLambda {

	public static void main(String[] args) {
		Function<String, Integer>len=(str)->str.length();
		String str = "Hello Lembda";
		System.out.println("lembda of the String is "+len.apply(str));
		/*public Integer myFunct(String str)
		{
			return str.length();
		}
		
*/
	}

}
