/*Question 12: Write a Java program to calculate simple interest.
Input:
Principal = 1000
Rate = 5
Time = 2

Output:
Simple Interest = 100

Explanation:
Simple Interest formula:
SI = (Principal × Rate × Time) / 100
Applying the formula gives 100.*/

import java.util.*;
class Q12{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		int p = xyz.nextInt();
		
		System.out.println("Enter Rate: ");
		int r = xyz.nextInt();
		
		System.out.println("Enter Time: ");
		int t = xyz.nextInt();
		
		int si = (p * r * t)/100;
		System.out.println("Simple Interest: "+ si);
		
	}
}