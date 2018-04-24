package Package1;

public class ORconditional {

	public static void main(String[] args) {
		double account_balance = 90000.50;
		int age = 55;
		if (account_balance >= 100000 || age >= 65){
			System.out.println("You can take retirement,age is over");
		} else
        {
			System.out.println("You have time to retirement,so save money");
		}
		
	}

}
