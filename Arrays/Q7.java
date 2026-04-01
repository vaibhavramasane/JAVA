/*Question 7: Write a java program to display the reverse array.
Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1} */

import java.util.*;
class Q7{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		//reverse 
		
		int start =0;
		int end =a.length-1;
		System.out.println("Reverse Array: ");
		while(start<=end){
			
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			
		}
		for(int i=0; i<a.length; i++){
			
			System.out.println(a[i]);
		}
		
	}
}
