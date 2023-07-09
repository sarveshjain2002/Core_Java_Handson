class Student
{
int m3;
String name ;

Student()
{
m3=50;
name="Darshan";
}

Student(int m, String n)
{
m3=m;
name=n;
}
void display()
{
System.out.println("Marks of M3: "+m3);

System.out.println("Student Name: "+name);
}
}

class Let_Constructor_Overloading
{
public static void main(String args[])
{
Student s3= new Student();
s3.display();

System.out.println(" ");
Student s1= new Student(49, "Sarvesh");
s1.display();

System.out.println(" ");
Student s2= new Student(50, "Nikhil");
s2.display();

}
}