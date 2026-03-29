/*Question 11: Write a Java program to enter marks of five subjects and calculate total marks and percentage.
Input:
Marks = 70, 75, 80, 65, 60

Output:
Total = 350
Percentage = 70%

Explanation:
Total marks are calculated by adding all five subject marks.
Percentage = Total ÷ 5. */

import java.util.*;
class Q11{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Math Marks: ");
		int M1 = xyz.nextInt();
		
		System.out.println("Enter Chemistry Marks: ");
		int M2 = xyz.nextInt();
		
		System.out.println("Enter Science Marks: ");
		int M3 = xyz.nextInt();
		
		System.out.println("Enter Geography Marks: ");
		int M4 = xyz.nextInt();
		
		System.out.println("Enter Geometry Marks: ");
		int M5 = xyz.nextInt();
		
		int total = M1 + M2 + M3 + M4 + M5;
		System.out.println("total marks: " + total);
		
		int per = total/5;
		System.out.println("Percentage : " + per+"%");
		
	}
}

		