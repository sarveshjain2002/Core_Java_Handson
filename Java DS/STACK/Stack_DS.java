// STACK - FIFO DATASTRUCTURE

import java.util.Stack;

public class Stack_DS
{
public static void main(String args[])
{
Stack<String>stack = new Stack<String>();

stack.push("MineCraft");	// top
stack.push("Skyrim");	//second out
stack.push("Doom");	// first out

stack.pop();	// remove Top 
stack.pop();	// remove next to Top
stack.pop();	// remove last

// System.out.println(stack);
// To Print a Stack

// System.out.println(stack.search("Skyrim"));
// To check the index and searching the string

// String myFavGame = stack.pop(); 
// Here pop string is assign to myFavGame string
	 

// System.out.println(stack.peek());
// Here to see the top of stack 


//System.out.println(myFavGame);
//System.out.println(stack.empty());	 

}
}