/*Question 3: Write a Java program to display even & odd values from an array.
Input:
Array Size = 6
Array Elements = 11 20 33 42 55 60
Output:
Even Values = 20 42 60
Odd Values = 11 33 55
Explanation:
? Traverse the array element by element.
? If an element is divisible by 2, it is even. Otherwise, it is odd.
? Separate lists are displayed for even and odd values. */

import java.util.*;

class Q3{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n= xyz.nextInt();
		
		
		int a[] = new int[n];
		System.out.println("Enter element in array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] =xyz.nextInt();
		}
		
		for(int i=0; i<a.length; i++){
			
			if(a[i] % 2 ==0){
				System.out.println("Even Values : " + a[i]);
				
			}
			if(a[i] % 2!=0){
				
				System.out.println("Odd Values : " + a[i]);
				
			}
		}
	}
	
				
}