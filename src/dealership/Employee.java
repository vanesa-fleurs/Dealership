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
		System.out.println("Welcome " + /*toString()*/"!"); 
	}




	public void handleCustomer(Customer cust, boolean finance, Vehicle v, int creditScore)
	{
		if(finance == true && creditScore >= 700)
		{
			//variable of type double to store the customer's loan (face value)
			double loanPrice = v.getCarPrice() - cust.getCashOnHand();
			runContract(cust, loanPrice);
			
		}
		else if(v.getCarPrice() <= cust.getCashOnHand())
		{
			runFinalSale(cust, v);
		}
		else
		{
			//run method, sorry come again later
			System.out.println("Please come back when you meet both creterias to purchase " + v + " .");
		}
	}
	//runcontract method
	public void runContract(Customer cust, double loanPrice)
	{
		//make to string:
		//Type casting, Java lets you create a new string obj.
		//double is a system type (so maybe look up doubletostring)
		System.out.println("Contract ran succesfully!");
	}

	//runFinalSale method
	public void runFinalSale(Customer cust, Vehicle v)
	{
		System.out.println("Alright, no loan neededfor " + v + " for the price of " + v.getCarPrice() + " !");
	}



}

// w/diff objects, you can access their varisbles form their class : objectName.variablename



