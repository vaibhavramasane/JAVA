/*Question 20: Write a Java program to print all elements from an integer array that are greater than a given number.
Input:
Array = [10, 25, 5, 40, 18]
Given Number = 20

Output:
Elements greater than 20: 25 40

Explanation:
Traverse the array and compare each element with the given number; if the element is greater than the number, print it. */

import java.util.*;
class Q20{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size:  ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i =0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter Given Number: ");
		int k = xyz.nextInt();
		
		System.out.println("Element greater than Given Number: ");
		for(int i=0; i<a.length; i++){
			
			if(a[i] > k){
				
				System.out.println(a[i] + " ");
			}
		}
	}
}
