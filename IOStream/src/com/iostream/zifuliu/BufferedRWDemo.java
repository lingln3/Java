package com.iostream.zifuliu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("copy2_demo2.txt");
		FileReader fr = new FileReader("demo2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
//		int ch = 0;
//		while((ch = br.read())!= -1)
//			bw.write(ch);
		String str = null;
		while((str = br.readLine())!=null)
			bw.write(str+LINE_SEPARATOR);
		bw.close();
		br.close();
	}

}
