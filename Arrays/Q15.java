/*Question 15: Write a java program to find common elements between two arrays.
Input :
Array1 = {1, 2, 3, 4, 5}
Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found ? it is a common element. */

import java.util.*;

class Q15{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size of first and second array: ");
		int n1= xyz.nextInt();
		int n2 = xyz.nextInt();
		
		
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		System.out.println("Enter first array element: ");
		for(int i=0; i<a1.length; i++){
			
			a1[i] = xyz.nextInt();
			
		}
		System.out.println("Enter Second array element: ");
		for(int i=0; i<a2.length; i++){
			
			a2[i] = xyz.nextInt();
			
		}
		System.out.println("Common array element: ");
		for(int i=0; i<a1.length; i++){
			
			boolean flag = false;
			
			for(int j=0; j<a2.length; j++){
				
				if(a1[i]==a2[j] && i!=j){
					
					flag = true;
					break;
				}
			}
			if(flag){
				
				System.out.println(a1[i] + " ");
				
			}
		}
	}
}
		