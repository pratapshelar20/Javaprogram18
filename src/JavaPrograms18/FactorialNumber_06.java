package JavaPrograms18;

import java.util.Scanner;

public class FactorialNumber_06 {
//	Program 6:
//		Factorial Number

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number::");
		int no = sc.nextInt();//4
		int fact=1;
		for(int i=1;i<=no;i++) {//i=1,2,3,4,5
			fact = fact*i;//24
		}
		System.out.println(fact);
	}


	}


