package NumericalSolve;

import java.util.Scanner;

public class NewtonRapson {
	static double f(double x)   
	{
	    double a=x*x*x-x-11.0;    
	    return a;
	}
	static double fprime(double x)
	{
	    double b=3*x*x-1.0;        //write the first derivative of the equation
	    return b;
	}
	
	public static void  main(String arg[])
	{
		Scanner cin=new Scanner(System.in);
	    double x=0.0,x1,e,fx,fx1;
	    System.out.println("Enter the initial guess");
	    x1=cin.nextDouble();
	    System.out.println("Enter desired accuracy");
	    e=cin.nextDouble();
	    fx=f(x1);                
	    fx1=fprime(x);                  
	    for(;fabs(x1-x)>=e;)           
	    {
	        x=x1;               
	        fx=f(x);           
	        fx1=fprime(x);            
	        x1=x-(fx/fx1);    
			//System.out.println("The value of root is :"+x1);

	    }            
		System.out.print("The value of root is :"+x1);
		cin.close();
	}
	private static double fabs(double d) {
		double result;
		result=d;
		if(result<0)
		{
			result=result*-1;
		}
		return result;
	}
}
