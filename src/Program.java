import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create input scanner
		int myAge;
		
		try {
			
			System.out.println("Please enter your age: ");
			myAge = input.nextInt();
			System.out.println("\nYou entered: " + myAge);
			
		} catch (Exception e) {
			System.out.println("Please enter a valid number.");
		}

	}

}
