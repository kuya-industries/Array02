import java.util.*;
class Arr4{
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Size 1");
		int n= sc.nextInt();
		System.out.println("Size 2");
		int m= sc.nextInt();
		System.out.println("size 3");
		int z =sc.nextInt();
		System.out.println("size 4");
		int y =sc.nextInt();
		String arr [][][][]=new String [n][m][z][y];
		for(int i=0;i<n;i++) {
			for(int j=0;i<m;j++) {
				
			
			for(int k=0;k<m;k++) {
				
		
			for(int l=0;l<y;l++) {
				System.out.println("Enter name"+(i+1)+"Enter Nickname"+(j+1)+"Enter Company name"+(k+1)+"Enter your friend"+(l+1));
				arr[i][j][k][l]=sc.next();
				
			}
		}
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;i<m;j++) {
				
			
			for(int k=0;k<m;k++) {
				
		
			for(int l=0;l<y;l++) {
				System.out.println("Enter name"+(i+1)+"Enter Nickname"+(j+1)+"Enter Company name"+(k+1)+"Enter your friend"+(l+1)+ arr[i][j][k][l]);
		
	}
			}
			}
			
			
			
			}
	}
}
			
			
			
			