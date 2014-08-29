//creatorvision_Shivang Gupta

import java.util.*;
import java.lang.*;


class Mycomplex {

	double real,imag;
	
    Mycomplex(double x, double y)
    {
    	this.real= x;
    	this.imag= y;
    }
	
    public void display_val()
    {
    	System.out.println(real+" "+imag+"i");
    }

	public void set_real (double x)
	{
		this.real=x;
	}
	public void set_img (double y)
	{
		this.real=y;
	}

	public double get_real ()
	{
		return this.real;
	}
	public double get_img ()
	{
		return this.imag;
	}

	public boolean isReal ()
	{
		if(this.real!=0.0d && this.imag == 0.0d)
			return true;
		else
			return false;
	}

	public boolean isImaginary ()
	{
		if(this.imag != 0.0d&& this.real==0.0d )
		{
			return true;
		}
		else 
			return false;
	}

	public boolean equal (double x, double y)
	{

		if(this.real == x && this.imag == y)
		{
			return true;
		}
		else
			return false;
	}

	public double magnitude ()
	{

		double z= Math.sqrt((this.real*this.real)+(this.imag*this.imag));

		return z;
	}

	public boolean equal (Mycomplex c)
	{
		if(equal(c.real, c.imag))
		{
			return true;
		}
		else
			return false;
	}

	public Mycomplex conjugate()
	{
		Mycomplex c= new Mycomplex(0.0d,0.0d);
		c.real=this.real;
		c.imag=-(this.imag);
		return c;
	}
	public Mycomplex add(Mycomplex c)
	{
		Mycomplex res = new Mycomplex(0.0d,0.0d);

		res.real=c.real+this.real;
		res.imag= c.imag+this.imag;

		return res;
	}
	public Mycomplex sub(Mycomplex c)
	{
		Mycomplex res_s = new Mycomplex(0.0d,0.0d);

		res_s.real=-c.real+this.real;
		res_s.imag=-c.imag+this.imag;

		return res_s;
	}

	public Mycomplex complex_multiplication(Mycomplex c2)
    {
    	Mycomplex c=new Mycomplex(0.0d,0.0d);
    	c.real=((this.real)*(c2.real))-((this.imag)*(c2.imag));
    	c.imag=((this.real)*(c2.imag))+((this.imag)*(c2.real));
    	return c;
    } 

    public Mycomplex complex_division(Mycomplex c2)
    {
    	Mycomplex c=new Mycomplex(0.0d,0.0d); 
        c.real=(((this.real)*(c2.real))+((this.imag)*(c2.imag)))/(((c2.real)*(c2.real))-((c2.imag)*(c2.imag)));
        c.imag=(-((this.real)*(c2.imag))+((this.imag)*(c2.real)))/(((c2.real)*(c2.real))-((c2.imag)*(c2.imag)));
        return c;
    }
}

public class Mycomplex_main{

	// CLIENT CLASS SO YOU CAN ALTER IT AS PER CLIENT'S REQUIREMENT.

    public static void main(String[] args) { 

    	Mycomplex m= generate();
    	display();
    	Scanner sc= new Scanner(System.in);
    	int selec=sc.nextInt();

    	while(selec!=7 && selec<7)
    	{
	    	switch(selec){

	    		case 1:
	    		{
	    			Mycomplex my1 = generate();
	    			Mycomplex res_add_m=m.add(my1);
	    			res_add_m.display_val();
	    			break;   				
	    		}
	    		case 2:
	    		{
	    			Mycomplex my1 = generate();
	    			Mycomplex res_sub_m=m.sub(my1);
	    			res_sub_m.display_val();
	    			break;
	    		}
	    		case 3:
	    		{
	    			Mycomplex my1 = generate();
	    			Mycomplex res_multi_m=m.complex_multiplication(my1);
	    			res_multi_m.display_val();
	    			break;
	    		}
	    		case 4:
	    		{
	    			Mycomplex my1 = generate();
	    			Mycomplex res_div_m=m.complex_division(my1);
	    			res_div_m.display_val();
	    			break;
	    		}
	    		case 5:
	    		{
	    			Mycomplex my1 = generate();
	    			if(my1.equal(m) == true)
	    			{
	    				System.out.println("BOTH COMPLEX NO.S ARE EQUAL");
	    			}
	    			else
	    			{
	    				System.out.println("BOTH COMPLEX NO.S ARE NOT EQUAL");
	    			}
	    			break;
	    		}
	    		case 6:
	    		{
	    			Mycomplex my1 = generate();
	    			if(my1.isReal()== true)
	    			{
	    				System.out.println("Complex No is purely Real");
	    			}
	    			else if(my1.isImaginary()==true)
	    			{
	    				System.out.println("Complex No. is purely Imaginary");
	    			}
	    			else
	    			{
	    				System.out.println("Complex No. is Imaginary");
	    			}
	    		}
	    	}

	    	selec=sc.nextInt();
	    	System.out.println();
	    }
    	
  }
  		public static Mycomplex generate()
  		{

  		Scanner sc= new Scanner(System.in);
  		System.out.println("ENTER THE REAL PART OF THE COMPLEX NO. :");
	    double rl_temp=sc.nextDouble();
	    System.out.println("ENTER THE IMAGINARY PART OF THE COMPLEX NO. :");
	    double img_temp=sc.nextDouble();
	    Mycomplex m_temp;
	    m_temp= new Mycomplex(rl_temp,img_temp);
	    System.out.println("Imaginary No. Entered: "+rl_temp+" "+img_temp+"i");
	    System.out.println("It's Magnitude :" +m_temp.magnitude());
	    Mycomplex m_temp2= m_temp.conjugate();
	    System.out.println("Conjugate of the Imaginary No. Entered: "+m_temp2.real+" "+m_temp2.imag+"i");
	    System.out.println();
	    System.out.println();

	    return m_temp;

  		}
  		// DISPLAY METHOD TO SHOW MENU TO THE CLIENT AND ASKING THEM WHAT ACTION THEY WANT TO PERFORM.
  		public static void display(){
  		System.out.println("------------------MENU-------------------");
    	System.out.println("1.  ADD  TWO COMPLEX NUMBERS ");
    	System.out.println("2. SUBTRACT TWO COMPLEX NUMBERS ");
    	System.out.println("3. MULTIPLY TWO COMPLEX NUMBERS ");
    	System.out.println("4. DIVIDE TWO COMPLEX NUMBERS ");
    	System.out.println("5. COMPARE TWO COMPLEX NUMBERS");
    	System.out.println("6. Is Real or Is Imaginary");
    	System.out.println("7. EXIT ");
    	System.out.println();
    	System.out.println(" ENTER YOUR SELECTION :");
    }
 }
