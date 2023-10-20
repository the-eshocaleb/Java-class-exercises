package classExercises;
import java.util.*;
public class Loops {

	public static void main(String[] args) {
		//make a new scanner object to take user input
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		//while loop
		int startnum = input.nextInt();
		while(startnum > 0) {
			System.out.println("This is number: " + startnum);
			startnum--;
		}
		
		//for loop
		for (int num = 0; num <= 10; num++) {
			System.out.println("Counting uppp: " + num);
		}
		
		
		
	}

}
