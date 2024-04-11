package Kiran_reverseint;

import java.util.Scanner;

public class Kiran_Lab05 {
	
	
	
	public static int reverseinteger(int numbers)
	{
		int a;
		a=numbers;
		int b=0,rem;
		
		while(a!=0)
		{
			rem=a%10;
			b=b*10+rem;
			a=a/10;
		}
		return b;
	}

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
	        System.out.println("Enter a number to reverse:");
	        int number = input.nextInt();
	        
	        int rev_number=reverseinteger(number);
	        System.out.println("reverse of the integer" +rev_number);
	        
	        input.close();
	}

}
