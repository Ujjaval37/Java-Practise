
public class Mythread extends Thread
{
	public void run()
	{
		int ctr=0;
		for(int i=0;i<=10;i++)
		{
		System.out.println(ctr++); 
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(Thread.currentThread());
		}
	
	}

	public static void main(String[] args) 
	{
		Mythread m = new Mythread();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		t1.setName("thread1");
		t1.start();
		t2.setName("thread2");
		t2.start();
		System.out.println(Thread.currentThread());	

	}

}
