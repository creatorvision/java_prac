//creatorvision_ShivnagGupta

import java.util.*;
import java.io.*;
import java.lang.*;

class Stack_char{

int maxSize;
char[] stackArray;
int top;

 public Stack_char(int s) {
    maxSize = s;
    stackArray = new char[maxSize];
    top = -1;
  }
 public void push(char key) {
   stackArray[++top] = key;
  }
 public char pop() {
   return stackArray[top--];
  }
 public char top() {
   return stackArray[top];
  }
 public boolean isEmpty() {
   return (top == -1);
  }
 public boolean isFull() {
   return (top == maxSize - 1);
  }
 public void display()
  {
    if (top > 0)
      {
        System.out.println("Elements in stack are :");  
         for (int i = 0; i < top; i++) 
          {  
             System.out.println(stackArray[i]); 
          }

      }
  }
}

public class InfixToPostfix {
 
 public boolean isOperator(char c){
  if(c == '+' || c == '-' || c == '*' || c =='/' || c == '$')
   return true;
  return false;
 }
  
 public boolean checkPrecedence(char c1, char c2){
  if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
   return true;
  else if((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
   return true;
  else if((c2 == '$') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
   return true;
  else
   return false;
 }

 public String convert(String infix)
 {
   try
   { 
      String postfix = "";  
      Stack_char s = new Stack_char(infix.length());
      s.push('#');
     
     
      for(int i = 0; i < infix.length(); i++)
      {
       char ch = infix.charAt(i);
       if(isOperator(ch))
       { 
          while(checkPrecedence(ch, s.top()))
           postfix += s.pop();
          s.push(ch);
       }
       else if(ch == '(')
          s.push(ch); 
       else if(ch == ')')
       {
          while(s.top() != '(')
           postfix += s.pop();
          s.pop();
       }
       else if((ch >='a' && ch<='z')||(ch >='A'&& ch<='Z') ||(ch >='0'&& ch<='9'))
        postfix += ch;
       else
        {
          throw new InvalidExpression();
        }
      }
     
      //pops all elements of stack left
      while(s.top() != '#'){
       postfix += s.pop();
      }
       
      return postfix;
    }
    catch (InvalidExpression exp)
    {
      System.out.println(exp);

    }
    return "";
 }
  
static class InvalidExpression extends Throwable // Exception Handling Developed.
{
  public String toString(){
    return "*---INVALID INPUT---*";
  }
}

public static boolean rank_check(String input)
{
  try{
    String inp_str;
    int rank=0;
    int rnk=0;
    inp_str=input;
    for (int z =0;z<inp_str.length(); z++ ) {
      
      char a= inp_str.charAt(z);
      if(a=='+'||a=='-'||a=='*'||a=='/'||a=='$')
      {
        rank=rank-1;
      }
      else if((a >='a' && a<='z')||(a >='A'&& a<='Z') ||(a>='0'&& a<='9'))
      {
        rank=rank+1;
      }
      else if (a=='(')
      {
        rnk++;
      }
      else if(a==')')
      {
        rnk--;
      }
      else
      {
        throw new InvalidExpression();
      }

    }
    if(rank<0 || rnk!=0)
    {
      throw new InvalidExpression();
    }
  }
  catch (InvalidExpression exp)
    {
      System.out.println(exp);

    }
  return true;
}

public static void main(String[] args) throws IOException ,ArrayIndexOutOfBoundsException
  {
  //Client class
  while (true)
      {
        System.out.println(" -------------Enter the infix expresion (press  CTRL+ C + ENTER  to exit) :-------------");
        try
        {

          InfixToPostfix obj = new InfixToPostfix();
          Scanner sc = new Scanner(System.in);
          System.out.print("Infix : \t");
          String infix = sc.next();
          boolean flg=rank_check(infix);
          if(flg)
          {
            System.out.print("Postfix : \t"+obj.convert(infix));
            System.out.println();
          }

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
              e.printStackTrace();
        }

      }
 }

}