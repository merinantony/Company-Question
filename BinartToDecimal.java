package interviewquestions;
import java.util.Scanner;
public class BinartToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the binary number :");
String bin=sc.next();
int dec=Integer.parseInt(bin,2);
System.out.println(dec);
sc.close();
	}

}
