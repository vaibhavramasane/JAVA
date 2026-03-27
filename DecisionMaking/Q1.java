/*Question 1: Write a Java program to check whether a number is even or odd.
Input:
Number = 8

Output:
Even

Explanation:
If a number is divisible by 2, it is Even. Otherwise, it is Odd.
*/

import java.util.*;
public class Q1{

	public static void main(String args[]){
		
		Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = xyz.nextInt();
		
		String str = (n%2==0)?"Even":"Odd";
		System.out.println(str);
		
	}
}