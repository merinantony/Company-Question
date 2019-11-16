package interviewquestions;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
int y=0,x,r;
int sum=0;
while(n!=0)
{
	r=n%10;
	sum=sum+r;
	n=n/10;
}
while(sum!=0)
{
	x=sum%10;
	y=y+x;
	sum=sum/10;
}
System.out.println(y);
sc.close();
	}

}
