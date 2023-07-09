import java.util.ArrayList;
import java.util.LinkedList;

public class Array_LinkedList_DS
{
public static void main(String args[])
{
LinkedList<Integer>linkedList = new LinkedList<Integer>();
ArrayList<Integer>arrayList = new ArrayList<Integer>();

long startTime;
long endTime;
long elapsedTime;

for(int i =0; i<100000; i++)
{
linkedList.add(i);
arrayList.add(i);
}

startTime = System.nanoTime();
// do something

//linkedList.get(0);
//linkedList.get(5000);
//linkedList.get(99999);
linkedList.remove(0);

endTime = System.nanoTime();

elapsedTime = endTime - startTime;

System.out.println("LinkedList :\t"+ elapsedTime + " ns");


startTime = System.nanoTime();
// do something

//arrayList.get(0);
//arrayList.get(5000);
//arrayList.get(99999);
arrayList.get(0);
endTime = System.nanoTime();

elapsedTime = endTime - startTime;

System.out.println("ArrayList :\t"+ elapsedTime + " ns");


}

}