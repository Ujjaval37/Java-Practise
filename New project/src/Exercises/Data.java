package Exercises;

public class Data  {
	public volatile int counter =0;
	public int getcounter()
	{
		return counter;

	}
	public void countIncrement()
	{
		try {
			Thread.sleep(10);

		} catch (InterruptedException ie) {
			System.out.println(ie);
			++counter;

		}
	}
}
class myTask implements Runnable{
	private Data data;
	public myTask(Data data)
	{
		this.data=data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("value for thread"+ Thread.currentThread().getName()+"Before increment"+ data.getcounter());
		data.countIncrement();
		System.out.println("value for thread"+ Thread.currentThread().getName()+"After increment"+ data.getcounter());

	}

}


