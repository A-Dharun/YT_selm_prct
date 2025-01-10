package hello;

import java.util.Scanner;

public class Revers_String {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter String value");
		String  s1=scn.next();
	//	String  s1="RAGUL";
		char ch=' ';
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			ch=s1.charAt(i);
			rev=rev+ch;
		}
		if(s1.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	
	}
}
