package JavaPrograms18;

import java.util.Scanner;

public class PalindromeNumber_08 {
//	Program 8:
//		PalindromeNumber2

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number::");
		int no=sc.nextInt();//1221
		
	
		int temp = no;//1221
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10; //1
			rev = rev*10+rem;//1221
			temp=temp/10;//.0
		}
		if(no==rev) {
			System.out.println(no+" is Palindrome number");
		}
		else {
			System.out.println(no+" is not palindrome number");
		}

	}

}
