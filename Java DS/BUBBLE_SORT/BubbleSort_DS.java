// BUBBLE SORT: Pairs of adjacent elements are comapred and the elements swapped if they are not in order.

// O OF N^2 RUN TIME COMPLEXITY
// QUADRATIC AND CAN USE IN INSERTION SORT ,SELECTION SORT ALSO
// NOT GOOD FOR LARGER DATASET

public class BubbleSort_DS
{
public static void main(String args[])
{

int array[] = {1,4,2,5,3,6,7,8,9};

bubbleSort(array);

for (int i : array)
{
System.out.print(i);
}
}
public static void bubbleSort(int array[])
{
  for(int i=0; i<array.length-1; i++)
   {
 for(int j=0; j<array.length-1; j++)
	{
		if(array[j]<array[j+1])
		{
			int temp = array[j];
			array[j] = array[j+1];
			array [j+1]  = temp;
		}
	}
    }
 }
}

