/*Question 4: Write a Java program to display even & odd index values from an array.
Input:
Array Size = 6
Array Elements = 5 10 15 20 25 30
Output:
Values at Even Index = 5 15 25
Values at Odd Index = 10 20 30
 */
 
import java.util.*;

class Q4{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size:" );
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		System.out.println("Even Indexes: ");
		for(int i=0; i<a.length; i++){
			
			if(i % 2==0){
				
				 System.out.print(a[i] + " ");
				
			}
		}
		System.out.println("Odd Indexes: ");
		for(int i=0; i<a.length; i++){
			
			if(i % 2==1){
				
				 System.out.print(a[i] + " ");
				
			}
		}
		
	}
}