import java.text.NumberFormat;
import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
	
		// 1 - Welcome Message 
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
	
	// *** WHILE LOOP STARTS
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
		
		// 2 - Get user input 
		System.out.println("Enter miles: ");
		double miles =sc.nextDouble();
		System.out.println("Enter miles per hour: ");
		double mph = sc.nextDouble();
		
		// 3 - Biz logic 
		double resultHour = (double) miles/mph;
		double resultMinutes = (double) (miles/mph) *60 - (int)(resultHour) *60;
		
		// 4 - Display output 
		System.out.println();
		System.out.println("Estimated travel time");
		System.out.println("---------------------");
		System.out.println("Hours:" + ' ' + (int) (resultHour ));
		System.out.println("Minutes:" + ' ' + (int) (resultMinutes ));
		System.out.println();
		
		System.out.println("Continue? (y/n): ");
		choice = sc.next();
		
	// *** WHILE LOOP ENDS 
	}
		
		// 5 - Bye Message 
		System.out.println("BYEE!!!");
		
	}

}