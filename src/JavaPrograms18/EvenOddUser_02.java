package JavaPrograms18;

import java.util.Scanner;

public class EvenOddUser_02 {
    //Program 2:
	//EvenOdd number taking value from user

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number::");
		int a = sc.nextInt();
		//int a=20;
		if(a%2==0) {
			System.out.println("Mentioned Number is Even");
		}
		else {
			System.out.println("Mentioned Number is odd");
		}
	

	}

}
