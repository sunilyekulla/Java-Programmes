package package2;

import java.util.Scanner;

public class CheckEvenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		System.out.println("Enter any integer: ");
		Scanner scan = new Scanner(System.in);
		s=scan.nextInt();
		if(s%2==0) {
			System.out.println(s + " is even number");
		}
		else {
			System.out.println(s +" is odd number");
		}

	}

}
