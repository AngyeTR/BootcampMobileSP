package RandomNumberGenerator;

import java.util.Scanner;

public class RandomNumber {
	public String type;
	public int randomNum;
	public String generate() {
		System.out.println("Please write type (A or B)");
		Scanner scanner = new Scanner(System.in);
		type= "Type" + scanner.nextLine().toUpperCase();
		
		if(type.equals("TypeA")) {
			randomNum = (int) (Math.random() * 99999999);
			return "Random Number: 54" + randomNum;
		}
		else if(type.equals("TypeB")){
			randomNum = (int) (Math.random() * 99999999);
			return "Random Number: 08" + randomNum;
		}
		else {
			return "invalid type option. Please write A or B";
		}
		
	}	
}
	
	
	