package interviewquestions;
import java.util.Scanner;
public class PerfectSquare {

		static boolean isPerfectSquare(double x)  
	    { 
	          
	         
	        double sr = Math.sqrt(x); 
	        return ((sr - Math.floor(sr)) == 0); 
	    } 
	      
	    public static void main(String[] args)  
	    { 
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number to check whether, it is perfect square or not!!");
	        double x = sc.nextDouble();
	          
	        if (isPerfectSquare(x)) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No"); 
	        sc.close();
	    } 
	
	}


