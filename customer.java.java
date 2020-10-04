import java.util.Random;
import java.util.Scanner;
class customer
{
	int Sr_no;
	int id;
	String name;
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
			name=scn.nextLine();
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
	}
}
class operator extends customer
{
		int Ope_id;
		String Ope_name;
		int Ope_Mobilenumber;
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
		System.out.println("enter the Operator mobile mumber");
		Ope_Mobilenumber=Integer.parseInt(scn.nextLine());
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
			System.out.println("operator mobile number -"+this.Ope_Mobilenumber);
			System.out.println("operator address - "+this.Ope_address);
			System.out.println("operator email - "+this.Ope_email);
	}
}
class channels extends operator
{
	String Chnl_name;
	int Chnl_number;
	String Chnl_type;
	public void read()
	{
		super.read();
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the channel name : ");
		Chnl_name=scn.nextLine();
		System.out.println("enter the channel number :");
		Chnl_number=Integer.parseInt(scn.nextLine());
		System.out.println("enter the Channel type : ");
		Chnl_type=scn.nextLine();
	}
	public void display()
	{
			super.display();
			System.out.println("Chanal ame -"+this.Chnl_name);
			System.out.println("Chanal number -"+this.Chnl_number);
			System.out.println("Channel type -"+this.Chnl_type);
	}
}
public class Customer1
{
		
	public static void main(String args[])
	{
		int n,i;
		channels obj=new channels();
		System.out.print("Enter the number of customer:");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		channels[] gs=new channels[n];

		for(i=0;i<n;i++)
		{
			gs[i]= new channels();
			System.out.println("customer Details:"+(i+1));
			gs[i].read();
		}
	}
}			gs[i].read();
		}
	}
}
