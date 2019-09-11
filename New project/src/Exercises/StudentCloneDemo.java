package Exercises;

class Student implements Cloneable {
	int id;
	String name;
	Student(int i,String n)
	{
		this.id=i;
		this.name=n;
	}
	public void Getdetails()
	{
		System.out.println("Id is "+ id +"Name is " + name);
	}
	protected Object StudentClone() throws CloneNotSupportedException {

		return super.clone();
	}
}
public class StudentCloneDemo
{
	public static void main(String args[])
	{
		Student s1= new Student(202 , "Ujjaval");
		System.out.println("the original obj pf student is");
		s1.Getdetails();
		try {
			Student s2 = (Student) s1.StudentClone();
			System.out.println("this obj is clone");
			s2.Getdetails();
			System.out.println("The detail of s1 "+ s1 + "the details of s2 " + s2 );
			
		} catch (Exception e) {
		
		}

	}

}
