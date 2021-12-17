package JavaPrograms18;

public class Star2_17 {

	public static void main(String[] args) {
//		Program 17:
//			Star2
		for(int i=1;i<=41;i++) //i=3
	    {
		    for(int j=3;j>=i;j--)//i=2
		    {
			   System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++) {//i=2
			System.out.print("*");
		    } 
		  System.out.println(" ");
	    }



	}

}
