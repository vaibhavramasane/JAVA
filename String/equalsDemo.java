// compair without using compairto() and equals()

import java.util.*;
class equalsDemo{
	
	public static void main(String x[]){
		
		String s1 = " Onkar ";// every time create new object 
		String s2 = " Onkar ";
		
		boolean isEquals = false;
		
		if(s1.length()!=s2.length()) isEquals=false;
		else{
			for(int i=0; i<s2.length(); i++){
				if(s1.charAt(i)!=s2.charAt(i)){
					isEquals= false;
					break;
				}
			}
			
		}
		System.out.println(isEquals?"Equal": "Not Equal");
			
	}
}
