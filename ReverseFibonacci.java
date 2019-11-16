package interviewquestions;
import java.util.Scanner;
public class ReverseFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i;

 a[0]=0;
a[1]=1;
for(i=2;i<n;i++)
{
	a[i]=a[i-2]+a[i-1];
}
for(i=n-1;i>=0;i--)
{
	System.out.printf("%d",a[i]);
}
sc.close();
	}

}
