package com.iostream.zifuliu;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：将一些文字存储到硬盘的一个文件中
 * 硬盘的数据的基本体现是文件。
 */
public class FileWriterDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException{
		//创建一个可以往文件中写入字符数据的字符输出流对象
		/*
		 * 既然是往一个文件中写入文字数据，那么在创建对象时，就必须
		 * 明确该文件（用于存储数据段目的地）
		 * 
		 * 如果文件不存在，则会自动创建。
		 * 如果文件存在，则会被覆盖。
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		/*
		 * 调用Writer对象中的write(String)方法，写入数据。
		 * 这个数据写入到了临时缓冲区中（即写入到流中）
		 */
		
		fw.write("你好，我换行了！");
		fw.write("hihi~~"+LINE_SEPARATOR);
		/*
		 * 进行刷新，将数据直接写到目的地中
		 */
		fw.flush();
		/*
		 * 关闭流，关闭资源
		 * 注意，调用close时，其内部也会自动调用flush()方法
		 */
		fw.close();
	}

}
