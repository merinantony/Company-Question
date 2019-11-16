package oops;

import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    String name =s.nextLine();
	    String age=s.nextLine();
	    int mark1,mark2 ,mark3,mark4 ,mark5 ,Average,Total;
	    mark1=s.nextInt();
	    mark2=s.nextInt();
	    mark3=s.nextInt();
	    mark4=s.nextInt();
	    mark5=s.nextInt();
	    Total=mark1+mark2+mark3+mark4+mark5;
	    Average=Total/5;
	    
	    
	    Student st=new Student();
	    st.detail(name,age);
	    st.mark(mark1,mark2,mark3,mark4,mark5);

	}

}
