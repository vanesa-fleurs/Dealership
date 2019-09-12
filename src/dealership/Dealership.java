package dealership;

public class Dealership
{
	//Main class is where the java compiler looks for the main.java. This is where the code gets executed!

	public static void main (String[] args)
	{
		Customer joe = new Customer("Joe", 1000, "TAMU", 600);

		// Customer jane = new Customer();
		// jane.setNameCustomer("Jane");

		Employee charlie = new Employee("Charlie", 01);

		Vehicle mazda = new Vehicle("Mazda", 1996, "White", 2000);


		//if joe wants to purchase! 
		joe.purchase(mazda, false, charlie); //Please gain a higher credit score!
	}
}