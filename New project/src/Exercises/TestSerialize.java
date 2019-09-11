package Exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {

	public static void main(String[] args) {
		Book bokk1 = new Book(1201,"The completer reference" , "Herber Shild" , 600);
		try {
			FileOutputStream fos = new FileOutputStream("Book.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bokk1);
			System.out.println("Boook is succesfully serialization..");
			FileInputStream fis= new FileInputStream("Book.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Book mybooks=(Book) ois.readObject();
			System.out.println("Book is succesfully deserialization");
			System.out.println("After serialization.."+ mybooks);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
