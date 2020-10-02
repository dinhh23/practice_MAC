import java.util.Scanner;

public class Add_Actor_MovieApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie DB!");
		
		Scanner sc = new Scanner(System.in);
		
		
		String command = " ";
		while (!command.equalsIgnoreCase("")); {
			System.out.println("Menu");
			System.out.println("1 - Add Actor" + "2 - Add Movie" + "3 - Exit" );
			command = sc.next();
			
		}
		

	}

}
