/*Question 14: Write a Java program to swap two numbers using a third variable.
Input:
A = 5
B = 10

Output:
A = 10
B = 5

Explanation:
A temporary variable is used to store one value while swapping the numbers. */

import java.util.*;
class Q14{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter first and second variables:");
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		
		int temp = A;
		A = B;
		B = temp;
		
		System.out.println("First Variable " + A + " Second Variable " + B);
	}
}