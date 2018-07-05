package package2;

public class Array {
	static void min(int arr[]){
		int min =arr[0];
		for(int i=1;i<arr.length;i++) 
		if(min>arr[i])
			min=arr[i];
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,6,7};
		min(a);
		
		//Condition-1
		/*int a[] = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		//Condition-2
		/*int a[] = {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		//Condition-3
		/*static void min(int arr[]){
			int min =arr[0];
			for(int i=1;i<arr.length;i++) 
			if(min>arr[i])
				min=arr[i];
			System.out.println(min);
		}*/

	}

}
