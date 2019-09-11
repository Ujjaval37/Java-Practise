package Exception;


import java.io.IOException;

public class ABD extends Thread{

	public static void main(String[] args) {
		
		ABD t1=new ABD();
		Runnable r1=new Runnable() {

			@Override
			public void run()
			{
				WriteToFile wrf=new WriteToFile();
				wrf.fileWriteMethod();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}

			}};
			Runnable r2=new Runnable() {

				@Override
				public void run() {
					ReadFromFile rff=new ReadFromFile();
					try {
						rff.ReadFromFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};

			r1.run();
			r2.run();

	}
}