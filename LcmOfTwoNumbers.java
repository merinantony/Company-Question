package interviewquestions;
import java.util.Scanner;
public class LcmOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		int i,min,max,x;
		int lcm=0;
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
		arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		for(int j=i+1;j<n-1;j++)
		{
		if(arr[i]>arr[j])
		{
		min=arr[j];
		max=arr[i];
		}
		else
		{
		min=arr[i];
		max=arr[j];
		}
		for(int k=0;k<n;k++)
		{
		x=k*max;
		if(x%min==0)
		{
		lcm=x;
		}  
		}
		}
		}
		      System.out.println("LCM is "+lcm);
		      s.close();
		}
		}