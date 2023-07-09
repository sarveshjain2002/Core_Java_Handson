
class Let_Try_Catch
{
public static void main(String args[])
  {
	try
	{
	int arr[]={10,20,30,40};
	for(int i: arr)
		System.out.println(arr[5]);
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	System.out.println("Program is Terminated");

   }
}