class StudentInfo
{
int rollno=42;
String name="Sarvesh";
void displayInfo()
{
System.out.println("Student's RollNo: "+rollno);

System.out.println("Student's Name: "+name);
}
}


class StudentMarks extends StudentInfo
{
int OOP=42;
int Python=50;
void displayMarks()
{
System.out.println("Student's Mark in OOP: "+OOP);

System.out.println("Student's Mark in Python: "+Python);
}
}

class StudentAddress extends StudentInfo
{
String Addr="Amravati";
void displayAdd()
{
System.out.println("Student's Address: "+Addr);
}
}

class Multilevel_Inheritance
{
public static void main(String args[])
{
StudentMarks s2= new StudentMarks();
s2.displayMarks();
StudentAddress s3=new StudentAddress();
s3.displayAdd();
s3.displayInfo();

}
}