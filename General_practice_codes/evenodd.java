//creatorvision_shivnagGupta

/**

	Java program to find if the no. is even or odd.

**/

import java.util.*;
import java.lang.*;

class check_eo {

	long i;

	public check_eo(long i)
	{
		this.i=i;
		check();
	}
	public void check()
	{
		if(this.i%2 ==0)
		{
			System.out.println("The number entered is Even.");
		}
		else
		{
			System.out.println("The number entered is odd.");
		}
	}


}
class evenodd {

	// Client class .

	public static void main(String[] args) {
		
		System.out.println("Enter a number :");
		Scanner sc= new Scanner (System.in);
		long i=sc.nextLong();

		check_eo c= new check_eo(i);
	}
}