// Remove White Spaces 

import java.util.*;

class RemoveWhiteSpace{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = xyz.nextLine();
		
		String result = "";

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				result += s.charAt(i);
			}
		}

		System.out.println(result);
	}
}

