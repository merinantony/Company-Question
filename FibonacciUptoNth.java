package interviewquestions;
import java.util.Scanner;
public class FibonacciUptoNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				 int a=0;
				 int b=1,c;
				 System.out.println(a);
				 System.out.println(b);
				
				 for(int i=3;i<=n;i++)
				 {
					c=a+b;
					 System.out.println(c);
					 a=b;
					 b=c;
				 }
				 sc.close();
	}

}
