/* Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
Input:
Character = e

Output:
Vowel

Explanation:
Vowels: a, e, i, o, u.*/

import java.util.*;

class Q9{

	public static void main(String x[]){

		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = xyz.next().charAt(0);

		if(ch=='a'|| ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='O' || ch=='o' || ch=='u' || ch=='U'){
			System.out.println("It is vowels");
		}else{
			System.out.println("it is an consonant");

		}

	}
}

		

		