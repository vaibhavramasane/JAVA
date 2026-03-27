/* Question 6: Write a Java program to check whether a character is alphabetic or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If character lies between A–Z or a–z.*/

import java.util.*;

public class Q6{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = xyz.next().charAt(0);
		
		String str =((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))?"Alphabet" : "Not Alphabet";
		System.out.println(str);
		
	}
}