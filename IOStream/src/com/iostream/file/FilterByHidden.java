package com.iostream.file;

import java.io.File;
import java.io.FileFilter;

public class FilterByHidden implements FileFilter {
/*
 * 文件过滤，找出非隐藏文件
 * @see java.io.FileFilter#accept(java.io.File)
 */
	@Override
	public boolean accept(File pathname) {
		
		return pathname.isHidden();
	}

}
