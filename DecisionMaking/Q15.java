/*Question 15: Write a java program to find the minimum between two numbers.
Input:
Number1 = 8
Number2 = 12

Output
Minimum number = 8

Explanation:
Compare both numbers using if-else.
The smaller value is printed as minimum. */

import java.util.*;

class Q15{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int n1 = xyz.nextInt();
		int n2 = xyz.nextInt();
		
		if(n1<n2){
			
			System.out.println("Minimum Number = " + n1);
			
		}else{
			
			System.out.println("Minimum Number = " + n2);
			
		}
	}
}