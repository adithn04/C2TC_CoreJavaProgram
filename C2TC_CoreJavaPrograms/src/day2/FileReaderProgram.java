package day2;

import java.net.URL;
import java.io.*;

public class FileReaderProgram {

	public static void main(String[] args) throws IOException {
		
		URL resourse =FileReaderProgram.class.getResource("sample.txt");
		
		if (resourse == null) {
			System.err.println("File not found");
			return;
		}
		
		File file = new File(resourse.getFile());
		FileReader filereader = new FileReader(file);
		BufferedReader reader = new BufferedReader(filereader);
		
		String line;
		while((line= reader.readLine())!= null) {
			System.out.println(line);
		}
		
		reader.close();
		
		

	}

}
