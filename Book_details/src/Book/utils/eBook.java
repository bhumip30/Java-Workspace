package Book.utils;

public class eBook extends Book {
	private String url;
	private double size;

	public eBook() {
		// TODO Auto-generated constructor stub
	}

	public eBook(int bookid, String title, float price,String url, double size) {
		super(bookid, title, price);
		this.url = url;
		this.size = size;
	}
	
	public void display() {
		super.display();
		System.out.println("The book url: "+ url);
		System.out.println("The book size in MB: "+ size);
	}
	
	public double calPrice(){
		if (price <= 500) {
			return super.calPrice() + (price * 0.02);
		}
		if (price > 500 && price <= 1000) {
			return super.calPrice() + (price * 0.05);
		}
		if (price > 1000 && price <= 5000) {
			return super.calPrice() + (price * 0.07);
		}
		return super.calPrice();
	}

}
