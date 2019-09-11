package Exercises;

import java.io.Serializable;

public class Book implements Serializable{
	private int bookid;
	private String tittle;
	private String author;
	private transient double price =500.50;
	public Book(int bookid, String tittle, String author, double price) {
		super();
		this.bookid = bookid;
		this.tittle = tittle;
		this.author = author;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "Book(" +"Book id"+ bookid+ "Book tittle"+ tittle+ "Book author"+author+ "Book price"+price+")";
		
	}
		
}
