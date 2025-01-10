package hello;

import java.util.Scanner;

public class demo {
	 
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num=sr.nextInt();
		int copy=num;
		int rem=0;
		int rev=0;
		
		 while (num>0) {
			 rem=num % 10;
			 rev = rev * 10+rem;
			 num=num / 10;
			 
		 }
		 System.out.println(rev);
		 if(rev==copy) {
			 System.out.println("the "+copy+" is palindrome");
		 }
		 else {
			System.out.println("the "+copy+" is not palindrome");
		}
	}
	
}
