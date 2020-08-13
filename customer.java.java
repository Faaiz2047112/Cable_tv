import java.util.Scanner;
import java.util.*;
import java.io.*;
public class customer
{
	public static void main(String args[])
    {
		int number;
		Scanner input = new Scanner(System.in);
		Scanner stdin = new Scanner(System.in);
		int[] cust_id = new int[20];

		int[] cust_mobile_no = new int[11];
		System.out.println("enter the number of the customer");
		number=stdin.nextInt();
		String[] cust_name = new String[20];
	   for(int i=0;i<number;i++)
	{
		System.out.println("\n Enter the CustomerName: ");
	   cust_name[i] = stdin.next();
           System.out.println("\n Enter the CustomerId: ");
	   cust_id[i] = stdin.nextInt();            
           System.out.println("\n Enter the mobile number: ");
	   cust_mobile_no[i] = stdin.nextInt();
	}

	PrintcustomerDetails(cust_id,cust_name,cust_mobile_no);
	input.close();
	stdin.close();
    }
	public static void PrintcustomerDetails(int[] cust_id,String[] cust_name,int[] cust_mobile_no)
    {
        int n = cust_name.length;
	System.out.println("\n\ncustomer details:  ");
        for (int i = 0; i < n; i++) 
	{
		if (cust_name[i] != null)
		{
                 System.out.println("customer id: "+cust_id[i]+" customer Name: "+cust_name[i]+" customer mobile number: "+cust_mobile_no[i]);
    		}  
       }
    }
}