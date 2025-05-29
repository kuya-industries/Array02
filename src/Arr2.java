
import java.util.Scanner;
public class Arr2 {
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size1");
	int n=sc.nextInt();
	System.out.println("Enter size2");
	int m=sc.nextInt();
	String arr[][]=new String [n][m];
	for (int i=0;i<n;i++) {
		for (int j=0;j<m;j++) {
			System.out.println("Enter name"+(i+1)+"Enter company"+(j+1)+":");
			arr[i][j]=sc.next();
		}
	}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("name"+(i+1)+"Company"+(j+1)+arr[i][j]);
			}
		}
		
	}
	
	
}
