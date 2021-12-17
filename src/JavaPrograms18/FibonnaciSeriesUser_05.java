package JavaPrograms18;

import java.util.Scanner;

public class FibonnaciSeriesUser_05 {
//	Program 5:
//		FibonnaciSeries taking input from user

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number::");
		int no = sc.nextInt();
		int a=0,b=1,c;
		
		for(int i=1;i<=no;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
