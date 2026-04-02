

/*Question 11: Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34*/

import java.util.*;

class Q11{
	
	public static void main(String x[]){
		
		int a[] = {12, 35, 1, 10, 34, 1};
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		
		for(int i=0; i<a.length; i++){
			
			
			if(a[i]>max){
				
				smax = max;
				max = a[i];
				
			}else if(a[i]>smax && a[i]!=max){
				
				smax = a[i];
				
			}
		}
		System.out.println("Second Max " + smax);
	}
}
			
			
	
		