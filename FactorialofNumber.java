package interviewquestions;
import java.util.Scanner;
public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int f=1;
System.out.println("Enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	f=f*i;
}
	System.out.println(f);
	sc.close();
	}

}
