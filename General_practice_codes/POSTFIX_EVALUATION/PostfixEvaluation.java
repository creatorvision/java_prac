//creatorvision_shivanggupta

/**
  Program to Evaluate Postfix Expression.
**/

import java.util.*;
import java.lang.*;
import java.io.*;  

class Stack  
{  
   protected int[] a;  
   protected int top,m;  

   public Stack(int max)  
   {  
     m=max;  
     a=new int[m];  
     top=0;  
   }  
   public void push(int key)  
   {  
     a[top++]=key;  
   }  
   public int pop()  
   {  
     return(a[--top]);  
   }  
   boolean isEmpty()
  {
    if(top == 0)
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
    if(top >= m)
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
    if (top > 0)
    {
        System.out.println("Elements in stack are :");  
      for (int i = 0; i < top; i++) 
      {  
         System.out.println(a[i]); 
      }

    }
  }
}  

class Evaluation{  
      
   public int calculate(String s)  
    {  
      int n,r=0; 
      n=s.length();  
      Stack a=new Stack(n);  
  for(int i=0;i<n;i++)  
      {  
        char ch=s.charAt(i);  
          if(ch>='0'&&ch<='9')  
            a.push((int)(ch-'0'));  
          else  
           {  

             int x=a.pop();  
             int y=a.pop();  
             switch(ch)  
             {  
               case '+':r=x+y;  
                  break;  
               case '-':r=y-x;  
                  break;  
               case '*':r=x*y;  
                  break;  
               case '/':r=y/x;  
                  break;  
               case '$':r=(int)Math.pow(x,y);
                  break;
               default:r=0;  
             }  
              a.push(r);  
           }  
     }  
      //a.display();
        //System.out.println(a.a.length);
        if(a.top == 1)
        {
         r=a.pop();  
         return(r);
        }
        else
        {
          System.out.println("Invalid Expression Entered .");
          return(0);
        }
       }  
}  

class PostfixEvaluation  
  {  
       
    public static void main(String[] args)throws IOException ,ArrayIndexOutOfBoundsException 
      {  
        String input;  
        while(true)  
        {  
           System.out.println("Enter the postfix expresion (to end just press enter) :");  
           try
           {
              input=getString();  
              if(input.equals(""))  
                break;
              Evaluation e=new Evaluation();  
              System.out.println("Result: "+ e.calculate(input)); 
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
              e.printStackTrace();
           } 
         }  
      }  
      
    public static String getString()throws IOException  
     {

      Scanner sc = new Scanner(System.in);
      String s= sc.nextLine();
      return s;

     }  
  }  