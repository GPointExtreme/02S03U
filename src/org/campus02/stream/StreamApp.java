package org.campus02.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StreamApp {

	public static void main(String[] args) {
		File dir = new File("/temp/Textdatei.txt");
		
		System.out.println(dir.exists());
		System.out.println(dir.getAbsolutePath());
		
	}
	public static void writeText(File dir) throws IOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter(dir);
			writer.write("Mimi spielt ball");
			writer.flush();
			writer.close();
			
			return;
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
	}
}
