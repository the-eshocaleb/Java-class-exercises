package classExercises;
import java.util.*;

public class ConditionalStatements {
	public static void main(String[] args) {
		//new scanner for user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age:");
		
		int age = input.nextInt();
		
		if (age < 18) {
			System.out.println("You are underage!");
		}
		else {
			System.out.println("Congratulations, you qualify");
		}
		
	}

}
