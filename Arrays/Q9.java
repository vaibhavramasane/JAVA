/*Question 9: Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment */

import java.util.*;

class Q9{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter array : ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		
		int b[] =a ; 
		System.out.println();
		for(int i=0; i<a.length; i++){
			
			System.out.println(b[i]);
		}
		
	}
	
}