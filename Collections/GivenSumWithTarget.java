/*0. Find All Pairs with Given Sum 
Description: 
Find all pairs of elements whose sum equals a target. 
Example: 
Input → [1,2,3,4,5], target=5 
Output → (1,4), (2,3) 
*/

import java.util.*;
class GivenSumWithTarget{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		System.out.println("Enter target: ");
		int target = xyz.nextInt();
		
		findpairs(a,target);
		
	}
	public static int findpairs(int a[],int target){
		
		HashSet<Integer> set = new HashSet<>();
		int count=0;
		
		System.out.println("Pairs with the sum");
		for(int n : a){
			int comp = target-n;
			if(set.contains(comp)){
				
				System.out.println("(" + comp + ", " + n + ")");
				count++;
				
			}
			set.add(n);
		}
		return count;
	}
}