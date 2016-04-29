package org.campus02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateiCopy {

	public static void main(String[] args) throws IOException {
		File outFile = new File("/temp/Textdatei.txt");
		File inFile = new File("/temp/Textdatei Kopie.txt");
		
		FileOutputStream fileOut = new FileOutputStream(outFile);
		FileInputStream fileIn = new FileInputStream(inFile);
		
		int data = 0;
		while((data = fileIn.read()) != -1) {
			fileOut.write(data);
		}
		fileIn.close();
		fileOut.flush();
		fileOut.close();

	}

}
