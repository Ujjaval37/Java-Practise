package Exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileDemo {

	public static void main(String[] args) {
		Data d = new Data();
		ExecutorService ex = Executors.newFixedThreadPool(5);
		ex.execute(new myTask(d));
		ex.execute(new myTask(d));
		ex.execute(new myTask(d));
		ex.execute(new myTask(d));
		ex.execute(new myTask(d));
		ex.shutdown();
		
		

	}

}
