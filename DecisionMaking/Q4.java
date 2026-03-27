/*Question 4: Write a Java program to check whether a number is positive, negative or zero.
Input:
Number = -5

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero */

import java.util.*;

public class Q4{
	
	public static void main(String args[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int n = xyz.nextInt();
		
		String str = n==0?"Zero":n>0?"Positive":"Negative";
		System.out.println(str);
		
	}
}
