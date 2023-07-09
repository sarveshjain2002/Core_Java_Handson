//CLASSES AND OBJECT

class Student
{
int M3=100;
int OOP=90;

void display()
{
System.out.println("M3 marks"+M3);

System.out.println("OOP marks"+OOP);
}
}


class Classesandobject
{
public static void main(String args[])
{
Student s1 = new Student();
s1.display();
}
}