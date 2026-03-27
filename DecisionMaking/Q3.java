/*Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene
*/

import java.util.*;

public class Q3 {
    
    public static void main(String x[]) {
        
        Scanner xyz = new Scanner(System.in);
        
        System.out.print("Enter side A: ");
        int A = xyz.nextInt();
        
        System.out.print("Enter side B: ");
        int B = xyz.nextInt();
        
        System.out.print("Enter side C: ");
        int C = xyz.nextInt();
        
        if (A == B && B == C) {
            System.out.println("Equilateral");
        } else if (A == B || B == C || A == C) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
        
       
    }
}