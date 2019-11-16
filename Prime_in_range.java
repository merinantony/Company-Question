package interviewquestions;
import java.util.Scanner;
public class Prime_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a,b,flag = 0,i,j;
System.out.println("Enter the upper bound");
 a=sc.nextInt();
 System.out.println("Enter the lower bound");
b=sc.nextInt();
for(i=a;i<=b;i++)
{
	if(i==2)
	flag=0;
	
else {
for(j=2;j<=i/2;j++)
{
	if(i%j==0)
	{
		flag=1;
		break;
	}
	else
	
		flag=0;
	
}}
if(flag==0)

	System.out.println(i);

	}
sc.close();

	}}
