package datastructures.queue;
/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.

Example:

MyStack stack = new MyStack();
stack.push(1);
stack.push(2);
stack.top();   // returns 2
stack.pop();   // returns 2
stack.empty(); // returns false

Notes:
You must use only use standard operations of a queue operations are valid. -- which means only
		push to back,
		peek/pop from front,
		size,
		isEmpty, and
		list

You may simulate a queue by using a list.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

Note : can you do using one queue

Example :

output :

push 20
push 34
push 55
push 2
top
2
pop
exit
55 34 20

 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MyStack{

    Queue<Integer> queue=new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        for(int i=0;i<queue.size()-1;i++)
            queue.add(queue.poll());
    }
    // Removes the element on top of the stack.
    public void pop(){
        queue.poll();
    }
    // Get the top element.
    public int top(){
        return queue.peek();
    }
    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
    // List all elements
    public void list(){
        queue.forEach(x -> System.out.print(x+" "));
    }
}


public class MyStackWithQueue {
    public static void main(String[] args) {
        MyStack queueStack=new MyStack();
        Scanner sc = new Scanner(System.in);
        while(true){

            String line = sc.nextLine();
            String[] choice=line.split(" ");

            switch(choice[0]){
                case "push": queueStack.push(Integer.parseInt(choice[1]));break;
                case "pop": queueStack.pop();break;
                case "top": System.out.println(queueStack.top());break;
                case "empty": System.out.println(queueStack.empty());break;
                case "exit": queueStack.list();
                default:System.exit(0);
            }
        }

    }
}
