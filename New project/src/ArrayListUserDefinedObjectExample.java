import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class user
{
private String name;
private int age;
public user(String name,int age)
{
this.name=name;
this.age=age;
}
public String getname()
{
return name;

}
public void setname(String name)
{
this.name=name;
}
public int getage()
{
return age;

}
public void setage(int age)
{
this.age=age;
}
}
public class ArrayListUserDefinedObjectExample {


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
List<user> users=new ArrayList<user>();
for(int i=0;i<5;i++)
{
users.add(new user(sc.next(),sc.nextInt()));
}
for(user usr:users ) {
System.out.println("Item:"+usr.getname()+"\t"+"Price:"+usr.getage());
}

}

}