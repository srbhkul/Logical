package Rivision;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class countFromFile {

	public static void main(String[] args) throws IOException {
		String line;
		int count=0;
		
		FileReader file = new FileReader("D:\\mgk.txt");  
        BufferedReader br = new BufferedReader(file);  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        } 
        
        System.out.println("number words count present in given file "+count );
br.close();
        
	}

}
