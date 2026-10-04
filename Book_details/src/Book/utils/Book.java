package Book.utils;

public class Book {
	private int bookid;
	private String title;
	protected float price;
	
	public Book() {
		this.bookid = 0;
		this.title = " ";
		this.price = 0;
	}

	public Book(int bookid, String title, float price) {
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	}
	
	public void display() {
		System.out.println("The book id: "+ bookid);
		System.out.println("The book title: "+ title);
		System.out.println("The book price: "+ price);
	}
	
	public double calPrice() {
		return price;
	}
}
