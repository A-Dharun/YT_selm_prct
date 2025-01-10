package hello;

import java.util.Scanner;

public class revers_int {
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
			
			System.out.print("enter num: ");
			int num = sr.nextInt();
			int rem=0;
			int rev=0;
			int copy=num;
			while(num>0) {
				rem = num % 10;
				rev=rev*10+rem;
				num = num /10;
	
			}
			if (copy == rev){
				System.out.print("palindrome");
	
			}
			else {
				System.out.print("not palindrome");
			}
		
	}

}
