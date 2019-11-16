package multiLevelInheritance;
import java.util.Scanner;
public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("NO OF PRODUCT");
		int a=sc.nextInt();
		Computers c=new Computers();
		Tab t=new Tab();
		t.name();
		c.color();
		c.price(a);
sc.close();
	}}

		
		class Tab  {
	 void name()
		{
		System.out.println("DELL");
		}
		}
		class Laptop extends Tab {
	 void color()
		{
		System.out.println("BLACK");
		}
		}
		class Computers extends Laptop {
		 void price(int a)
		{
			System.out.println(a);
		}
		
		

	}

