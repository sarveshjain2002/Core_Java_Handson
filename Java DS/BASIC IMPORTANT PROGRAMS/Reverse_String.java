//Reversing String in Java using Simple Logic

import java.util.*;
class Reverse_String
{
public static void main(String args[])
{
String S;
System.out.println("Enter a String has to be reveresed : ");

Scanner scan = new Scanner(System.in);
S=scan.nextLine();

int length = S.length();		// String of the Length
String reverse = " ";		// String which is going to be reversed , it is stored here

for(int i=length-1;i>=0;i--)
{
reverse = reverse + S.charAt(i);	// for every reversing character will be stored in here
}
System.out.println("String to be reveresed : "+ reverse);

}
}