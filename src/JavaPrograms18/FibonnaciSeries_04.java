package JavaPrograms18;

import java.util.Scanner;

public class FibonnaciSeries_04 {
//	Program 4:
//		FibonnaciSeries

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number::");
		int no = sc.nextInt();

		int a=0,b=1,c;
		
		for(int i=0;i<=no-1;i++) { //i=0,1,2,3,4,5
			c=a+b;//8,
			System.out.println(c);//1,2,3,5,8
			
			a=b;//5
			b=c;//8
		}

	}

}
