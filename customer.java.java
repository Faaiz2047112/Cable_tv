import java.util.Random;
import java.util.Scanner;
interface method
	{
		public void read();
		public void display();
	}
class customer implements method
{
	int Sr_no;
	int id;
	StringBuffer name=new StringBuffer();
	int mobile_number;
	String address;
	String email;
	static String country ;
	static
	{
		country = "INDIA";
	}
	public void read()
	{
			Scanner scn = new Scanner(System.in);
			Random rand = new Random();
			Sr_no = rand.nextInt(1000);
			System.out.println("enter the ID ");
			id=Integer.parseInt(scn.nextLine());
			System.out.print("enter the name = ");
			name.append(scn.nextLine());
			System.out.print("enter the mobile number");
			mobile_number=Integer.parseInt(scn.nextLine());
			System.out.println("enter the customer address");
			address=scn.nextLine();
			System.out.println("enter the mail");
			email=scn.nextLine();
	}
	public void display()
	{
		System.out.println("Serial no - "+this.Sr_no);
		System.out.println("Customer ID - "+this.id);
		System.out.println("Name -"+this.name);
		System.out.println("mobile number"+this.mobile_number);
		System.out.println("address - "+this.address);
		System.out.println("email - "+this.email);
		System.out.println("country - "+this.country);
	}
	
}
class  operator extends customer 
{
		int Ope_id;
		String Ope_name;
		final int Ope_Mobilenumber=9632587;
		String Ope_address;
		String Ope_email;
	
	
	public void read()
	{
		super.read();
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the operator Id");
		Ope_id=Integer.parseInt(scn.nextLine());
		System.out.println("enter the Operator name ");
		Ope_name=scn.nextLine();
		System.out.println("enter the operator address");
		Ope_address=scn.nextLine();
		System.out.println("enter the operator email");
		Ope_email=scn.nextLine();
	}
	public void display()
	{
			super.display();
			System.out.println("operator id - "+this.Ope_id);
			System.out.println("operator name - "+this.Ope_name);
			System.out.println("operator mobile_number - "+this.Ope_Mobilenumber);
			System.out.println("operator address - "+this.Ope_address);
			System.out.println("operator email - "+this.Ope_email);
	}
	public void display(int ope_id) //funtion overloading with one argument//
	{
			super.display();
			System.out.println("operator id - "+this.Ope_id);
			System.out.println("operator name - "+this.Ope_name);
			System.out.println("operator mobile number -"+this.Ope_Mobilenumber);
			System.out.println("operator address - "+this.Ope_address);
			System.out.println("operator email - "+this.Ope_email);
	}
	operator()
	{
		
	}
	operator(String j) // Constructor overloading
	{
			String i = "ope_gen";
			Scanner in= new Scanner(System.in);
			System.out.println("enter the customer gender");
			System.out.println(i);
	}
}

public class Customer1
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
