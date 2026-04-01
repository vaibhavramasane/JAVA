/*Question 6: Write a java program to search an element in an array , its element found or not.
Input:
Array = {10, 20, 30, 40, 50}
Element to search = 30
Output : Element 30 found at index 2 */

import java.util.*;
class Q6{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements of an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		System.out.println("ENter search key : ");
		int s = xyz.nextInt();
		boolean flag = false;
		for(int i=0; i<a.length; i++){
			
			if(a[i] == s){
				
				flag = true;
				break;
				
			}
			
		}
		if(flag){
			
			System.out.println("Element found ");
		}else{
			System.out.println("Element not found" );
		}
		
		
	}
}