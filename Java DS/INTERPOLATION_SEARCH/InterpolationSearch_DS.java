//INTERPOLATION SEARCH:
// Improvement over binary search best used for "uniformly" distributed data // "guesses" where a value might be based on calculated probe results if
// probe is incorrect, search area is narrowed, and a new probe is calculated

// Average case : O(log(log(n)))
// Worst Case : O(n) [values increase exponentially]

public class InterpolationSearch_DS
{
public static void main(String args[])
{
int[] array = {1,2,3,4,5,6,7,8,9};

int index = interpolationSearch(array, 8);

if(index != -1)
	{
		System.out.println("Elemen found at index: "+ index);
	}
else
	{
		System.out.println("Element Not Found ");
	}
private static int interpolationSearch(int []array, int value)
{
	int high = array.length -1;
	int low=0;

while(value >= array[low] && value <=array[high] && low<=high)
	{
	int probe = low + (high-low)*(value - array[low])  /	
				(array[high] - array[low]);

	System.out.println("Probe : "+ probe);

	if(array[probe] == value)
	{
		return probe;
	}
	else if(array[probe]<value)
	{
		low = probe + 1;
	}
	else
	{
		high = probe -1;
	}
	}
	return 0;
}
}
