/**
 * IDSA Short Project 2
 * Team Members:
 * Adarsh Raghupati  NetID: axh190002
 * Keerti Keerti     NetID: kxk190012
 */

package axh190002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        BoundedQueue<Integer> bQueue = new BoundedQueue<>(10);

        for(int i=1;i<=10;i++){
            bQueue.offer(i);
        }
System.out.println("Press 1: Peek at first element      Press 2: Insert element at rear \n" +
        "Press 3: Remove element at front    Press 4: Check if queue is empty \n" +
        "Press 5: Clear the queue            Press 6: Copy queue elements to array in order \n"+
        "Press 7: Print the current size of queue\n" +
        "Press any other number to end program");
        Scanner in = new Scanner(System.in);
        whileloop:
        while (in.hasNext()){
            int com = in.nextInt();
            switch(com) {
                case 1:  // peek at the first element
                    System.out.println("Element at front="+bQueue.peek());
                    break;
                case 2:  // add element at rear
                    System.out.println("Enter the element to be added");
                    bQueue.offer(in.nextInt());
                    System.out.println("size of the queue is "+bQueue.size());
                    break;
                case 3:  // remove element from front
                    System.out.println("Removed element is "+bQueue.poll());
                    System.out.println("size of the queue is "+bQueue.size());
                    break;
                case 4:  // check if the queue is empty
                    System.out.println("Queue isEmpty()="+bQueue.isEmpty());
                    break;
                case 5:  // clear the queue
                    bQueue.clear();
                    System.out.println("Clearing the queue");
                    System.out.println("Queue size is  "+bQueue.size());
                    break;
                case 6:  // copy queue contents to array
                    Integer[] to_array = new Integer[bQueue.size()];
                    bQueue.toArray(to_array);
                    System.out.println("Array content is: ");
                    for (Integer x:to_array)
                        System.out.print(x+ " ");
                    System.out.println();
                    break;
                case 7: // Print the current size of the queue
                    System.out.println("Queue size is  "+bQueue.size());
                    break ;
                default:  // Exit loop
                    break whileloop;
            }
        }
    }
}