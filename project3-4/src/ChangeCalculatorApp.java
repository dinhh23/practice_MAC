import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		
		// 1 - Welcome Message 
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
			
	// *** WHILE LOOP STARTS
				
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
		// 2 - Get user input 
		System.out.println();
		System.out.println("Enter number of cents (0-99): ");
		int cents =sc.nextInt();
				
		// 3 - Biz logic 
		int quarters = cents / 25;
		int dimes =  (cents - (int)(quarters) * 25) / 10;
		int nickels = ((cents - (int)(quarters) * 25) - (int)(dimes) * 10) / 5;
		int pennies = (((cents - (int)(quarters) * 25) - (int)(dimes) * 10) - (int)(nickels) * 5) / 1;
		
		// 4 - Display output 
		System.out.println();
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies); 
		System.out.println();
			
		System.out.println("Continue? (y/n): ");
		
		choice = sc.next();
				
	// *** WHILE LOOP ENDS 
			}
				
		// 5 - Bye Message 
		System.out.println("BYEE!!!");

	}

}