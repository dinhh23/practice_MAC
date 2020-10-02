import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
	
		// 1 - Welcome Message 
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
	// *** WHILE LOOP STARTS
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
				
		// 2 - Get user input 
		System.out.println("Enter loan amount: ");
		double loan =sc.nextDouble();
		System.out.println("Enter interest rate: ");
		double interest = sc.nextDouble();
		
		// 3 - Biz logic 
		
		double interestTotal = (double) loan * interest;
		
		BigDecimal interestBD = new BigDecimal(interest);				// exact decimal value = interest 
		interestBD = interestBD.setScale(5, RoundingMode.HALF_UP);		// 3 decimal place and round up 
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();		// formatting currency 
		NumberFormat percent = NumberFormat.getPercentInstance();		// formatting percent 
		percent.setMinimumFractionDigits(3);
		
		// 4 - Display output
		System.out.println();
		System.out.println("Loan amount:\t " + currency.format(loan));
		System.out.println("Interest rate:\t " + percent.format(interestBD));
		System.out.println("Interest:\t " + currency.format(interestTotal));
		
		System.out.println();
		System.out.println("Continue? (y/n): ");
		choice = sc.next();
				
	// *** WHILE LOOP ENDS 
	}
		
		// 5 - Bye Message 
		sc.close();
		System.out.println("BYEE!!!");

	}

}
