/*Question 11: Write a java program to find a maximum between three numbers.
Input:
Number1 = 25
Number2 = 40
Number3 = 32

Output
Maximum number = 40*/

import java.util.*;

class Q11{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int n1 = xyz.nextInt();
		int n2 = xyz.nextInt();
		int n3 = xyz.nextInt();
		
		if(n1>n2 && n1>n3){
			
			System.out.println("Maximum Number = " + n1);
		}else if(n2>n1 && n2>n3){
			
			System.out.println("Maximum Number = " + n2);
		}else {
			System.out.println("Maximum Number = " + n3);
		}
	}
}

		
		