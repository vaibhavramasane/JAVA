/*Question 3: Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.
Input:
Number1 = 20
Number2 = 5

Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0
 */
 
import java.util.*;
public class Q3{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int n1,n2;
		n1 = xyz.nextInt();
		n2 = xyz.nextInt();
		
		System.out.println("Addition = " +(n1 + n2));
		System.out.println("Subtraction = " +(n1 - n2));
		System.out.println("Multiplication = " +(n1 * n2));
		System.out.println("Division = " +(n1 / n2));
		System.out.println("Modulus = " +(n1 % n2));
	}
}
