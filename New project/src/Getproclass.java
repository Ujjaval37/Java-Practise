class Emp{
	
private int id;
private String name;
public void setId(int id)
{
	this.id = id;
	
}
public int getId()
{
	return id;
	
}
public void setName(String name)
{
	this.name = name;
	
}
		public String getName()
		{
		return name;
	}
}
public class Getproclass {
	
	public static void main(String[] args) {
		Emp a1= new Emp();
		a1.setId(2);
		a1.setName("Ujjaval");
		System.out.println(a1.getId());
		System.out.println(a1.getName());
		

	}

}
