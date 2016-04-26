package org.campus02.stream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ConsoleReadApp {

	public static void main(String[] args) throws IOException {
		
		File outFile = new File("/temp/Textdatei.txt");
		
		FileOutputStream fileOut = new FileOutputStream(outFile);
		
		BufferedOutputStream buffered = new BufferedOutputStream(fileOut);
		
		int data = 0;
		while((data = System.in.read()) != -1) {
			if ('x' == data) {
				break;
			}
			buffered.write(data);
		}
		buffered.flush();
		buffered.close();
		
		//Reader in = new InputStreamReader(System.in); //Textbasiert lesen
		//BufferedReader consoleReader = new BufferedReader(in); //Zeilenweise lesen
		//String line = consoleReader.readLine();
	}

}
