package Exercises;

public class toolcolonexam {
	static void disp()
	{
		System.out.println("this is dsip method");
	}

	public static void main(String[] args) {
		Runnable r =()-> System.out.println("hello from lambda");
		r.run();
		Runnable run2=toolcolonexam :: disp;
		run2.run();


	}

}
