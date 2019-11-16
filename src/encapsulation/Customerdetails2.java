package encapsulation;
import java.util.Scanner;
public class Customerdetails2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer1 c=new Customer1();
		Customer2 d=new Customer2();
		
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
		d.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofId());
		sc.close();
	}

}
