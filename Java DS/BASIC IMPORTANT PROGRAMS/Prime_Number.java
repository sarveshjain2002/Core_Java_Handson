import java.util.Scanner;

public class Prime_Number
{
public static void main(String args[])
{
int n, a=0;
Scanner scan = new Scanner(System.in);
System.out.println("ENTER A NUMBER TO BE CHECKED: ");
n=scan.nextInt();

for(int i=2;i<=n-1;i++)
{
	if(n%i==0)
	{
		a=a+1;
	}
}
if(a>0)
{
System.out.println("------------------------------------------ ");
System.out.println("ENTERED NUMBER");
System.out.println("Not a Prime Number ");
}
else
{

System.out.println("------------------------------------------ ");
System.out.println("ENTERED NUMBER IS ");
System.out.println("Prime Number");
}
}}