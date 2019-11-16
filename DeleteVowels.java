package interviewquestions;
import java.util.Scanner;
public class DeleteVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the word..!");
String str=sc.next();
String  str1=str.replaceAll("[AEIOUaeiou]", "");
System.out.println(str1);
sc.close();
	}

}
