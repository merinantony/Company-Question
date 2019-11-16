package encapsulation;
import java.util.Scanner;
public class Newcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

Newcustomer1 c=new Newcustomer1();
do 
{
System.out.println("Registration");
System.out.println("Enter the name");
c.setName(sc.next());
System.out.println("Enter the address");
c.setAddress(sc.next());
System.out.println("Enter the Contact");
c.setContactNumber(sc.next());
System.out.println("Enter the Email");
c.setEmail(sc.next());
System.out.println("Enter the proof Type");
c.setProofType(sc.next());
System.out.println("Enter the proof ID");
c.setProofId(sc.next());

if(c.getName()==null)
{
	System.out.println("invalid name");
}
if(c.getAddress()==null)
{
	System.out.println("invalid address");
}
if(c.getContactNumber()==null)
{
	System.out.println("invalid contact number:");
}
if(c.getEmail()==null)
{
	System.out.println("invalid email");
}
if(c.getProofType()==null)
{
	System.out.println("invalid prooftype");
}
if(c.getProofId()==null)
{
	System.out.println("invalid proof id");
}
else
{
	System.out.println("YOUR REGISTRATION IS SUCCESSFUL!!..");	
}
}
while(c.getName()==null||c.getAddress()==null||c.getContactNumber()==null||c.getEmail()==null||c.getProofType()==null||c.getProofId()==null);
c.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofId());
sc.close();
}}	


