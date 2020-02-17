/**
 * IDSA Short Project 4
 * Team Members:
 * Adarsh Raghupati  NetID: axh190002
 * Keerti Keerti     NetID: kxk190012
 */
 
####Implementation of BinaryHeap

Implementation of Binary heap where the parent node values are minimum than its child node values.

###### Steps to run the code in IntelliJ IDE
* Create an empty java project 
* Unzip the source code files and paste it under the location "Java Project Name"/src folder
* Open the BinaryHeap.java and run the program

###### Steps to run the tests
* By default BinaryHeap is created with threshold value(default: 3) and later on as needed the size of the BinaryHeap can be increased by the threshold value
* Program provides 4 options to test all the functions:
1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
  * Option 1:  Add the element into the BinaryHeap using Add Method.
  * Option 2:  Add the element into the BinaryHeap using offer Method.
  * Option 3:  Peek the topmost element from the BinaryHeap.
  * Option 4:  Poll the topmost element from the BinaryHeap.
  * Option 5:  Remove the topmost element from the BinaryHeap.
  * Option 6:  Exit the program.
	
An illustration of the program execution is as below.

Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
3
No more elements in the Binary Heap
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
5
No more elements in the Binary Heap
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
1
Enter the input element
100
Successfully Inserted. BinaryTree after insertion:
100 
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
2
Enter the input element
99
Successfully Inserted. BinaryTree after insertion:
99 100 
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
2
Enter the input element
98
Successfully Inserted. BinaryTree after insertion:
98 100 99 
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
2
Enter the input element
90
Successfully Inserted. BinaryTree after insertion:
90 98 99 100 
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
3
Peeked Element: 90
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
5
Removed Element: 90 After removing the Binary Tree is: 
98 100 99 
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
4
Polled Element: 98
After Polling the Binary tree :
99 100 
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
5
Removed Element: 99 After removing the Binary Tree is: 
100 
Enter 1:Add 2:Offer 3:Peek 4:Poll 5:Remove 6: Exit
6

Process finished with exit code 0
