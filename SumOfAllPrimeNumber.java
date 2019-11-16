package interviewquestions;
import java.util.Scanner;
public class SumOfAllPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
int n=sc.nextInt();
int m=sc.nextInt();
int f=0,low=0;
while(n<m)
{
	f=0;
	for(int i=2;i<=n/2;i++)
	{
		if(low % i==0)
		{
		f=1;
		break;
		}
		else
		{
			f=0;
		}
	}}
		if(f==0)
		{
		System.out.println(low);		
		}
		low++;
	


sc.close();
	}

}
