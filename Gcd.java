package interviewquestions;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int gcd = 1;
		for (int i=1;i<=n1 && i<=n2;++i) {
		if (n1 % i == 0 && n2 % i == 0)
		gcd = i;
		}
		System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
		
		s.close();


	}

}
