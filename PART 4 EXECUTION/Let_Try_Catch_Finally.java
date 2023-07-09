
class Let_Try_Catch_Finally
{
public static void main(String args[])
  {
	try
	{
		int a=12;
		int b=0;
				
		if(b==0)
		{
		thrown new ArithmeticException("Cannot Divide by Zero");
		}
		double c=a/b;
		System.out.println(c);
	}
	catch(Exception ex)
	{
		ex.prinntStackTrace();
	}
	System.out.println("Program Terminated");

   }
}