package classExercises;

public class Arrays {

	public static void main(String[] args) {
		//programs array
		String[] programs = {"AIs", "CS", "DSA", "SE", "AIMS"};
		int[] years = {2020, 2021};
		
		//loop to merge them
		for (int year : years) {
			for (String program : programs) {
				System.out.println(program + " " + year);
			}
		}
	}

}
