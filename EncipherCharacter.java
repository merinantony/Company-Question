package interviewquestions;
import java.util.Scanner;
public class EncipherCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		int b=sc.nextInt();
		int c=(int)a;
		int d=c+b;
		System.out.println((char)d);
		sc.close();
	}

}
