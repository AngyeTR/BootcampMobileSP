package SortingAlg;

import java.util.Scanner;

public class SortingAlgorithms {
	
	
	public void sort() {
		
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
