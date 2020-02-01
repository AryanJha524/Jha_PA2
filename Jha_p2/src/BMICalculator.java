import java.util.Scanner;

public class BMICalculator {
	private static Scanner scanner = new Scanner(System.in);
	private double weight;
	private double height;
	private double bmi;
	private String bmiCategory;
	private String unitType;
	
	
	public void main(String[] args)
	{
		readUserData();
	}
	
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
	}
	
	private void readUnitType()
	{
		String input = "";
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
		System.out.println("Enter weight (in metric units: ");
		this.weight = scanner.nextDouble();
		if(this.weight < 0)
		{
			System.out.println("Invalid value for weight.");
			System.exit(0);
		}
		
		System.out.println("Enter height (in metric units: ");
		this.height = scanner.nextDouble();
		if(this.height < 0)
		{
			System.out.println("Invalid value for height.");
			System.exit(0);
		}
		
		//if all information is valid, calculate BMI with function 
		calculateBmi(this.weight, this.height);

		
	}
	
	private void readImperialData()
	{
		System.out.println("Enter weight (in imperial units: ");
		this.weight = scanner.nextDouble();
		if(this.weight < 0)
		{
			System.out.println("Invalid value for weight.");
			System.exit(0);
		}
		
		System.out.println("Enter height (in imperial units: ");
		this.height = scanner.nextDouble();
		if(this.height < 0)
		{
			System.out.println("Invalid value for height.");
			System.exit(0);
		}
		
		//if all information is valid, calculate BMI with function 
		calculateBmi(this.weight, this.height);
		
	}
	
	public void calculateBmi(double weight, double height) 
	{
		//calculating the 
		if(this.unitType.equals("m"))
		{
			
		}
		double bmi = 0;
		
		this.bmi = bmi;
		
	}
	
	public void calculateBmiCatergory()
	{
		//Take in the result from calculateBmi, do an if else
		if (this.bmi <= 18.5)
		{
			this.bmiCategory = "Underweight";
		}
		else if (this.bmi > 18.5 || this.bmi < 25)
		{
			this.bmiCategory = "Normal weight";
		}
		else if (this.bmi>= 25 || this.bmi <30)
		{
			this.bmiCategory = "Over weight";
		}
		else if (this.bmi >= 30)
		{
			this .bmiCategory = "Obese";
		}
	}
	
	public void displayBmi()
	{
		//take input from bmi and category and display. 
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
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
