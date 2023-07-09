final class StudentInfo		//final keyword for class
{
final int rollno=43;		// final keyword for datamembers
final String name="Sarvesh";

final void display()		// final keyword for method
{
System.out.println("Student's Information");
}
}


public class AllInOne_FinalKeyWord
{
public static void main(String args[])
{
StudentInfo s1= new StudentInfo();
System.out.println("Name : "+s1.name);
System.out.println("RollNo : "+s1.rollno);
s1.display();
}
}