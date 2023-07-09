class StudentInfo
{
int rollno=34;
String name="Sarvesh";

void display()
{
System.out.println("Student Rollno: "+rollno);

System.out.println("Student Name: "+name);
}
}

class StudentMarks extends StudentInfo
{
int oop=50;
int m3=60;
void display()
{
System.out.println("Student Mark in OOP: "+oop);

System.out.println("Student Mark in M3:"+m3);
}
}

class Let_MethodOverriding 
{
public static void main(String args[])
{
StudentMarks s1= new StudentMarks();
s1.display();
StudentInfo s2= new StudentInfo();
s2.display();
}
}