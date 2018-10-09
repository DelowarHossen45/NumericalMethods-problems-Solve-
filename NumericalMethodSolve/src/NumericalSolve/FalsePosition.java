package NumericalSolve;

public class FalsePosition {
	static int MAX_ITER =1000;
	static double function(double x)
	{
		double result;
		result=x*x*x-x-1;
		return result;
	}
	static void falsepossition(double a,double b)
	{
		int i=MAX_ITER;
		 double c = a; 
		 for (;i>0;i--)
		 {  
			c=((a*function(b))-(b*function(a)))/(function(b)-function(a));
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
		falsepossition(a,b);		
	}
}
