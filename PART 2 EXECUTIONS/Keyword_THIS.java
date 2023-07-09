class Student
{
int rollno;
String name;

void getData(int rollno, String name)
{
this.rollno=rollno;
this.name=name;
}
}

class Keyword_THIS
{
public static void main(String args[])
{
Student s1= new Student();
s1.getData(3,"Sarvesh");

System.out.println("Student's Roll No: "+s1.rollno);

System.out.println("Student's Name: "+s1.name);
}
}