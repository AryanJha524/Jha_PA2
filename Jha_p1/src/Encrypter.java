
public class Encrypter {
	public static String encrypt (String input)
	{
		int temp;
		String result = "";
		int[] digits = new int[4];
		int i = 3;
		//stores individual digits within an array and manipulates them.
		while (i>=0)
		{
			temp = input.charAt(i) - '0';
			digits[i] = temp;
			digits[i] = (temp+7)%10;
			i--;
		}
		
		//swapping digits
		int temp1 = 0;
		temp1 = digits[0];
		digits[0] = digits[2];
		digits[2] = temp1;
		
		int temp2 = 0;
		temp2 = digits[1];
		digits[1] = digits[3];
		digits[3] = temp2;
		
		for (i=0; i<4; i++)
		{
			result = result + Integer.toString(digits[i]);
		}
	return result;
		
	}


}
