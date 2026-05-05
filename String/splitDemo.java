import java.util.*;

class splitDemo{
	
	public static void main(String x[]){
		
		
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = xyz.nextLine();
		
		//for(int i=0; i<s.length(); i++){
			
			
		
		// split String 
		// first string convert into array then split them
		
		String w[] = s.split(" ");
		System.out.println("Length of Words: " + w.length);
		
		
	}
}

