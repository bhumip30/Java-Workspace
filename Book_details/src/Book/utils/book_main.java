package Book.utils;


public class book_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Book p1 = new PaperBook(1, "Java", 500.00f, 200, new Date(12,12,2003));
		
		
		eBook e1 = new eBook(2, "CPP", 200.0f, "www.cppbook.com", 40);
		
		p1.display();
		e1.display();*/
		
		Book [] allbook;
		allbook = new Book[2];
		allbook[0] = new eBook(2, "CPP", 2000.0f, "www.cppbook.com", 40);
		allbook[1] = new PaperBook(1, "Java", 2430.00f, 200, new Date(12,12,2003));
		
		double sum = 0;
		for(Book b : allbook) {
			sum += b.calPrice();
			System.out.println("Price : "+b.calPrice());
		}
		System.out.println("Total Price of all books purchesd : "+sum);
	}

}
