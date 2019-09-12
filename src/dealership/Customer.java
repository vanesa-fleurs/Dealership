package dealership;

public class Customer 
{
	//ATTRIBUTES
	private String nameCustomer;
	private double cashOnHand;
	private String address;
	private int creditScore;

	//employee: a customer has an employee. A dealership has an employee
	private Employee employee;

	//CONSTRUCTOR
	public Customer(String nameCustomer, int cashOnHand, String address, int creditScore)
	{
		this.nameCustomer = nameCustomer;
		this.cashOnHand = cashOnHand;
		this.address = address;
		this.creditScore = creditScore;
	}

	public Customer()
	{
		this.nameCustomer = "";
		this.cashOnHand = 0;

	}

	//METHODS...

	//purchase car method ******************************
	public void purchase(Vehicle vehicle, boolean finance, Employee emp)
	{
		// employee.handleCustomer(this.customer, true, vehicle );

		// System.out.println("Customer purchases car!");
		emp.handleCustomer(this, finance, vehicle, creditScore);
	}


	//set name ******************************
	public void setNameCustomer(String nameCustomer)
	{
		nameCustomer = this.nameCustomer;
	}

	public String getNameCustomer()
	{
		return nameCustomer;
	}


	//set cashOnHand ******************************
	public void setCashOnHand(double cashOnHand)
	{
		cashOnHand += 1000;
		cashOnHand = this.cashOnHand;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}



	//set address ******************************
	public void setAddress(String address)
	{
		address = this.address;
	}

	public String getAddress()
	{
		address += " Dealership City";
		return address;
	}

	//set creditscore ******************************
	public void setCreditScore(int creditScore)
	{
		creditScore = this.creditScore;
		//how to do: if credit score is >=800 give a $1000 bonous! 
	}

	public int getCreditScore()
	{
		return creditScore;
	}



	//toString method (idk if I need)
	@Override
    public String toString() 
    {
        return "Customer{" + "name='" + nameCustomer + '\'' + ", cash=" + cashOnHand + ", address=" + address + ", creditScore=" + creditScore + '}';
    }





}






