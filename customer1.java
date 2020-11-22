import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import Pack.*;


public class customer1
{
		
	public static void main(String args[])
	{
		int n,i;
		operator obj=new operator();
		n=Integer.parseInt(args[0]);
		operator[] gs=new operator[n];

		for(i=0;i<n;i++)
		{
			gs[i]= new operator();
			System.out.println("customer Details:"+(i+1));
			gs[i].read();
			gs[i].display();
		}
		for(i=0;i<n;i++)	
      System.out.println("Elements in the array are:: ");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the index of the required element ::");
      try {
         int element = sc.nextInt();
         System.out.println("Element in the given index is :: ");
	gs[element].display();
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("The index you have entered is invalid");
      }
	  
   }
}