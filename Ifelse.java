package package2;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Condition-1
		/*int age = 18;
		if (age<20) {
			System.out.println("Eligible for vote");
		}*/
		
		//Condition-2
		/*int a = 10;
		if (a<1) {
			System.out.println("condition true");
		}
		else {
			System.out.println("condition false");
		}*/
		
		//Condition-3
		int salary = 15000;
		if (salary>10000 && salary<20000) {
			System.out.println("Junior QA-associate");
		}
		else if(salary>30000 && salary<40000) {
			System.out.println("Senior QA-associate");
			
		}
		else if(salary>40000 && salary<50000) {
			System.out.println("Leads");
		}
		else {
			System.out.println("Administrative");
		}

	}

}
