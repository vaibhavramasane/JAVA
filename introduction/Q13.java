/*Question 13: Write a Java program to calculate compound interest.
Input:
Principal = 2000
Rate = 10
Time = 2

Output:
Compound Interest = 420

Explanation:
Compound Interest is calculated using the formula:
CI = P(1 + R/100)^T ? P
After calculation, the compound interest is 420. */
import java.util.*;

class Q13 {
    public static void main(String x[]) {

        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter Principal: ");
        double p = xyz.nextDouble();

        System.out.println("Enter Rate: ");
        double r = xyz.nextDouble();

        System.out.println("Enter Time: ");
        double t = xyz.nextDouble();

        double amount = p * Math.pow((1 + r / 100), t);

        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
    }
}