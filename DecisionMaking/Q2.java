/*Question 2: Write a Java program to check whether a triangle is valid or not.
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side. */
import java.util.*;

public class Q2 {
    
    public static void main(String x[]) {
        
        Scanner xyz = new Scanner(System.in);
        
       
        System.out.print("Enter side A: ");
        int A = xyz.nextInt();
        
        System.out.print("Enter side B: ");
        int B = xyz.nextInt();
        
        System.out.print("Enter side C: ");
        int C = xyz.nextInt();
        
        
        if (A + B > C && B + C > A && A + C > B) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
        
        
    }
}