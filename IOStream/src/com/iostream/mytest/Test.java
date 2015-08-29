package com.iostream.mytest;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = "nihao";
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("demo.txt",true),"GB2312");
//		InputStreamReader isr = new InputStreamReader();
		BufferedWriter br = new BufferedWriter(osw);
		osw.write(s);
		osw.flush();
		osw.close();
	}

}
