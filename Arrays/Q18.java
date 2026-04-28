/*
Question 18: Write a Java program to check whether a given array is empty or not.
Input :- Array elements: { } Explanation
1. Every array has a predefined property called length.
2. If array.length == 0, then the array is empty.
3. Otherwise, the array contains elements.
Output :- Array is empty
*/

import java.util.*;

class Q18{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		// logic 
		boolean flag = false;
		
		if(a.length>0){
			System.out.println("Array contains some elements ");
		}else{
			System.out.println("Array is Empty");
		}
		
		
		
	}
}
