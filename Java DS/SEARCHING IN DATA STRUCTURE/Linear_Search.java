// INTIALLY WE NEED LIST OF NUMBER TO SORT AND 
// FIND THE NUMBER FROM THE LIST 

import java.util.Scanner;

class Linear_Search
{
public static int search(int arr[],int x)
{
int N = arr.length;

for(int i=0;i<=N;i++)
	{
		if(arr[i]==x)
		return i;
	}
	return 1;
}

public static void main(String args[])
{
int arr[]={10,20,50,30,40};
int x;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number: ");
x=scan.nextInt();

int result = search(arr,x);// object creation
if(result==1)
{
System.out.println("---------------------------------------");
System.out.println("Element is not Present in Array: ");
}
else
{
System.out.println("---------------------------------------");
System.out.println("Element Present at Index :"+result);
}
}
}