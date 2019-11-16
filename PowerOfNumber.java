package interviewquestions;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base number!");
int a=sc.nextInt();
System.out.println("Enter the power number!");
int b=sc.nextInt();
double m=Math.pow(a, b);
System.out.println(m);
sc.close();
	}

}
