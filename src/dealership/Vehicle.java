package dealership;

public class Vehicle 
{
	private String carName;
	private int carYear;
	private String carColor;
	private double carPrice;


	//constructor
	public Vehicle(String carName, int carYear, String carColor, double carPrice)
	{
		this.carName = carName;
		this.carYear = carYear;
		this.carColor = carColor;
		this.carPrice = carPrice;
	}

	public Vehicle()
	{
		this.carName = "";
		this.carYear = 0;
		this.carColor = "carColor";
		this.carPrice = 0;
	}

	//methods
	//not sure yet... 

	//price
	public void setCarPrice(double carPrice)
	{
		carPrice = this.carPrice;
	}

	public double getCarPrice()
	{
		return carPrice;
	}

	//carColor
	public void setCarColor(String carColor)
	{
		carColor = this.carColor;
	}

	public String getCarColor()
	{
		return carColor;
	}



	//carYear
	public void setCarYear(int carYear)
	{
		carYear = this.carYear;
	}

	public int getCarYear()
	{
		return carYear;
	}


	//carName
	public void setCarName(String carName)
	{
		carName = this.carName;
	}

	public String getCarName()
	{
		return carName;
	}

}