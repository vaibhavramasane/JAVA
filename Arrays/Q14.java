/*Question 14: Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates. */

import java.util.*;

class Q14{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter element in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		//Logic for duplicated
		int temp[] = new int[n];
		int count=0;
		
		
		for(int i=0; i<a.length; i++){
			boolean flag = false;
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[i]==a[j]){
				flag = true;
				
				break;
				}
			}
			if(!flag){
				temp[count] = a[i];
				count++;
			}
		}
		System.out.println("Unique Elements: ");
		for(int i=0; i<count; i++){
			System.out.println(temp[i] + " ");
			
		}
		
			
			
		
	}
	
}
			
			