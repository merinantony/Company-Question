package inhert_case;
import java.util.Scanner;
public class Bookings {
	public static void main(String arg[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no. of persons");
	int n=s.nextInt();
	System.out.println("Enter total days");
	int d=s.nextInt();
	System.out.println("Enter room type");
	String st1=s.next();
	System.out.println("Enter tariff for single person");
	int t=s.nextInt();
	//double total=0;
	season st=new season();
	st.Person(n);
	st.Days(d);
	st.Tariff(t);
	n=st.setperson();
	d=st.setdays();
	t=st.settariff();
	st.book(n, d, t);
	}
	}
	class season extends booking{
	int person;
	int days;
	int tariff;
	void Person(int per)
	{
	this.person=per;
	}
	void Tariff(int ta) {
	this.tariff=ta;
	}
	int settariff() {
	return this.tariff;
	}
	int setdays() {
	return this.days;
	}
	int setperson() {
	return this.person;
	}
	void Days(int dys)
	{
	this.days=dys;
	}

	}
	class booking
	{
	void book(int n,int d,int t)
	{
	int total=t*n*d;
	System.out.printf("Total tariff: %d",total);
	}
	}



