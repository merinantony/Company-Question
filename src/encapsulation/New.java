package encapsulation;
import java.util.Scanner;
public class New {

	public static void main(String[] merry) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Student1 st=new Student1();
System.out.println("Enter the name:");
st.setName(sc.next());
System.out.println("Enter the id:");
st.setId(sc.nextInt());
System.out.println("Name :"+st.getName());
System.out.println("ID :"+st.getId());
	
sc.close();
	}
}
