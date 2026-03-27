/* Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
Input:
Radius = 7

Output:
Diameter = 14
Area = 153.86
Circumference = 43.96

Explanation:
Diameter = 2 × radius
Area = ? × r²
Circumference = 2 × ? × r
The formulas are applied using the given radius.*/

import java.util.*;
public class Q5{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = xyz.nextDouble();
		
		System.out.println("Diameter : " + (2 * radius));
		System.out.println("Area : " + (3.14 * radius * radius));
		System.out.println("Circumference : " + (2 * 3.14*radius));
		
	}
}
