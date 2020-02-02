import java.util.Scanner;


public class BMICalculator {
	private static Scanner scanner = new Scanner(System.in);
	private double weight;
	private double height;
	private double bmi;
	private String bmiCategory;
	private String unitType;
	
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
		
		
	}
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
	}
	
	private void readUnitType()
	{
		String input = "";
		do {
		System.out.println("Would you like to measure in Metric or Imperial Data?(M/I): ");
		input = scanner.nextLine();
		input = input.toLowerCase();
		
		if(input.equals("m"))
		{
			this.unitType = "m";
		}
		else
		{
			this.unitType = "i"; 
		}
	}while( !(input.equals("m")) && !(input.equals("i")));
		
		
	}
	
	private void readMeasurementData()
	{
		//if metric, call metric function and return 
		//else imperial, call imperial function and return
		if (this.unitType.equals("m"))
		{
			readMetricData();
		}
		else if (this.unitType.equals("i"))
		{
			readImperialData();
		}
		
		
	}
	
	private void readMetricData()
	{
		double tweight = 0;
		double theight = 0;
		
		System.out.println("Enter weight in pounds: ");
		tweight = scanner.nextDouble();
		if(tweight < 0)
		{
			System.out.println("Invalid value for weight.");
			System.exit(0);
		}
		this.setWeight(tweight);
		
		
		System.out.println("Enter height in inches: ");
		theight = scanner.nextDouble();
		if(theight < 0)
		{
			System.out.println("Invalid value for height.");
			System.exit(0);
		}
		this.setHeight(theight);
		
		//if all information is valid, calculate BMI with function 
		
	}
	
	private void readImperialData()
	{
		double tweight = 0;
		double theight = 0;
		
		System.out.println("Enter weight kilograms: ");
		tweight = scanner.nextDouble();
		if(tweight < 0)
		{
			System.out.println("Invalid value for weight.");
			System.exit(0);
		}
		this.setWeight(tweight);
		
		
		System.out.println("Enter height in meters: ");
		theight = scanner.nextDouble();
		if(theight < 0)
		{
			System.out.println("Invalid value for height.");
			System.exit(0);
		}
		this.setHeight(theight);
		
		//if all information is valid, calculate BMI with function 
		
		
	}
	
	public void calculateBmi() 
	{ 
		double bmi = 0;
		
		if(this.unitType.equals("m"))
		{
			 bmi = (weight * 703)/(Math.pow(height, 2));
		}
		
		else if (this.unitType.equals("i"))
		{
			bmi = weight/(Math.pow(height, 2));
		}
		
		this.bmi = bmi;
		this.calculateBmiCategory();
	}
	
	public void calculateBmiCategory()
	{
		double temp = this.getBmi();
		//Take in the result from calculateBmi, do an if else
		if (temp <= 18.5)
		{
			this.setCategory("Underweight");
		}
		else if (temp > 18.5 || temp < 25)
		{
			this.setCategory("Normal Weight");
		}
		else if (temp>= 25 || temp <30)
		{
			this.setCategory("Over weight");
		}
		else if (temp >= 30)
		{
			this.setCategory("Obese");
		}
	}
	
	public void displayBmi()
	{
		System.out.printf("Your BMI is: %.02f, which falls under %s\n",this.getBmi(), this.getBmiCategory());

	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public void setCategory(String category)
	{
		this.bmiCategory = category;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public double getBmi()
	{
		return this.bmi;
	}
	
	public String getBmiCategory()
	{
		return this.bmiCategory;
	}
	
	
	
	
	
}
