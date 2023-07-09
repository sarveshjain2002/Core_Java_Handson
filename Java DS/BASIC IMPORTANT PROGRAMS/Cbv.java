//Call By Value in Java 

class Cbv
{
int marks=90;

void subject(int marks)
{
marks=marks-15;
System.out.println(marks);
}
public static void main(String args[])
{
Cbv s1= new Cbv();
System.out.println("Before Passing the Value: +s1.marks");
s1.subject(84);

System.out.println("After Passing the Value: +s1.marks");
}
}