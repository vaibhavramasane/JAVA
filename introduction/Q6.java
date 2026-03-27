/*Question 6: Write a Java program to convert length from centimeter into meter and kilometer.'
Input:
Centimeter = 150
Output:
Meter = 1.5
Kilometer = 0.0015
Explanation:
1 meter = 100 centimeters
1 kilometer = 100000 centimeters
The given value is converted using standard unit conversion formulas. */

import java.util.*;
public class Q6{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Centimeter: ");
		float cen = xyz.nextFloat();
		
		System.out.println("Meter = " + (cen/100));
		System.out.print("Kilometer = " +(cen/100000));
	}
}

