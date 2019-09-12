package dealership;

public class Dealership
{
	//Main class is where the java compiler looks for the main.java. This is where the code gets executed!

	public static void main (String[] args)
	{
		Customer joe = new Customer("Joe", 3000, "TAMU", 600);

		// Customer jane = new Customer();
		// jane.setNameCustomer("Jane");

		Employee charlie = new Employee("Charlie", 01);

		Vehicle mazda = new Vehicle("Mazda", 1996, "White", 2000);


		//joe purchases! 
		joe.purchase(mazda, true, charlie);
	}
}