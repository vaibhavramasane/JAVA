/*2. Count Vowels in File 
Description: 
Read file content and count vowels (a, e, i, o, u), ignoring case. 
Example: 
Hello Java 
Vowels → e, o, a, a 
Output: 4 */

import java.io.*;

class Q2{
	
	public static void main(String x[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		int count =0;
		int c;
		String vowels = "AEIOUaeiou";
		while ((c = br.read()) != -1) {
            char ch = (char) c;

            if (vowels.indexOf(ch) != -1) {  
                count++;
            }
        }
		
		System.out.println("Total Vowels: " + count);
	}
	
}
			
			