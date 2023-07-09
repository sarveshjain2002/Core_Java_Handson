import java.util.*;

public class Priority_Queue_DS
{
public static void main(String ars[])
{
//Queue<Double> queue = new LinkedList<>();
//Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());


queue.offer("S"); // first
queue.offer("N");
queue.offer("D");
queue.offer("P");
queue.offer("S"); // last

System.out.println(queue);

while(!queue.isEmpty())
{
System.out.println(queue.poll());
}
}
}