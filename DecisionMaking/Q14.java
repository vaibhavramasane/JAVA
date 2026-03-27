/*Question 14: Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                  Basic Salary <= 10000 : HRA = 20%, DA = 80%
                  Basic Salary <= 20000 : HRA = 25%, DA = 90%
                   Basic Salary > 20000 : HRA = 30%, DA = 95%
Input:
Basic Salary = 15000

Output
Gross Salary = 32250

Explanation:
Since 15000 ? 20000:
HRA = 25% of 15000 = 3750
DA = 90% of 15000 = 13500

Gross Salary = 15000 + 3750 + 13500 = 32250 */

import java.util.*;

class Q14{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		int bs = xyz.nextInt();
		
