/* Question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
Input:
Character = 5

Output:
Digit

Explanation:
Check ASCII ranges.*/
import java.util.*;

class Q10 {
    
    public static void main(String x[]) {
        
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch = xyz.next().charAt(0);
        
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        else {
            System.out.println("Special Character");
        }
    }
}