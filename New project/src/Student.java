import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Comparator; 
  
  class Student 
  { 
    String Name; 
    int Age; 
    public Student(String Name, Integer Age) { 
        this.Name = Name; 
        this.Age = Age; 
    } 
  
    public String getName() { 
        return Name; 
    } 
  
    public void setName(String Name) { 
        this.Name = Name; 
    } 
  
    public Integer getAge() { 
        return Age; 
    } 
  
    public void setAge(Integer Age) { 
        this.Age = Age; 
    } 
 
    @Override
    public String toString() { 
        return "Name is : {" + "Name=" + Name + ", Age=" + Age + '}'; 
    } 
  
    static class CustomerSortingComparator implements Comparator<Student> { 
        @Override
        public int compare(Student customer1, Student customer2) {     
            int NameCompare = customer1.getName().compareTo(customer2.getName()); 
            int AgeCompare = customer1.getAge().compareTo(customer2.getAge());   
            if (NameCompare == 0)
            { 
                return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
            } 
            else 
            { 
                return NameCompare; 
            } 
        } 
    } 
    public static void main(String[] args) {   
        List<Student> al = new ArrayList<>();  
        Student obj1 = new Student("Rohit", 27); 
        Student obj2 = new Student("Shruti", 23); 
        Student obj3 = new Student("Simran", 37); 
        Student obj4 = new Student("Rohit", 22); 
        Student obj5 = new Student("Rohit", 29); 
        Student obj6 = new Student("Shruti", 22); 
        al.add(obj1); 
        al.add(obj2); 
        al.add(obj3); 
        al.add(obj4); 
        al.add(obj5); 
        al.add(obj6);  
        Iterator<Student> custIterator = al.iterator(); 
        System.out.println("Before Sorting:\n"); 
        while (custIterator.hasNext()) { 
            System.out.println(custIterator.next()); 
        }    
        Collections.sort(al, new CustomerSortingComparator()); 
        System.out.println("\n\nAfter Sorting:\n"); 
        for (Student customer : al) { 
            System.out.println(customer); 
        } 
    } 
} 
