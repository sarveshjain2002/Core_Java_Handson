class Student
{
int rollno;
String name; //Global Variable
static String branch; //Static Variables

void getData(int r, String n, String b)
{
rollno=r;// Local Variables
name=n;
branch=b;
}
}

public class Types_Variables
{
public static void main(String args[])
{
Student s1= new Student();
s1.getData(42,"Sarvesh","CSE");
 
System.out.println("Student's Rollno:"+s1.rollno);
System.out.println("Student's Name:"+s1.name);

System.out.println("Student's Name:"+Student.branch);

}
}
