package encapsulation;

public class Newcustomer1 {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if(name.matches("^[a-zA-Z]*$"))
		{
			this.name = name;
			return true;
		}
		else
		{
			//System.out.println("invalid name");
			return false;
		}
		
	
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
		if(address.matches("^[a-zA-Z0-9-]*$"))
		{
			this.address = address;
			return true;
		}
		else
		{
			//System.out.println("invalid contact number");
			return false;
		}
		
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public boolean setContactNumber(String contactNumber) {
		if(contactNumber.matches("^[0-9]*$"))
		{
			this.contactNumber = contactNumber;
			return true;
		}
		else
		{
			//System.out.println("invalid contact number");
			return false;
		}
		
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if(email.contains("@"))
		{
			this.email = email;	
			return true;
		}
		else
		{
			//System.out.println("Invalid Email");
			return false;
		}
		//this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public boolean setProofType(String proofType) {
		if(proofType.matches("^[a-zA-Z]*$"))
		{
			this.proofType = proofType;
			return true;
		}
		else
		{
			//System.out.println("invalid proofType");
			return false;
		}
		
		
		
	}
	public String getProofId() {
		return proofId;
	}
	public boolean setProofId(String proofId) {
		if(proofId.matches("^[0-9]*$"))
		{
			this.proofId = proofId;
			return true;
		}
		else
		{
			//System.out.println("invalid proof Id");
			return false;
		}
		
	}

public void display(String name, String address, String contactNumber, String email, String proofType,
		String proofId) {
	
	System.out.println("name            "+name);
	System.out.println("address         "+address);
	System.out.println("contactnumber   "+contactNumber);
	System.out.println("email           "+email);
	System.out.println("prooftype       "+proofType);
	System.out.println("proofid         "+proofId);
}
}