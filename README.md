# Weighted-BFS-in-Java
This is a Weighted BFS project that I completed in Java as part of an NYU course I took in Spring 2020. In this assignment, I implement a simplified version of Dijkstra’s weighted breadth first search (BFS) algorithm to identify the shortest distance from a special character in a tree to the tree’s root. I first implement a stack to convert the input (a parsed binary tree) into a tree and then implement the BFS algorithm using a min-heap to find the minimum distance between the tree node and the special character within it.

# Instructions to Run
Once you download the java files in the "src" folder, you should be able to run the algorithm by passing a parsed binary tree (e.g., "a 0 ( b 4 ( * 100 b 6 ) w 9 ( x 3 y 5 ( * 2 z 3 ) ) )") in the "Execute.java" class.
