package operations;
import java.time.*;
import java.util.*;

public class Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int day, month, year;
			System.out.println("Enter the day, month, year");
			day = sc.nextInt();
			month = sc.nextInt();
			year = sc.nextInt();
			
			LocalDate dob = LocalDate.of(year, month, month);
			
			LocalDate today = LocalDate.now();
			
			int age = today.getYear() - dob.getYear();
			
			if (today.getMonthValue() < dob.getMonthValue() || today.getMonth() ==  dob.getMonth() && today.getDayOfMonth() < dob.getDayOfMonth()) {
				age --;
			}
			
			if (age >= 18) {
				System.out.println("Valid");
			}
			else {
				throw new Exception("Exception Raised");
			}
			
		}
		catch (InputMismatchException e){
			System.out.println("Please enter integer variables in date");
			
		}
		catch (DateTimeException e) {
			System.out.println("Invalid date values");
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
