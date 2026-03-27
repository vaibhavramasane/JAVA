/*Question 9: Write a Java program to enter two angles of a triangle and find the third angle.
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180°.
Third Angle = 180 ? (Angle1 + Angle2 */

import java.util.*;

public class Q9{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Angle1: ");
		int angle1 = xyz.nextInt();
		
		System.out.println("Enter Angle2: ");
		int angle2 = xyz.nextInt();
		
		int angle3 = 180-(angle1 + angle2);
		System.out.println("Third angle = " + angle3);
		
	}
}