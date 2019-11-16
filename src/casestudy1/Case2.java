package casestudy1;
import java.util.Scanner;
public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Scanner sc1=new Scanner(System.in);	
		Books b=new Books();
		String pro;
		do
		{
 System.out.println("Menu");
 System.out.println("1.Book\n2.Checkstatus\n3.Exit");
 System.out.println("Enter your choise:");
int n=sc.nextInt();
switch(n) {
case 1:
    b.book();
    break;
case 2:
    b.checkstatus();
    break;
case 3:
	b.exit();
}
pro = sc.next();
}while(pro.equals("NO"));

}}







		


