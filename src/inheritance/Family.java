package inheritance;
import java.util.Scanner;
public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the generation:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
Parents p=new Parents();
p.name();
p.age();
System.out.println("Happy to know..you are in generation  "+a);
	}

}
