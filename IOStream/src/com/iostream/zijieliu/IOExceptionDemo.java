package com.iostream.zijieliu;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("k:\\demo.txt",true);
			fw.write("你好，我换行了！");
			fw.write("hihi~~"+LINE_SEPARATOR);			
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally{
			if(fw!=null)//只有在指定路径文件存在的情况下，才能进行关闭文件操作
			{
				try{
					fw.close();		//close必须执行，所以放在finally代码块中		
				}catch(IOException e)
				{
					throw new RuntimeException("关闭失败！");
				}
			}
		}
	}

}
