package encapsulation;
//import java.util.Scanner;
public class Customer {
String name;
String address;
String contactNumber;
String email;
String proofType;
String proofId;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getProofType() {
	return proofType;
}
public void setProofType(String proofType) {
	this.proofType = proofType;
}
public String getProofId() {
	return proofId;
}
public void setProofId(String proofId) {
	this.proofId = proofId;
}
public void display(String name2, String address2, String contactNumber2, String email2, String proofType2,
		String proofId2) {
	// TODO Auto-generated method stub
	System.out.println("name "+name);
	System.out.println("address "+address);
	System.out.println("contactnumber "+contactNumber);
	System.out.println("email "+email);
	System.out.println("prooftype "+proofType);
	System.out.println("proofid "+proofId);
	
}

}
