//creatorvision_ShivangGupta
import java.util.*;
import java.io.*;
import java.lang.*;

class eval
{
	int a[];

	eval(int a[])
	{
		 this.a=a;
		return_result(this.a);
	}
	public void return_result(int a[])
	{
		int b;
		b=((a[0]>a[1])?((a[2]>a[0])?(a[2]):(a[0])):((a[2]>a[1])?(a[2]):(a[1])));
		System.out.println(b);
		System.out.println();
	}
}

class InputInvalidException extends Throwable
{
	int cnt;
	int b[];

	InputInvalidException(int cnt, int a[])
	{
		try
		{
			System.out.println("*---INVALID INPUT TYPE (PLEASE RE-ENTER INTEGER VALUES ONLY)---*");
			Scanner sc=new Scanner(System.in);
			this.cnt=cnt;
			b=a;
			int count=cnt;
			for(int j=cnt;j<3;j++)
			{
				// Getting three integers.
				if(sc.hasNextInt())
				{
					count++;
					b[j]=sc.nextInt();
					System.out.println();
				}
				else
				{
					throw new InputInvalidException(count,b);
				}
			}
			eval e= new eval(b);
		}
		catch(InputInvalidException e)
		{

		}
	}

}

class Largerofthree_efficient
{
	//Client class change it as per requirement.

	public static void main(String[] args) throws IOException ,ArrayIndexOutOfBoundsException
	{
		try
		{
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter Three Integral values :");
			int a[]=new int[3];
			int cnt=0;

			for (int i=0;i<3;i++ ) {
				// Getting three integers.
				if(sc.hasNextInt())
				{
					cnt++;
					//System.out.println("cnt:"+cnt); --- use to debug.
					a[i]=sc.nextInt();
					System.out.println();
				}
				else
				{
					throw new InputInvalidException(cnt,a);
				}
			}
			eval e= new eval(a);
		}
		catch (InputInvalidException exp)
		{

		}
	}
}