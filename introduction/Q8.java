/*Question 8: Write a Java program to convert temperature from Celsius to Fahrenheit.
Input:
Celsius = 37

Output:
Fahrenheit = 98.6

Explanation:
The formula used is:
F = (C × 9 / 5) + 32
The Celsius value is converted into Fahrenheit using this formula */

import java.util.*;

public class Q8{
	
	public static void main(String args[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Celsius: ");
		float cel = xyz.nextFloat();
		
		float fah = ((cel * 9 / 5) + 32);
		System.out.println("Fahrenheit = " + fah);
		
	}
}
