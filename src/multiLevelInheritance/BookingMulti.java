package multiLevelInheritance;
import java.util.Scanner;
public class BookingMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int A;
		System.out.println("WELCOME......!\nBook your Room");
		System.out.println();
		System.out.println("Number of persons");
		int p = s.nextInt();
		System.out.println("Number of Days");
		int dy = s.nextInt();
		System.out.println("Tariff per day");
		double tf = s.nextInt();
		System.out.println("Room Type");
		String type = s.next();
		if (type.contentEquals("ac")) {
		A = 250;
		} else {
		A = 150;

		}

		Lean bg = new Lean();
		Peak bg1 = new Peak();
		double cd = bg.Booker(p, dy, tf, A);

		System.out.println("Month ");
		int m = s.nextInt();

		switch (m) {
		case 4:
		case 5:
		case 6:
		case 9:
		case 11:
		case 12:
		bg1.peak(cd);
		break;

		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 10:
		bg.lean(cd);
		break;

		}
		s.close();
		}

		}

		class Bookk {
		double tot;

		double Booker(int p, int dy, double tf, int A) {
		tot = (p * dy * tf) + A;

		return tot;
		}
		}

		class Peak extends Bookk

		{
		Scanner s = new Scanner(System.in);
		double tot1;

		void peak(double cd) {
		System.out.println("U ARE WELCOME");
		System.out.println("Enter the peak charge");
		int dcc = s.nextInt();
		double tot223 = (cd * dcc) / 100;
		tot1 = cd + tot223;
		System.out.println("Total Tarif  :" + tot1);

		}
		}

		class Lean extends Bookk {
		double tot2;
		Scanner s = new Scanner(System.in);

		void lean(double cd) {
		System.out.println("WELCOME ........");
		System.out.println("Enter the  discount");
		int dc = s.nextInt();
		double tot22 = (cd * dc) / 100;
		tot2 = cd - tot22;
		System.out.println("Total Tariff  :" + tot2);
		}
		
	
		}