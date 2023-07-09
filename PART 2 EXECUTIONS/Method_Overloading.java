//METHOD OVERLOADING
//MULTIPLE METHOD WITH SAME NAME TO MORE THAN ONE METHODS WITH DIFFERENT ARGUEMENTS PASSED.
 
//RUNTIME POLYMORPHISM

class Marks
{
int add( int a, int b )// PARAMETER WITH RETURN TYPE
{
return a+b;
}

float add( int a, int b, int c )
{
return a+b+c;
}

double add( double a, double b )
{
return a+b;
}

}

class Method_Overloading
{
public static void main(String args[])
{
Marks m1=new Marks();//Creating Object
System.out.println(m1.add(5,6));


Marks m2=new Marks();//Creating Object
System.out.println(m2.add(4,5,6));


Marks m3=new Marks();//Creating Object
System.out.println(m3.add(3.5, 5.5));
}
}
