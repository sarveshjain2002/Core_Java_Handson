import java.util.Scanner;

class String_Upper_Lower_Case
{
public static void main(String args[])
{

Scanner scan = new Scanner(System.in);

String S1,S2;
System.out.print("Enter S1 String to be Convert : ");
S1=scan.nextLine();

System.out.print("Enter S2 String to be Convert : ");
S2=scan.nextLine();


System.out.println("__________________________________");

System.out.println(S1.toUpperCase());
System.out.println(S2.toLowerCase());


}}