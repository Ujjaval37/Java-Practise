import java.util.LinkedList;
import java.util.Queue;

public class Queueex {

	public static void main(String[] args) {
		
		Queue<String>waitingQueue = new LinkedList<>();
		waitingQueue.add("Rahul");
		waitingQueue.add("Riya");
		waitingQueue.add("Surya");
		waitingQueue.add("Shruti");
		System.out.println("waitingQueue :" + waitingQueue);
		String name = waitingQueue.remove();
		System.out.println("Remove from waitingQueue :" + name +    waitingQueue);
		name = waitingQueue.poll();
		System.out.println("remove from queue :" + name +  waitingQueue);
		
		
	}

}
