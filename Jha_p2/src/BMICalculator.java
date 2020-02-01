
public class BMICalculator {
	
	private double weight;
	private double height;
	private double bmi;
	private String bmiCategory;
	
	
	public static void main(String[] args) {
		
	}
	
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
	}
	
	private String readUnitType()
	{
		return "";
		
	}
	
	private String readMeasurementData()
	{
		//if metric, call metric function and return 
		readMetricData();
		
		//else imperial, call imperial function and return
		readImperialData();
		return "";
	}
	
	private int readMetricData()
	{
		return 0;
	}
	
	private int readImperialData()
	{
		return 0;
	}
	
	public void calculateBmi() 
	{
		//actually calculate
		double bmi = 0;
		
		this.bmi = bmi;
		
	}
	
	public void calculateBmiCatergory()
	{
		//Take in the result from calculateBmi, do an if else
		if (this.bmi == 0)
		{
			this.bmiCategory = "some category";
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
