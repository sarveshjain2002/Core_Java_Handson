//LinearSearch = Iterate through a collection one element at a time
//Noo Need of Sorted List

public class Linear_Search
{
public static void main(String args[])
{

int[] array = {3,4,5,6,7,9,11,12};
int index = linearSearch(array, 14);

if(index !=-1)
{
System.out.println("Element found at index: "+ index);
}
else
{
System.out.println("Element Not Found ");
}

}
private static int linearSearch(int[] array, int value)
{
  for(int i = 0; i< array.length; i++)
	{
	if(array[i]==value)
		{
			return i;
		}

	}	

return -1;
}
}