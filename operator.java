package Pack;
public class  operator extends customer 
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
	public operator()
	{
		
	}
	public operator(String j) // Constructor overloading
	{
			String i = "ope_gen";
			Scanner in= new Scanner(System.in);
			System.out.println("enter the customer gender");
			System.out.println(i);
	}
}