# GameFindingLastChildInCircle
This is game where childs are standing in circle and get eliminated by some given number one by one and we need to identify the id of last child

# Problem statement 

Consider the following children's game:
• ’n’ children stand around a circle.
• Staring with a given child and working clockwise, each child gets a
sequential number, which we will refer to as the child’s ‘id’
• Then starting with the first child, they count from 1 until ‘k’, where ‘k’ is
determined at the start of the game. The child who counts ‘k’ is now out and
leaves the circle. The count starts again with the child immediately next to the
eliminated one.
• Children are so removed from the circle one by one. The winner is the child
left standing last.
Write a static method on a new class, which, when given ’n’ and ‘k’, returns
the sequence of children as they go out, and the id of the winning child.
Create any additional classes you need to support the design of your solution
and also a unit test harness.

And while you are at it...
• Use as little memory as possible and make the method as fast a possible.
• In your comments, discuss the runtime order complexity (i.e 0(n) or 0(n^2)
or ....) of the program.
• Design your class(s) so that it can be used in any environment.


# How to run program :
Import code in any favourite IDE like eclipse or Intellij and right click and run the program main method 
FindingLastChildMain class. 

# Output we get as below: 
Children eliminated in order: for n= 14 and k = 2
1 3 5 7 9 11 13 2 6 10 0 8 4 
Last child id  with o(n*k) complexity : 12
Last child id with o(n) complexity: 12

Children eliminated in order: for n= 7 and k = 3
2 5 1 6 4 0 
Last child id with o(n*k) complexity : 3
Last child id with o(n) complexity: 3

Children eliminated in order: for n= 5 and k = 2
1 3 0 4 
Last child id with o(n*k) complexity : 2
Last child id with o(n) complexity: 2


Process finished with exit code 0


# Design Decision :

O(n) Solution Time Complexity when we use recursion with following structure (Considered 0 indexing for formula)
  function(n, k) = (function(n - 1, k) + k) % n 
  funciton(1, k) = 0

O(n*k) solution

 When we pass in N and K in function executeElimination we use arraylist for childrens list and reduce size of list as we iterate 
 and child is getting removed in iteration , In nutshell it gives Time Complexity O(n*k) and prints all elemination in sequence
 and eventually last children. 


We could have developed by building any data structure,as cirular doubly linked list or binar tree in memory . 
Binary tree solution this can  gives a log2n lookup time and a total complexity of n×Logn.but we had to use less memory in problem statement given.


# Assumption 
 We have assigned children number starting from 0 to n-1 i.e used 0 inexing for calculation. We have used 3 scenarios for test . 
 We could have asked user to  give input from console. In our program we have simulated 3 use cases with below n, k values: 
 1. n=14 , k=2
 2. n=7,k=3
 3. n=5,k=2
 
 
 
 
 


