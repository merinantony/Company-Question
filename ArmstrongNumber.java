package interviewquestions;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=a;
int c=a;
int count=0,r,sum=0;
while(c!=0)
{
count++;
c=c/10;
}
while(a!=0)
{
	r=a%10;
	sum= (int) ((int)(double)sum+Math.pow(r, count));
	a=a/10;
	
}
System.out.println(sum);
if(sum==b)
{
	System.out.println("Armstrong");
}
else
{
	System.out.println(" not Armstrong");
}
sc.close();
	}

}
