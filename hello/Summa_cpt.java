package hello;

import java.util.Scanner;

public class Summa_cpt {
	
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number < 10) {
	            System.out.println("Reversed number: " + number);
	            return;
	        }

	        int firstDigit = 0, lastDigit, temp = number;

	        // Extract the last digit
	        lastDigit = temp % 10;

	        // Find the first digit
	        while (temp >= 10) {
	            temp /= 10;
	        }
	        firstDigit = temp;

	        // Calculate the number without first and last digit
	        int remaining = number % (int) Math.pow(10, (int) Math.log10(number));
	        remaining /= 10;

	        // Create the new number with reversed first and last digits
	        int reversedNumber = (lastDigit * (int) Math.pow(10, (int) Math.log10(number))) + (remaining * 10) + firstDigit;

	        System.out.println("Reversed number: " + reversedNumber);
	    
	}

}
