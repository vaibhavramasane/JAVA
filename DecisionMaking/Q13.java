/*Question 13: Write a java program to accept two integers and check whether they are equal or not.
Input:
Number1 = 15
Number2 = 15

Output
Both numbers are equal

Explanation:
If Number1 == Number2, print equal.
Otherwise, print not equal. */

import java.util.*;
class Q13{

	public static void main(String x[]){
	
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter integers: ");
		int n1 = xyz.nextInt();
		int n2 = xyz.nextInt();
		
		String str = n1==n2?"Both numbers are equal" : "not equal";
		System.out.println(str);
	}
}