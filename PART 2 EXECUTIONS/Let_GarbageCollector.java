class Student
{
int rollno=42;
String name="Sarvesh";

protected void finalized()
{
System.out.println("Garbage Collector Worked!!!");
}

}

class Let_GarbageCollector
{
public static void main(String args[])
{
Student s1= new Student();
System.out.println("Student's Rollno: "+s1.rollno);

System.out.println("Student's Name: "+s1.name);
s1=null;
System.gc();

}
}