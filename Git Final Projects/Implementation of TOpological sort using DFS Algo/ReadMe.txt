/**
 * IDSA Short Project 5
 * Team members:
 * Adarsh Raghupati   axh190002
 * Keerti Keerti      kxk190012
 */

####Implementation of Topological Order of directed acyclic graph

###### Steps to run the code in IntelliJ IDE
* Create an empty java project
* Unzip the source code files and paste it under the location "Java Project Name"/src folder


###### Steps to run the tests
Run the DFS.java file.
If external file is used as command line input, make sure that file and folder has proper permission.

###### Sample test runs
For input:
String string = "7 8   1 2 2   1 3 3   2 4 5   3 4 4   4 5 1   5 1 7   6 7 1   7 6 1 0";

Output:
______________________________________________
Graph: n: 7, m: 8, directed: true, Edge weights: false
1 :  (1,2) (1,3)
2 :  (2,4)
3 :  (3,4)
4 :  (4,5)
5 :  (5,1)
6 :  (6,7)
7 :  (7,6)
______________________________________________
Graph is cyclic. Topological order does not exists


For input:
String string = "7 6   1 2 2   1 3 3   2 4 5   3 4 4   4 5 1   6 7 1";

Output:
______________________________________________
Graph: n: 7, m: 6, directed: true, Edge weights: false
1 :  (1,2) (1,3)
2 :  (2,4)
3 :  (3,4)
4 :  (4,5)
5 : 
6 :  (6,7)
7 : 
______________________________________________
Topological order of the given graph is:
6->7->1->3->2->4->5



