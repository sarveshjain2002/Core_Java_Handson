abstract class Student
{
String name="Sarvesh";
int rollno=42;
abstract void display();
}

class StudentInfo extends Student
{
int M3=54;
int OOP=60;

void display()
{
System.out.println("Student Rollno: "+rollno);
System.out.println("Student Name: "+name);
System.out.println("Student Mark in OOP: "+OOP);
System.out.println("Student Mark in M3: "+M3);
}
}


class Abstr_Class_Method
{
public static void main(String args[])
{
StudentInfo s1= new StudentInfo();
s1.display();
}
}