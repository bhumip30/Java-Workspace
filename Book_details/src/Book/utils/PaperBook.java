package Book.utils;

public class PaperBook extends Book {
	private int no_of_pages;
	private Date date_of_publication;
	
	public PaperBook () {
		
	}

	public PaperBook(int bookid, String title, float price, int pages, Date  date_of_publication ) {
		super(bookid, title, price);
		// TODO Auto-generated constructor stub
		this.no_of_pages = pages;
		this.date_of_publication = date_of_publication;
	}
	
	public void display() {
		super.display();
		System.out.println("The book pages: "+ no_of_pages);
		System.out.println("The book date of publication:  "+ date_of_publication);
		
	}
	
	public double calPrice(){
		if (price <= 500) {
			return super.calPrice() + (price * 0.07);
		}
		if (price > 500 && price <= 1000) {
			return super.calPrice() + (price * 0.05);
		}
		if (price > 1000 && price <= 5000) {
			return super.calPrice() + (price * 0.02);
		}
		return super.calPrice();
	}

}
