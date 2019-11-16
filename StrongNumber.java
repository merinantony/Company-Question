package interviewquestions;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int m=n,sum=0,r=0;
while(n!=0)
{
	int f=1;
	r=n%10;
	for(int i=1;i<=r;i++)
	{
		f=f*i;
	}
	sum=sum+f;
	n=n/10;
}
if(m==sum)
{
	System.out.println("Strong");
}
else
{
	System.out.println("not strong");
}
sc.close();
	}

}
