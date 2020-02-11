/**
 * IDSA Short Project 2
 * Team Members:
 * Adarsh Raghupati  NetID: axh190002
 * Keerti Keerti     NetID: kxk190012
 */

package axh190002;


public class BoundedQueue<T> {

    private int front=-1, rear = -1;
    private int size;
    Object[] arr;

    BoundedQueue(int n){
        size = n;
        arr = new Object[size];
    }

    /**
     * Inserts the element at rear.
     * @param x
     * @return False if queue is full else returns True
     */
    boolean offer(T x){

        if((rear+1)%size == front)
            return false;

        if(front==-1){
            front=0;
            rear=0;
            arr[rear] = x;
            return true;
        }

        rear = (rear+1)%size;
        arr[rear] = x;
        return true;
    }

    /**
     * Removes the element which is at the front of queue
     * @return False if queue is empty else returns True
     */
    T poll(){
        if(front==-1)
            return null;
        T element;
        if(front==rear){
            element = (T) arr[front];
            front = -1;
            rear = -1;

        }
        else{
            element = (T) arr[front];
            front = (front+1)%size;
        }
        return element;
    }

    /**
     *
     * @return Element which is at the front of the queue. Returns null is queue is empty
     */
    T peek(){
        if(front==-1)
            return null;

        T element = (T) arr[front];
        return element;
    }

    /**
     * Returns current size of the queue
     * @return
     */
    int size(){
        if(front==-1)
            return 0;
        else if(rear >= front)
            return (rear-front+1);
        else return (rear-front+1+size);
    }

    /**
     * Checks if queue is empty or not
     * @return True if queue is empty else False
     */
    boolean isEmpty(){
        if(front == -1)
            return true;
        else return false;
    }

    /**
     * Clears the queue by resetting the pointer to start of the queue
     */
    void clear(){
        front=-1;
        rear=-1;
    }

    /**
     * Copies the queue contents to the given array
     * @param a
     */
    void toArray(T[] a){
        if(front==-1)
            return;

        int index = 0;
        if(rear >= front){
            for(int f=front;f<=rear;f++){
                a[index++] = (T) arr[f];
            }
        } else{
            for(int f=front;f<size;f++)
                a[index++] = (T) arr[f];

            for(int f=0;f<=rear;f++)
                a[index++] = (T) arr[f];
        }

    }

}
