/* Question 16: Write a Java program to calculate the average of all elements present in an integer array.
Input Array:
[10, 20, 30, 40, 50]
Output:
Average of array elements = 30Explanation
? The average of array elements is calculated by:
Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements
? First, iterate through the array and add all elements to a variable sum.
? Then divide sum by the total number of elements (array.length) to get the average*/

import java.util.*;

class Q16{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n= xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter element in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int sum = 0;
		double avg = 0.0;
		for(int i=0; i<a.length; i++){
			
			sum+=a[i];
			
		}
		avg= sum/a.length;
		System.out.println("Average of Integer: " + avg);
	}
}
		