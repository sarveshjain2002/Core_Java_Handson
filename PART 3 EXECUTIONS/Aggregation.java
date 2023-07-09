class StudentInfo
{
int rollno=34;
String name="Sarvesh";

}
class StudentMarks 
{
StudentInfo s1= new StudentInfo();

int oop=50;
int m3=60;

void display(){
System.out.println("Student's Rollno"+s1.rollno);

System.out.println("Student's Name"+s1.name);

System.out.println("Marks in OOP"+oop);

System.out.println("Marks in M3"+m3);
}
}

class Aggregation
{
public static void main(String args[])
{
StudentMarks s2= new StudentMarks();
s2.display();
}
}
