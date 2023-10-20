package classExercises;
import java.util.ArrayList;
import java.util.List;

public class ListAndStrings {

	public static void main(String[] args) {
		String value = "Java Programming is a Popular Language!!";
		List<String> programs = new ArrayList<String>();
		
		programs.add("DSA");
	    programs.add("CS");
	    programs.add("SE");
	    programs.add("AIs");
	    
	    for(String program : programs){
		System.out.println(program);
	    }

		System.out.println(value.toLowerCase());
		System.out.println(value.toUpperCase());
	}


}
