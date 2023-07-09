
class StudentMarks 
{
int oop=50;
int m3=60;
}

class StudentInfo extends StudentMarks
{
int rollno=34;
String name="Sarvesh";

void display()
{
System.out.println("Student Rollno: "+rollno);

System.out.println("Student Name: "+name);

System.out.println("Student Mark in OOP: "+super.oop);

System.out.println("Student Mark in M3:"+super.m3);

}
}

class SuperKeyWord
{
public static void main(String args[])
{
StudentInfo s1= new StudentInfo();
s1.display();
}
}