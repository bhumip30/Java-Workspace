package email_sorting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class emailMain {

	public static void main(String[] args) {
		Set <Email> em = new TreeSet<>();
		em.add(new Email(1, "knowit@gmail.com", "Leave Application", "i want leave", LocalDateTime.now().minusHours(2)));
		em.add(new Email(2, "aarya@gmail.com", "Promotion", "you got promothin", LocalDateTime.now().minusHours(4)));
		em.add(new Email(3, "bhumi@gmail.com", "Project Management", "We have new project", LocalDateTime.now().minusHours(1)));
		
		for (Email e : em) {
			System.out.println(e);
		}
	}

}
