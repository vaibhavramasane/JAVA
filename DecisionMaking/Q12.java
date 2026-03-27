/*Question 12: Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
Input:
Age = 18

Output
Eligible to vote

Explanation:
According to voting rules, a person must be at least 18 years old to vote.
If age ? 18 ? Eligible
Otherwise ? Not Eligible
*/

import java.util.*;

class Q12{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = xyz.nextInt();
		
		if(n>18){
			
			System.out.println("Eligible for voting ");
		}else{
			
			System.out.println("Not eligiblefor voting");
			
		}
	
	}
}
	