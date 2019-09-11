import java.util.*;  
public class TestJavaCollection6{  
public static void main(String[] args) {  
 
Deque<String> deque = new ArrayDeque<String>();  
Scanner sc= new Scanner(System.in);
System.out.println("Enter NO");
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
	deque.add(sc.next());
}
Iterator<String> itr = deque.iterator();
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  