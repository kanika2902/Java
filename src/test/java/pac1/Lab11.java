package pac1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;



public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date:");
		String inputDate=sc.nextLine();
		
		LocalDate givenDate=LocalDate.parse(inputDate);
		LocalDate currentDate=LocalDate.now();
		
		Period period = Period.between(givenDate, currentDate);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		sc.close();
		

	}

}
