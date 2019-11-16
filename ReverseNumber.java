package interviewquestions;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the limit");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rev=0;
while(n!=0)
{
	int digit=n%10;
	rev=rev*10+digit;
	n=n/10;
	}
System.out.println("reversed Number"+rev);
sc.close();
}

}
