import java.util.Queue;
import java.util.LinkedList;

public class Queue_DS
{
public static void main(String args[])
{
Queue<String> queue = new LinkedList<String>();

// offer() is used to add in queue
queue.offer("Pranav");
queue.offer("Nikhil");
queue.offer("Prathmesh");
queue.offer("Darshan");

System.out.println(queue.isEmpty());
// For Checking Empty or not

System.out.println(queue.size());
// For Checking  Size of the Queue

System.out.println(queue.contains("Pranav"));
// For Checking the String contain or not in Queue

//System.out.println(queue.peek());

// poll() is used to remove in queue
// It will never throw exception
queue.poll();
queue.poll();
queue.poll();
queue.poll();
queue.poll();

//queue.element();
// It will throw exception




System.out.println(queue);

}
}