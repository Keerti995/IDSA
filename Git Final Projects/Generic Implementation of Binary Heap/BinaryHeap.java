/**
 * @author : AXH190002,KXK190012
 * Creating a Binary Heap - where the parent value should be less than its children
 * Ver 1.0: 2020/02/16
 *  *  Entry class has generic type associated with it.
 */
package KXK190012;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BinaryHeap<T extends Comparable<? super T>> {
    Comparable[] pq;
    int size;
    static int threshold = 3;   // By default heap size is 3, can vary it as needed
    // Constructor for building an empty priority queue using natural ordering of T
    public BinaryHeap(int maxCapacity) {
        pq = new Comparable[maxCapacity];
        size = 0;
    }

    /**
     * @param x Checks the size , if need be resizes and increases the size of pq and adds new element in the pq
     * @return true if added successfully else false
     */
    public boolean add(T x) {
        if(size == threshold)       //if pq is completely filled
            resize();
        pq[size] = x;
        percolateUp(size);
        size++;
        return true;
    }

    /**
     * @param x method to add new element in pq, inturn calls add method
     * @return true is add is successful else false
     */
    public boolean offer(T x) {
        return add(x);
    }

    /**
     * @return polled element
     * @throws NoSuchElementException if pq is empty or poll returns null
     */
    public T remove() throws NoSuchElementException {
        T result = poll();
        if(result == null) {
            throw new NoSuchElementException("Priority queue is empty");
        } else {
            return result;
        }
    }

    /**
     * Prints all elements of pq.
     */
    public void printHeap(){
        for(int i=0;i<size;i++)
            System.out.print(pq[i]+" ");
        System.out.println();
    }

    /**
     * @return min element of the pq
     */
    public T poll() {
        if(size == 0){
            return null;
        }
        else {
            Comparable x = pq[0];
            move(0, pq[size-1]);
            size--;
            percolateDown(0);
            //size--;
            return (T) x;
        }
    }

    /**
     * @return minimum element of the pq by calling peek
     */
    public T min() {
        return peek();
    }

    /**
     * @return minimum element of pq
     */
    public T peek() {
        if(size == 0){
            System.out.println("No more elements in the Binary Heap");
            return null;
        }else{
            return (T) pq[0];
        }
    }

    /**
     * @param i : index of the ele for which parent node is required
     * @return the parent element of the index passed
     */
    int parent(int i) {
        return (i-1)/2;
    }

    /**
     * @param i index of the element for which left child node is required
     * @return left child element of the index passed.
     */
    int leftChild(int i) {
        return 2*i + 1;
    }

    /**
     * percolateUp is called when a new element is added at the end and needs to be rearranged using comparator
     * */
    void percolateUp(int index) {
        Comparable x = pq[index];
        while(index>0 && compare(pq[parent(index)],x)>0){
         move(index,pq[parent(index)]);
         index = parent(index);
        }
        pq[index] = x;
    }

    /** percolateDown is called when a element is removed/polled from the beginning and needs to be rearranged using comparator */
    void percolateDown(int index) {
        Comparable x = pq[index];
        int ind;

        while(index < size/2 && (compare(x,pq[leftChild(index)])>0 || compare(x,pq[leftChild(index)+1])>0)){
            if(compare(pq[leftChild(index)],pq[leftChild(index)+1])<=0)
                ind = leftChild(index);
            else
                ind = leftChild(index)+1;
            move(index,pq[ind]);
            index = ind;
        }
        pq[index] = x;
    }

    /** use this whenever an element moved/stored in heap. Will be overridden by IndexedHeap */
    void move(int dest, Comparable x) {
        pq[dest] = x;
    }

    /**
     * Compares the 2 elements and returns -1: a<b , 0: a=b and 1: a>b
     * @param a element a
     * @param b element b
     * @return -1: a<b , 0: a=b and 1: a>b
     */
    int compare(Comparable a, Comparable b) {
        return ((T) a).compareTo((T) b);
    }

    /** Create a heap.  Precondition: none. */
    void buildHeap() {
        for(int i=parent(size-1); i>=0; i--) {
            percolateDown(i);
        }
    }

    /**
     * @return true if pq is empty or size of pq == 0
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * @return size of the pq
     */
    public int size() {
        return size;
    }
    /**
     * doubles the size of the pq
     */
   void resize() {
        Comparable[] newcmp = new Comparable[size*2];
        threshold = size*2;
        for(int i=0;i<size;i++){
            newcmp[i] = pq[i];
        }
        pq = newcmp;
    }

//    Asked not to implement in SP4
//    public interface Index {
//        public void putIndex(int index);
//        public int getIndex();
//    }
//    public static class IndexedHeap<T extends Index & Comparable<? super T>> extends BinaryHeap<T> {
//        /** Build a priority queue with a given array */
//        IndexedHeap(int capacity) {
//            super(capacity);
//        }
//
//        /** restore heap order property after the priority of x has decreased */
//        void decreaseKey(T x) {
//        }
//
//        @Override
//        void move(int i, Comparable x) {
//            super.move(i, x);
//        }
//    }

    public static void main(String[] args) {
        BinaryHeap<Integer> h = new BinaryHeap(threshold);  // Creating a BinaryHeap with initial Threshold(3) and resize it if need be.
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit");
            int choice = scan.nextInt();
            switch(choice){
                case 1: //Add
                        System.out.println("Enter the input element");
                        if(h.add(scan.nextInt())){
                            System.out.println("Successfully Inserted. BinaryTree after insertion:");
                            h.printHeap();
                        }
                        else
                            System.out.println("Insertion Unsuccessful");
                        break;
                case 2:  //Offer
                        System.out.println("Enter the input element");
                        if(h.offer(scan.nextInt())){
                        System.out.println("Successfully Inserted. BinaryTree after insertion:");
                        h.printHeap();
                        }
                        else
                        System.out.println("Insertion Unsuccessful");
                        break;
                case 3: //Peek
                    if(h.isEmpty())
                        System.out.println("No more elements in the Binary Heap");
                    else
                        System.out.println("Peeked Element: "+h.peek());
                        break;
                case 4:
                    if(h.isEmpty())
                        System.out.println("No more elements in the Binary Heap");
                    else{
                        System.out.println("Polled Element: "+h.poll());
                        System.out.println("After Polling the Binary tree :");
                        h.printHeap();
                    }
                        break;
                case 5: try{
                    System.out.println("Removed Element: "+h.remove()+" After removing the Binary Tree is: ");
                    h.printHeap();
                }catch(Exception e){
                    System.out.println("No more elements in the Binary Heap");
                }
                    break;
                case 6: System.exit(0);
            }
        }
    }
}

