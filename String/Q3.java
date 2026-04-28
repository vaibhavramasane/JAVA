/*3. Find Longest Word 
Description: 
Read all words and identify the word with maximum length. 
Example: 
Java programming language 
Longest word → programming 
Output: programming  */

import java.util.*;
import java.io.*;

class Q3{
	
	public static void main(String x[]) throws IOException{
		
		BufferedWriter br = new BufferedWriter(new FileWriter("data.txt"));
		
		Scanner xyz = new Scanner(br);
		System.out.println("Enter Input: ");
		String data = xyz.nextLine();
		
		br.write(data);
		xyz.nextLine();
		System.out.println("save sucessfully:");
		br.close();
	}
}