import java.util.Scanner;

public class ArmStrong
{
public static void main(String args[])
{
int n,sum=0,remainder;

Scanner scan = new Scanner(System.in);
System.out.print("Enter a Number : ");
n=scan.nextInt();
int a=n;

while(n>0)
{
remainder = n%10;
sum=sum+remainder*remainder*remainder;
n= n/10;
}
if(a==sum)
{
System.out.println("ArmStrong Number");
}
else
{
System.out.println("Not a ArmStrong Number");
}
}
}