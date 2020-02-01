import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		String input = "";
		char choice;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a value: ");
		input = scanner.nextLine();

		
		System.out.print("Would you like to Encrypt or Decrypt the value?(E/D): ");
		choice = scanner.next().charAt(0);
		
		switch(choice) {
		case 'E':
			System.out.println("Encrypted Key: " + Encrypter.encrypt(input));
			break;
		case 'D':
			System.out.println("Decrypted Key: " + Decrypter.decrypt(input));
			break;
		}
		scanner.close();


	}

}
