import java.util.Scanner;
class Arra{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter no.of collge:");
int n=sc.nextInt();
System.out.println("Enter no.of Branches:");
int m=sc.nextInt();
System.out.println("Enter no.of Students:");
int p=sc.nextInt();
System.out.println("Enter no.of Hall tickets:");
int q=sc.nextInt();
String arr[][][][]=new String [n][m][p][q];
for (int i=0;i<n;i++) {
	for (int j=0;j<m;j++) {
		for (int k=0;k<p;k++) {
			for(int l=0;l<q;l++) {
			
			System.out.println("College"+(i+1)+"Brances:"+(j+1)+"Students"+(k+1)+"Hall Tickets"+(l+1));
			arr[i][j][k][l]=sc.next();
			
		}
	}
}
}

for (int i=0;i<n;i++) {
	for (int j=0;j<m;j++) {
		for (int k=0;k<p;k++) {
			for(int l=0;l<q;l++) {
			
			System.out.println("College"+(i+1)+"Brances:"+(j+1)+"Students"+(k+1)+"Hall Tickets"+(l+1)+arr[i][j][k][l]);
			
		}
	}
}

}
}
}


