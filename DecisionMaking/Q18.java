/*Question 18: Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
Input:
Score = 38

Output
Fail

Explanation:
If score ? 40 ? Pass
Otherwise ? Fail
*/

import java.util.*;
class Q18{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter score : ");
		int s=xyz.nextInt();
		if(s>=40){
			
			System.out.println("pass");
		}else{
			
			System.out.println("Fail");
			
		}
	}
}
