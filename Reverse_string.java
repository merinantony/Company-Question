package interviewquestions;
import java.util.Scanner;
public class Reverse_string {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	String str;
	str = scanner.nextLine();
	String reversed = reverseString(str);
	System.out.println("The reversed string is: " + reversed);
	scanner.close();
	}
	public static String reverseString(String str) {
	if (str.isEmpty())
	return str;
	                                                              // Calling Function Recursively
	return reverseString(str.substring(1)) + str.charAt(0);
	
	}
	}

