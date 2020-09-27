import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// 1 - Welcome Message 
		Scanner sc = new Scanner(System.in);		
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
				
	// * WHILE LOOP STARTS 
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
						
				
		// 2 - Get user input: temDegrees 
		System.out.println("Enter degrees in Fahrenheit: ");
		double temDegrees = sc.nextDouble();
		
		// 3 - biz logic 
		// convert temDegrees to Celsius 
		double Celsius1 = (temDegrees-32) * 5/9;
				
		// 4 display output 
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		
		
		System.out.println("Degrees in Celsius: " +number.format(Celsius1));
		System.out.println();
		System.out.println("Continue? (y/n): ");
		choice = sc.next();
		
	// * WHILE LOOP ENDS 
		}
		
		// 5 - bye message 
		System.out.println("BYEEE!!!");
		}
	}
	


