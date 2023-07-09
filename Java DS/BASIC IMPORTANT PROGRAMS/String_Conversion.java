import java.util.Scanner;

public class String_Conversion
{
public static void main(String args[])
{
String S1;
Scanner scan=new Scanner(System.in);
System.out.print("Enter a String:");
S1=scan.nextLine();

int length = S1.length();
char[] charArray = S1.toCharArray();

for(int i = 0; i<length; i++)
{
if(i<length/2)
{
charArray[i]=Character.toUpperCase(charArray[i]);
}
else
{
charArray[i]=Character.toLowerCase(charArray[i]);
}
}
String convertedString = new String(charArray);
System.out.println("____________________________________");
System.out.print("String Conversion Half to Upper and Half to Lower :"+convertedString);

}
}
