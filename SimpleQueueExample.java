

 /*       package midterm;


import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

// insertion
        cars.add("TISLA");
        cars.addFirst("BMW");
        cars.addLast("NISAN");
        cars.add(1, "FORD");
        cars.add("ISUZU");
        
        System.out.println("Linked List Original: " + cars);
        System.out.println(cars.size());

//  Seraching  
        if (cars.contains("BMW")) {
            System.out.println("True");
        } else {
            
            System.out.println("False");
        }

        boolean containslion = cars.contains("BMW");
        System.out.println(containslion);


    }

}
        
   


// Stack 

package midterm;

public class stackedCode {
public class Stack {
    private final int maxSize;
    private final int[] stackArray;
    private int top;
    
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
        return stackArray[top];
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];        
    }
    
    */

//Queue
   
package midterm;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {

    public static void main(String[] args) {
        // Creating a queue using a LinkedList
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(3);
        queue.add(1);
        queue.add(5);
        queue.add(2);
        
        
       while(!queue.isEmpty()){
           System.out.println(queue.poll());
       }
    }
}
        


        
    































//        Deletion
//        animals.remove();
//        animals.removeFirst();
//        animals.removeLast();
//        animals.remove(2);
//        System.out.println("LinkedList After Deletion: " + animals);
//        Insertion:    add(); addFirst();  addLast();  add(index, data);
//         Deletion:    remove();   removeFirst();  removeLast(); remove(index);
//          Searching operation:        contains(element); size();