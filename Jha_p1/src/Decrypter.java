
public class Decrypter {
	public static String decrypt(String input)
	{
		//swap first
		//find inverse of modulo and  + 7
		//concatenate and return for all digits
		int digits[] = new int[4];
		int i = 3, j = 0, temp = 0;
		String result = "";
		
		//store all individual digits
		while(i >=0)
		{
			temp = input.charAt(i) - '0';
			digits[i] = temp;
			i--;
		}
		
		//swap digits
		int temp1 = 0, temp2 = 0;
		temp1 = digits[0];
		digits[0] = digits[2];
		digits[2] = temp1;
		
		temp2 = digits[1];
		digits[1] = digits[3];
		digits[3] = temp2;
	
		
		//inverse modulo and +7
		for(i = 0; i<4; i++)
		{
			for(j=0; j<10; j++)
			{
				if((7+j)%10 == digits[i])
				{
					digits[i] = j;
					break;
				}
			}
		//concatenate the results
		result = result + Integer.toString(digits[i]);
		}
		return result;
	}
}


