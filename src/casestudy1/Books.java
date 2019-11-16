package casestudy1;

import java.util.Scanner;

public class Books {
	public static  int booked[]=new int[25];
	Scanner sc=new Scanner(System.in);
	static void book() {
		String ac,pr;
		String cot;
		String cable;
		String wifi;
		String laundry;
		Scanner sc=new Scanner(System.in);
				int total,b=0,c,e,d,f,i=1;
				do {
				System.out.println("Booking");
				System.out.println("Please choose the service requested");
				System.out.println("AC/non-AC(AC/nAC)");
				
				ac=sc.next();
				if(ac.contentEquals("AC")==true)
				{	
					b=1500;
				}
				else
				{
					b=700;
				}
				
				System.out.println("single cot/double cot(S/D)");
				cot=sc.next();
				if(cot.equals("S")==true)
				{
					c=50;
				}
				else
				{
					c=100;
				}
				System.out.println("with cable connection/without cable connection(C/NC)");
				cable=sc.next();
				if(cable.equals("C")==true)
				{
				d=50;	
				}
				else
				{
					d=0;
				}
				System.out.println("wifi needed or not(W/NW)");
				wifi=sc.next();
				if(wifi.equals("W")==true)
				{
					e=200;
				}
				else
				{
					e=0;
				}
				System.out.println("laundry service needed or not(L/NL)");
				laundry=sc.next();
				if(laundry.equals("L")==true)
				{
					f=100;
				}
				else
				{
					f=0;
				}
				total=b+c+d+e+f;
				System.out.println("The total charge is Rs:"+total);
				System.out.println("The service choosen are:");
				if(b==1500)
				{
					System.out.println("AC");
				}
				else
				{
					System.out.println("non AC");
				}
				if(c==50)
				{
				System.out.println("single cot");
				}
				else
				{
				System.out.println("double cot");
				}
				if(d==50)
				{
				System.out.println("cable connection enabled");
				}
				else
				{
				System.out.println(" cable connection not enabled");
				}
				if(e==200)
				{
					System.out.println("wifi enabled");
				}
				else
				{
					System.out.println("wifi not enabled");
				}
				if(f==100)
				{
					System.out.println("with laundry services");
				}
				else
				{
					System.out.println("without laundry services");
				}
				System.out.println("Do you want to proceed? (YES/NO)");
			    pr=sc.next();}
				while(pr.equals("NO"));
				{
				if(pr.contentEquals("YES")==true)
				{
					booked[i]=1;
					System.out.println("Thank you  for booking.. !!! \n Your room number is "+i);
					i=i+1;
				}
				}
}
	public void checkstatus() {
		// TODO Auto-generated method stub
		int flag=0;
		System.out.println("Check status:");
		System.out.println("Enter the room number: ");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		
		for(int i=0;i<25;i++) {
			if(booked[i]==r)
		{
			flag=1;
			break;
				
		}
		if(flag==1)
		{
			System.out.printf("Room number %d is  booked",r); 
		}
		else
		{
			System.out.printf("Room number %d is not booked",r);	
		}
	}
	
	}
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("Exit");
	}}

