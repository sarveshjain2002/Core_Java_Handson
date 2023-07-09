
public class Main
{
public static void main(String args[])
{

	//ArrayList<String> arrayList= new ArrayList<String>();
	DynamicArray_DS dynamicArray = new DynamicArray_DS(5);
	
	//System.out.println(dynamicArray.capacity.toString);

	dynamicArray.add("A");
	dynamicArray.add("B");
	dynamicArray.add("C");
	dynamicArray.add("D");
	dynamicArray.add("E");


	//dynamicArray.insert(0,"X");

	dynamicArray.delete("A");
	dynamicArray.delete("B");
	dynamicArray.delete("C");
	

System.out.println(dynamicArray.search("D"));

System.out.println(dynamicArray);
System.out.println("Size : " + dynamicArray.size);
 
System.out.println("Capacity : " + dynamicArray.capacity);
 
System.out.println("Empty : " + dynamicArray.isEmpty());




}
}
