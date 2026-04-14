/*. Remove Duplicates from Sorted Array 
Description: 
Remove duplicate elements from a sorted list and return the new size. 
Explanation: 
Since the array is sorted, duplicates appear next to each other. 
Example: 
Input → [1,1,2,2,3] 
Output → [1,2,3]  
*/

import java.util.*;
class RemoveDuplicate1{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
			
		}
		//RemoveDuplicate1 obj = new RemoveDuplicate1();
		System.out.println("Output: " + removeduplicates(a));
		
	}
	public static int removeduplicates(int nums[]){
		
		HashSet<Integer> set = new HashSet<>();
		int indx=0;
		for(int n : nums){
			if(!set.contains(n)){
				set.add(n);
				nums[indx]=n;
				indx++;
			}
		}
		return set;
	}
}

		