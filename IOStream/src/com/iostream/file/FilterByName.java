package com.iostream.file;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByName implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
//		String[] names = dir.list();
		System.out.println(dir+name);
		return name.endsWith(".MP3");
	}

}
