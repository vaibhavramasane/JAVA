/*Question 16: Write a java program to find a minimum between three numbers.
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4 */

import java.util.*;
class Q16{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int n1= xyz.nextInt();
		int n2= xyz.nextInt();
		int n3= xyz.nextInt();
		
		if(n1<n2 && n1<n3){
			
			System.out.println("Minimum Number = " +n1);
			
		}else if(n2<n3 && n2<n1){
			
			System.out.println("Minimum Number = " +n2);
			
		}else {
			
			System.out.println("Minimum Number = " +n3);
			
		}
	}
}
