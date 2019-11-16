package interviewquestions;
import java.util.Scanner;
public class GcdOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int r=0;
		while(b!=0)
		{
			r=a%b;
			a=b;
			b=r;
			
		}
		System.out.println(a);
		sc.close();
	}

}
