package interviewquestions;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number :");
int n=sc.nextInt();
int f=0;
for(int i=2;i<n;i++)
{
	if(n%2==0)
	{
		f=1;
		break;
	}
	else {
		f=0;
	}
}
	if(f==1)
	{
		System.out.println("No");
	
	}
	else
	{
		System.out.println("Yes");	
	}


sc.close();
	}

}
