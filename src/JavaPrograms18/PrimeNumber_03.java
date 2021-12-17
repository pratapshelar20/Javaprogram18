package JavaPrograms18;

import java.util.Scanner;
//Program 3:
//PrimeNumber

public class PrimeNumber_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number::");
		int n= sc.nextInt();
		
		int temp=0;
		for(int i=2;i<=n-1;i++) {     //2-3
			if(n%i==0) {
				temp= temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Number is  Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}

	}

}
