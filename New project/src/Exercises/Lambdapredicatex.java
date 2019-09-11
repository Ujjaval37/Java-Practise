package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Lambdapredicatex {
	static void display(Predicate<Integer>p,Integer[] arr)
	{
		for(Integer i:arr)
		{
			if(p.test(i));
			{
				System.out.println(i+ "");
			}
		}

	}
	public static void main(String[] args) {
		Integer[] arr = {8,9,10,11,12,13,14,15};
		Predicate<Integer> It,gt;
		gt=(n)->n>10;
		It=(n)->n<15;
		System.out.println("the nos greter than 10 and less than 15 are");
		display(gt.and(It), arr);
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		list.stream()
		.peek(System.out::println);
		List<Integer>newList=list.stream()
				.peek(System.out::println)
				.collect(Collectors.toList());
		System.out.println(newList);
		List<Integer>ints=IntStream.of(1,2,3,4,5)
				.boxed()
				.collect(Collectors.toList());

	}
}
