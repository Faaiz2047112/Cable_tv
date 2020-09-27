import java.util.Random;
import java.util.Scanner;
class customer
{
	int Id;
	String name;
	int mobile_number;
	public void read()
	{
			Scanner scn = new Scanner(System.in);
			Random rand = new Random();
			Id = rand.nextInt(1000);
			System.out.print("enter the name = ");
			name=scn.nextLine();
			System.out.print("enter the mobile number");
			mobile_number=Integer.parseInt(scn.nextLine());
	}
	public void display()
	{
		System.out.println("CustomerId - "+this.Id);
		System.out.println("Name -"+this.name);
		System.out.println("mobile number"+this.mobile_number);
	}
}
class makes_order extends customer
{
		int order_id ;
		String order_name;
		int order_cost;
	
	public void read()
	{
		super.read();
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the order_id = ");
		order_id=Integer.parseInt(scn.nextLine());
		System.out.println("enter the name");
		order_name=scn.nextLine();
		System.out.print("enter the cost");
		order_cost=Integer.parseInt(scn.nextLine());
		
	}
	public void display()
	{
		super.display();
		System.out.println("order id - "+this.order_id);
		System.out.println("order name - "+this.order_name);
		System.out.println("order cost - "+this.order_cost);
	}
}

public class Customer1
{
		
	public static void main(String args[])
	{
		int n,i;
		makes_order obj=new makes_order();
		System.out.print("Enter the number of customer:");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		makes_order[] gs=new makes_order[n];

		for(i=0;i<n;i++)
		{
			gs[i]= new makes_order();
			System.out.println("customer Details:"+(i+1));
			gs[i].read();
		}
	}
}
