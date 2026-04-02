/*Question 10: Write a program in java to delete an element at desired position from an array.
Input the size of array : 5

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to delete : 3

Expected Output : The new list is : 1 2 3 5 */

import java.util.*;

class Q10 {

    public static void main(String x[]) {

        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = xyz.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("Enter pos:");
        int p = xyz.nextInt();

        int res[] = deleteNum(a, p);

        System.out.print("The new list is : ");
        for (int i = 0; i < res.length - 1; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] deleteNum(int a[], int p) {

        int index = p - 1;

        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        return a;
    }
}
			
		
		
		