import java.util.*;
public class ArrayReverse {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n] ;
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("enter array values"+(i+1));
			arr[i]=sc.nextInt();
			
		}
		
		for (int i=0;i<arr.length;i++) {
			System.out.print("  "+arr[i]+"  ");
		}
		
		int large=arr[0];
		int small=arr[0];
		int avg=0;
		for (int i=0;i<arr.length;i++) {
		if(arr[i]>large) {
			large=arr[i];
		}
		else {
			if(arr[i]<small) {
				small=arr[i];
			}
			}
			avg=arr[i]+avg;
			avg=avg/arr.length;
		}
			System.out.println(large);
			System.out.println(small);
			System.out.println(avg);
	

	}

}
