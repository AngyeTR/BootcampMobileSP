package challenge1;

import java.util.Scanner;

public class Challenge1 {
		
	// First part: get a random 10 digits number, starting with 54 or 08 based on selected type
	public String generateRandomNumber() {
		String type;
		int randomNum;
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
	
	
	
	//Second part: get a random number array and sort it as selected.
	public void sortRandomArray() {
		
		// Get a number to create the array
		System.out.println("Please write de quantity you want to sort");
		Scanner scanner = new Scanner(System.in);
		int quantity=  scanner.nextInt();
		int [] arr=new int[quantity];
		// Create the array with random numbers
		for(int i = 0; i< quantity; i++) {
			arr[i]= (int) (Math.random() * 99);
			System.out.print(arr[i] + " ");
		}
		//get the sorting type
		System.out.println("\n Please write de sorting type (ASC or DES)");
		Scanner scanner2 = new Scanner(System.in);
		String type=  scanner2.nextLine().toUpperCase();
		
		
		// Sort from lower to higher
		if(type.equals("ASC")) {
			int minimum, maximum;
	        for (int i = 0; i < arr.length; i++) 
	        { 
	        	minimum = i; 
	            for (int j = i+1; j < arr.length; j++) 
	           {
	                if (arr[j] < arr[minimum])                  
	                {
	                	minimum = j;
	                }
	            }
	            maximum = arr[minimum];   
	            arr[minimum] = arr[i]; 
	            arr[i] = maximum; 
	        } 
	        for (int i=0; i<arr.length; i++) 
	        {
	            System.out.print(arr[i]+" ");
	        }  
	        
		}
		//sort from higher to lower
		else if(type.equals("DES")){ 
			int minimum, maximum;
	        for (int i = 0; i < arr.length; i++) 
	        { 
	        	maximum = i; 
	            for (int j = i+1; j < arr.length; j++) 
	           {
	                if (arr[j] > arr[maximum])                  
	                {
	                	maximum = j;
	                }
	            }
	            minimum = arr[maximum];   
	            arr[maximum] = arr[i]; 
	            arr[i] = minimum; 
	        } 
	        for (int i=0; i<arr.length; i++) 
	        {
	            System.out.print(arr[i]+" ");
	        }  
			
		}
		// invalid type
		else {
			System.out.println("Invalid sorting type. Please wirte ASC or DES");
		}    
    } 	
	

}
