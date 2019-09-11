package Exercises;
class Cancellation extends Thread{
	public void run()

	{
		System.out.println("cancellation thread...");
	}

}
class Reservation extends Thread
{
	public void run()
	{
		System.out.println("Reservaion thread...");
	}
}
public class Threadgroupex {
	public static void main(String[] args) {
		Reservation res = new Reservation();
		Cancellation can = new Cancellation();
		ThreadGroup tg1 =  new ThreadGroup("F group");
		Thread t1 =  new Thread(tg1,res,"First Group");
		Thread t2 =  new Thread(tg1,res,"Second group");
		ThreadGroup tg2 =  new ThreadGroup("S group");
		Thread t3 =  new Thread(tg2,can,"Third group");
		Thread t4 =  new Thread(tg2,can,"Second group");

		System.out.println("Parent of a"+ t1.getThreadGroup());
		System.out.println("Parent of a"+ t3.getThreadGroup());

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("No of thread active in group1="+ tg1.activeCount());
		System.out.println("No of thread active in group2="+ tg2.activeCount());

	}

}
