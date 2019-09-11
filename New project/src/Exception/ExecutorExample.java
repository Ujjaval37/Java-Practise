package Exception;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorExample {

	public static void main(String[] args) {
		System.out.println("inside"+Thread.currentThread());
		System.out.println("Executor serivce is created");
		ExecutorService exservices=Executors.newSingleThreadExecutor();
		System.out.println("creating a runnable...");
		Runnable runs = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("this is Runnable "+ Thread.currentThread().getName());
			}
		};
		System.out.println("sbmitting runnable object");
		exservices.submit(runs);
		Thread.currentThread().setName("my thread");
		System.out.println("this is Runnable "+ Thread.currentThread().getName());
		System.out.println("Creating user serivce with thread pool size of 2..");
		ExecutorService exService = Executors.newFixedThreadPool(1);

	}
	Runnable tak1 = new Runnable()
	{

		@Override
		public void run() {

			System.out.println("exceuting task 2 inside" + Thread.currentThread().getName());
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			catch (IllegalStateException e)
			{
				e.printStackTrace();
			}

		}
		

	};



	Runnable tak2 = new Runnable() {

		@Override
		public void run() {
			System.out.println("Executing task 3 inside" + Thread.currentThread().getName());
			try {
				Thread.sleep(200);

			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			catch (IllegalStateException e)
			{
				e.printStackTrace();
			}

		}
	};

	Runnable tak3 = new Runnable() {

		@Override
		public void run() {
			System.out.println("Executing task 3 inside" + Thread.currentThread().getName());
			try {
				Thread.sleep(300);

			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			catch (IllegalStateException e)
			{
				e.printStackTrace();
			}

		}
	};
	exservice.submit(tak2);
	exservice.submit(tak2);
	exservice.submit(tak3);
	exservice.shutdown();

}	



}



/*ExecutorService v=new ExecutorService()
				{

					@Override
					public void execute(Runnable arg0) {
						// TODO Auto-generated method stub

					}

					@Override
					public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
							throws InterruptedException {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout,
							TimeUnit unit) throws InterruptedException {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public <T> T invokeAny(Collection<? extends Callable<T>> tasks)
							throws InterruptedException, ExecutionException {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
							throws InterruptedException, ExecutionException, TimeoutException {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public boolean isShutdown() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public boolean isTerminated() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public void shutdown() {
						// TODO Auto-generated method stub

					}

					@Override
					public List<Runnable> shutdownNow() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public <T> Future<T> submit(Callable<T> task) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public Future<?> submit(Runnable task) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public <T> Future<T> submit(Runnable task, T result) {
						// TODO Auto-generated method stub
						return null;
					}

				}
 */
