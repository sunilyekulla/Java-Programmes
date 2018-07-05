package package2;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		boolean isprime=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scan.nextInt();
		scan.close();
		
		/*for(int i=2;i<num/2;i++) {
			s=num%i;
			if(s==0) {
				isprime = false;
				//break;
			}
		}*/
		int i=2;
		while(i<=num/2) {
			if(num%i==0) {
				isprime = false;
				break;
			}
			i++;
		}
		if(isprime) {
			System.out.println(num + " is a prime number ");
		}
		else {
			System.out.println(num + " is not a prime number ");
		}

	}

}
