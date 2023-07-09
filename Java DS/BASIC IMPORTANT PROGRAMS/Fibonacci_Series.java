import java.util.Scanner;

class Fibonacci_Series
{
public static void main(String args[])
{
int first=0,second=1,next,i,number;
System.out.println("Enter the number of terms:");

Scanner scan = new Scanner(System.in);
number = scan.nextInt();

for(i=0;i<number;i++)
{
	if(i<=1)
	{
		next=i;
	}
	else
	{
		next = first+second;
		first=second;
		second=next;
	}
System.out.print(" "+next);
}
}
}