interface StudentInfo
{
int rollno=42;
String name="Sarvesh";
public void displayInfo();
}

interface StudentMarks
{
int OOP=42;
int M3=50;
public void displayMarks();
}


class Student_Performance implements StudentInfo, StudentMarks
{
public void displayInfo()
{
System.out.println("Student RollNo: "+rollno);

System.out.println("Student's Name: "+name);
}

public void displayMarks()
{
System.out.println("Student Mark in OOP: "+OOP);

System.out.println("Student Mark in M3: "+M3);
}
}

class Multiple_Inheritance
{
public static void main(String args[])
{
Student_Performance s1= new Student_Performance();
s1.displayInfo();
s1.displayMarks();
}
}