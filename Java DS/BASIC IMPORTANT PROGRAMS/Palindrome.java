import java.util.Scanner;

public class Palindrome
{
public static void main(String args[])
{
int n, remainder, sum=0,temp;
System.out.println("Enter a Number : ");
Scanner scan = new Scanner(System.in);

n = scan.nextInt();
temp=n;
while(n>0)
{
remainder = n %10;
sum=(sum*10)+remainder;
n=n/10;
}
if(temp==sum)
{

System.out.println("-------------------------------------------------------");

System.out.println("Palindrome Number");
}
else
{

System.out.println("-------------------------------------------------------");

System.out.println("Not a Palindrome Number");
}

}
}