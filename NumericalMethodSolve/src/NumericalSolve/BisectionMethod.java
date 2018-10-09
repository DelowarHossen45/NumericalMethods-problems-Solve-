package NumericalSolve;

public class BisectionMethod {
	static double tolarence=0.0001;
	static double function(double x)
	{
		double result;
		result=x*x*x-x-4;
		return result;
	}
	static void bisection(double a,double b)
	{
		 double c = a; 
		 while ((b-a) >= tolarence)
		 {  
			c = (a+b)/2; 
		        if (function(c) == 0.0) 
			            break;  
			else if (function(c)*function(a) < 0) 
				b = c; 
		        else
		            a = c; 
		} 
		System.out.print("The value of root is :"+c);

	}

	public static void main(String arg[])
	{
		double a=1,b=1;
		for(;;)
		{
			if((function(a)*function(b))<0.0)
			{
				break;
			}
			b++;
		}
		System.out.print("value of a = "+a);
		System.out.println(" value of b = "+b);
		bisection(a,b);
	}
}
