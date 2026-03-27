/*Question 7: Write a Java program to convert temperature from Fahrenheit to Celsius.
Input:
Fahrenheit = 98

Output:
Celsius = 36.67

Explanation:
The formula used is:
C = (F - 32) × 5 / 9
Applying the formula gives the Celsius temperature. */

import java.util.*;
public class Q7{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Fahrenheit:");
		float fah = xyz.nextFloat();
		
		System.out.println("Celsius = " + (fah-32) * 5/9);
	}
}



