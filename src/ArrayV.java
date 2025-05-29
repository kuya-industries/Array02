
public class ArrayV {
public static void main (String []args) {
	int arr[]= {10,20,15,45,75};
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
	
	


