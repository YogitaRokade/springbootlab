package calculatorboot.logic;

public class Calc {
	public static int addNo(int n1,int n2)
	{
		return n1+n2;
	}
	public static int subNo(int n1,int n2)
	{
		return n1-n2;
	}
	public static double multiNo(double num1,double num2)
	{
		return num1*num2;
	}
	public static double divNo(double num1,double num2) throws ArithmeticException
	{
		
		if (num2 == 0)
		{
			throw new  ArithmeticException("Divide by zero is not possible");
		}
	
        return num1/num2;
	}
}