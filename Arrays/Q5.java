/*Question 5: Write a Java program to count even & odd values from an array.
Input:
Array Size = 7
Array Elements = 12 17 24 39 40 55 70
Output:
Count of Even Values = 4
Count of Odd Values = 3 */

import java.util.*;

class Q5{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		int evencount=0,oddcount=0;
		for(int i=0; i<a.length; i++){
			
			if(a[i] % 2 ==0){
				
				evencount++;
				
			}
		}
		System.out.println("Count of Even Values = " + evencount);
		
		for(int i=0; i<a.length; i++){
			
			if(a[i] % 2 ==1){
				
				oddcount++;
				
			}
		}
		System.out.println("Count of Odd Values = " + oddcount);
		
	}
}