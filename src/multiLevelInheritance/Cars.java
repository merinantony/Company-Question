package multiLevelInheritance;
import java.util.Scanner;
public class Cars {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);

System.out.println("Here is your Car");
int a=s.nextInt();
Model c=new Model();//computer
Audis t=new Audis();//tab
t.name();
c.color();
c.price(a);

}

}
class Audis extends Cars  {
public void name()
{
System.out.println("Audii is Here");
}
}
class Model extends Audis{
public void color()
{
System.out.println("BLACK");
}

public void price(int a) {
	// TODO Auto-generated method stub
	System.out.println("$1700000");
	
}
}
class Features extends Model {
public void price(int a)
{
System.out.println(a);
}
}

	


