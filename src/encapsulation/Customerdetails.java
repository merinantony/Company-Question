package encapsulation;
import java.util.Scanner;
public class Customerdetails {

	public static void main(String[] merry) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//System.out.println("");
Customer c=new Customer();
System.out.println("Enter the name:");
c.setName(sc.next());
System.out.println("Enter the address:");
c.setAddress(sc.next());
System.out.println("Enter the contact number:");
c.setContactNumber(sc.next());
System.out.println("Enter the email:");
c.setEmail(sc.next());
System.out.println("Enter the prooftype:");
c.setProofType(sc.next());
System.out.println("Enter the proofId:");
c.setProofId(sc.next());
c.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofId());
sc.close();
	}

}
