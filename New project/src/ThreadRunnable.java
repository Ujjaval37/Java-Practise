
 class TtestRunnable implements Runnable {
	     public void run()
	     {
	    	 for(int i=0;i<20;i++)
	    	 {
	    		 System.out.println("Child Thread");
	    	 }
	    	 System.out.println("Inside child thread.."+ Thread.currentThread().getClass());
	    	 Thread.currentThread().setName("Java thread");
	    	 System.out.println(Thread.currentThread().getPriority());
	    	 Thread.currentThread().setPriority(7);
	    	 System.out.println(Thread.currentThread());
	     }
} 
public class ThreadRunnable
  {
	public static void main(String[] args) 
	{
		TtestRunnable tr = new TtestRunnable();
		Thread t1 = new Thread(tr);
		t1.start();
		for(int i=0;i<20;i++)
		{
			System.out.println("Main thread");
		}
		System.out.println(t1.getName());
		Thread.currentThread().setName("my name");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());	 
	}
}
