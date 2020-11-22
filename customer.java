package Pack;
public class customer implements method
{
	int Sr_no;
	int id;
	StringBuffer name=new StringBuffer();
	int mobile_number;
	String address;
	String email;
	public static String country ;
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