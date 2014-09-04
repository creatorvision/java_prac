//creatorvision_ShivangGupta
import java.util.*;
import java.io.*;
import java.lang.*;

class evaluate{

	int a[];

	 evaluate(int a[])
	{
		this.a=a;
		ret_res(this.a);
	}
	public void ret_res(int a[])
	{
		if(a[0]>a[1])
		{
			if(a[1]>a[2])
			{
				System.out.println(a[0]); 
			}
			else
			{
				if(a[2]>a[0])
				{
					System.out.println(a[2]); 
				}
				else
				{
					System.out.println(a[0]);
				}
			}
		}
		else
		{
			if(a[2]>a[1])
			{
				System.out.println(a[2]);
			}
			else
			{
				System.out.println(a[1]);
			}
		}
	}

}

class Larger_ofthree{

	//Client class change it as per requirement.

	public static void main(String[] args) throws IOException ,ArrayIndexOutOfBoundsException
	{
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Three Integral values :");
		int a[]=new int[3];

		for (int i=0;i<3;i++ ) {
			// Getting three integers.
			a[i]=sc.nextInt();
			System.out.println();
		}
		evaluate e= new evaluate(a);
	}
}
