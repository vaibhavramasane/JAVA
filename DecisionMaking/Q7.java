/*Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If SP > CP ? Profit
If SP < CP ? Loss */
import java.util.*;
class Q7{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("cost price: ");
		int cp = xyz.nextInt();
		
		System.out.println("Selling Price: ");
		int sp = xyz.nextInt();
		
		String str = sp>cp?"Profit":"Loss";
		System.out.println(str);
		
	}
}