/*Question 17: Write a Java program to count the number of even and odd elements present in a given integer array.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
Odd count = 2 Explanation
? An even number is a number that is completely divisible by 2.
? An odd number is a number that is not divisible by 2.
? Traverse the array using a loop. */

import java.util.*;

class Q17{
	public static void main(String x[]){
		
		Scanner xyz =new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int Ecount=0,Ocount=0;
		for(int i=0; i<a.length; i++){
			
			if(a[i] % 2==0){
				Ecount++;
			}
			if(a[i] % 2==1){
				Ocount++;
			}
		}
		System.out.println("Even Count : " + Ecount);
		System.out.println("Odd Count : " + Ocount);
	}
}