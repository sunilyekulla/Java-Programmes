package Package1;

public class ANDconditional {

	public static void main(String[] args) {
		double grade = 3.8;
		if(grade == 4.0) {
			System.out.println("You are awesome student");}
		else if (grade >= 3.5 && grade < 4.0) {
			System.out.println("You are a A grade student");}
		else if (grade >= 3.0 && grade < 3.5) {
			System.out.println("You are an average student");}
		else {
			System.out.println("You are failed");}
			
		}

	}