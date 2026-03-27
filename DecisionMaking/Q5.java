/*uestion 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
If number % 5 == 0 AND number % 11 == 0.

Asked In Companies: */

import java.util.*;
public class Q5{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = xyz.nextInt();
		
		String str = n%5==0 && n%11==0 ? "Divisible by 5 and 11" : "Not divisible by 5 and 11";
		System.out.println(str);
		
	}
}
