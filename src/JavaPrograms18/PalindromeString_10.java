package JavaPrograms18;

import java.util.Scanner;

public class PalindromeString_10 {
//	Program 10:
//		PalindromeString

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	       String str = sc.next();
	       String org_str=str; //maam
	        String rev="";
	        int len=str.length();
	        for(int i = len - 1; i >= 0; i--)
	        {
	            rev = rev + str.charAt(i);//maam
	        }
	        if(org_str.equals(rev))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }

	}

}
