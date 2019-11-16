package interviewquestions;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n,a;
String x="";
System.out.println("Enter the decimal number:");
n=sc.nextInt();
while(n>0)
{
	a=n%2;
	x=a+x;
	n=n/2;
}
System.out.println("Binary Number:"+x);
sc.close();
	}

}
