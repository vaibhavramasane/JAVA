// Reverse Each words

import java.util.*;

class ReverseEachWord{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter String : ");
		String k = xyz.nextLine();
		
		String w[] = k.split(" ");
		
		for(String word : w){
			String rev = " ";
			
		
		
			for(int i=word.length()-1; i>=0;i--){
			
				rev+=word.charAt(i);
			}
			System.out.println(rev + " ");
		}
		
		
	}
}


