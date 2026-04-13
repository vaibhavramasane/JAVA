import java.io.*;

class Q1 {
    public static void main(String[] args) {
        int wordCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+"); // split by spaces
                wordCount += words.length;
            }

            System.out.println("Total words: " + wordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}