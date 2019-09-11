package Streamjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class Testexstream {


	public static List<Employename> creatTestexstream(){
		return Arrays.asList(
				new Employename("Ujjaval",Gender.MALE,20),
				new Employename("SHRUTI",Gender.FEMALE,30),
				new Employename("RIYA",Gender.FEMALE,22),
				new Employename("ANIL",Gender.MALE,35),
				new Employename("ROHIT",Gender.FEMALE,15)
				);		

	}
	public static void main(String[] args) {
		List<Employename> emplon=creatTestexstream();
		System.out.println("Printing list before streams...");
		System.out.println(emplon);
		List<String> emp1=new ArrayList<>();
		for(Employename emp:emplon)
		{
			if(emp.getAge()<30)
			{
				emp1.add(emp.getName().toUpperCase());

			}
		}
		System.out.println(emp1);
		List<String> emp11=
				emplon.stream()
				.filter(emp ->emp.getAge()>30)
				/*.map(emp -> emp.getName())
				.map(name -> name.toUpperCase())*/
				.map(Employename:: getName)
				.map(String:: toUpperCase)
				.collect(Collectors.toList());
		System.out.println("Printing name with using steam");
		System.out.println(emp11);
	}

}
