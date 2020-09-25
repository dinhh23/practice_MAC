import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		// 1 - Welcome message 
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);
		
		// * while loop starts
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
		
			// 2 - get user input: numerciGrade
			System.out.print("Enter numeric grade: ");
			int numericGrade = sc.nextInt();
			
			// 3 - biz logic: 
			// if/else using ranges
			// - convert numerciGrade to letterGrade
			String letterGrade = "";
			
			if (numericGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericGrade >= 80) {
					letterGrade = "B";
				
			}
			else if (numericGrade >= 68) {
				letterGrade = "C";
			}
			else if (numericGrade >= 60) {
				letterGrade = "D";
			}
			else { 
				letterGrade = "F";
			}
	
			// 4 - display output 
			System.out.println("Letter Grade: " +letterGrade+"\n");
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		// * while loop ends
	}	
		
		
		// 5 - bye message 
		System.out.println("BYEEEE");
		
		
		}	
	}

