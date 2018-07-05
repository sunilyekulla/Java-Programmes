package package2;

import java.util.Scanner;

public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double[] arr = {12,47,50,23,45,12,34,78};
		double total = 0;
		for (int i=0;i<arr.length;i++) {
			total = total+arr[i];
			//int average = total/arr.length;
		}
		double average = total/arr.length;
		System.out.println("the average of array is: "+ average);*/
		
		System.out.println("Enter number of elements: ");
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		
		double[] arr = new double[in];
		double total = 0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter element no:"+(i+1)+": ");
			arr[i]=scan.nextDouble();
			
		}
		for(int i=0;i<arr.length;i++) {
			total = total+arr[i];
			
		}
		double average =  (total/arr.length);
		System.out.println("The average of array is: "+average);

	}

}
