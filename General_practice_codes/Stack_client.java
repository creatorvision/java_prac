//creatorvision_shivnagGupta

/**
	Implementing Stack Data Structure.
**/

import java.util.*;
import java.lang.*;

class stack{

	int []arr;
	int size;
	int ptr;

	stack()
	{
		arr = new int [100];
		size =100;
		ptr=0;
	}
	stack(int size)
	{
		this.size=size;
		arr =new int[this.size];
		ptr=0;
	}
	protected void push(int val)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
			System.exit(0);
		}
		else
		{
			arr[ptr++]=val;
			System.out.println("Push operation done.");
		}
	}
	protected int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			System.exit(0);
		}
			System.out.println("Pop operation done.");
			return arr[--ptr];
	}
	boolean isEmpty()
	{
		if(ptr ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isFull()
	{
		if(ptr >= size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		if (ptr > 0)
		{
		    System.out.println("Elements in stack :");  
			for (int i = 0; i < ptr; i++) 
			{  
			   System.out.println(arr[i]); 
			}

		}
	}
}

class Stack_client{

	public static void main(String[] args) {

		// Client class 
		
		stack s1 = new stack();
		stack s2 = new stack(5);
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the number of elements that you want to push in Stack_1 :");
		int n=sc.nextInt();
		System.out.println();
		System.out.println("Enter the elements that you want to push in Stack_1 :");
		for(int j=0;j<n;j++)
		{
			s1.push(sc.nextInt());
		}
		s1.display();
		System.out.println();

		int poped;
		poped= s1.pop();
		System.out.println("The number poped is :"+ poped);
		poped= s1.pop();
		System.out.println("The number poped is :"+ poped);

		//poped=s2.pop();  --- This will give Stack underflow as s2 was empty initially and without pushing we just poped.
		
		//System.out.println("The number poped is :"+ poped);      
		System.out.println("Enter the elements that you want to push in Stack_2 :");
		while(true)
		{
			if(s2.isFull())
			{
				System.out.println(" Stack is Full now.");
				break;
			}  
			// here if we don't give this if condition for break the infinite loop will run 
			// and thus we will get unreachable statement error (checked by compiler).
			s2.push(sc.nextInt());
		}
		s2.display();
		
		for(int j=0;j<6;j++) // here I kept j from 0 to 6 to show stack underflow condition.
		{
			poped= s2.pop();
			System.out.println("The number poped is :"+ poped);
		}		
	}
} 