package interviewquestions;
import java.util.Scanner;
public class ArcLengthOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for radius..");
int r=sc.nextInt();
System.out.println("Enter the value for angle");
int a=sc.nextInt();
if(a/360!=0)
{
double arc=(2*3.14*r)*(a/360);
System.out.println("Arc length of circle is "+arc);
}
else
{
	double arc=(2*3.14*r);
	System.out.println("Arc length of circle is "+arc);	
}
sc.close();
	}

}
