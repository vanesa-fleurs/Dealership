package dealership;

public class Employee 
{
	//attributes
	String nameEmployee;
	int employeeId;

	//need to add a customer. 

	//constructor
	public Employee(String nameEmployee, int employeeId)
	{
		this.nameEmployee = nameEmployee;
		this.employeeId = employeeId;
	}


	//methods
	public void greet()
	{
		System.out.println("Welcome " + /*toString()*/  + " !"); 
	}

	public toString()
	{
		return /*nameEmployee*/ ;
	}

	//runcontract method
	public void runContract(Customer customer, double finalPrice)
	{
		//make to string:
		//Type casting, Java lets you create a new string obj.
		//double is a system type (so maybe look up doubletostring)
		System.out.println();
	}

	public void handleCustomer(Customer cust, /*double cashOnHand,*/boolean finance, Vehicle v, int creditScore)
	{
		if(finance == true && creditScore >= 700)
		{
			//variable of type double to store the final price
			double finalPrice = v.getCarPrice() - cust.getCashOnHand()
			// runContract(/*customer object*/customer, carPrice.getPrice() - cashOnHand);
			
		}
		// else if(vehicle.getPrice <= customer.getcashOnHand)
		// {
		// 	runFinalSale(Customer customer, Vehicle carPrice);
		// }
		else
		{
			//run method, sorry come again later
			System.out.println("Please come back when you meet both creterias :D ");
		}
	// }
}

// w/diff objects, you can access their varisbles form their class : objectName.variablename



