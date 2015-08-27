package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo2.txt");
		LineNumberReader lr = new LineNumberReader(fr);
		
		String line = null;
		while((line = lr.readLine())!=null)
			System.out.println(lr.getLineNumber()+":"+line);
	}

}
