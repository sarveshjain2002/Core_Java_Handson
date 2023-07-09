class Let_Try_Catch_Finally_Mainn
{
public static void main(String args[])
{
	try
	{
	int arr[]={10,20,30,40};
	for(int i : arr)
	{
		System.out.println(arr[5]);
	
		System.out.println(i);
	}
	}
	catch(Exception ex)
	{
	ex.printStackTrace();
	}
	
	finally
	{
	System.out.println("Program Terminated");
	}

}
}